package pro.soccerama.client.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.mashape.unirest.http.HttpResponse;

import pro.soccerama.client.bean.entity.Match;
import pro.soccerama.client.bean.structure.MatchesResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

/**
 * Proxy Matchs
 */
public class MatchProxy extends SocceramaProxy {

    private static final Logger LOGGER = Logger.getLogger(MatchProxy.class);

    private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/matches";
    private static final String BY_ID_URL = BASE_URL + "/{id}";
	private static final String BY_DATE_RANGE_URL = BASE_URL + "/{begin}/{end}";
    private static MatchProxy INSTANCE;
    private long lastMatchProxyCall = 0;

    private MatchProxy() {
        // Hide constructor
    }

    /**
     * Singleton
     *
     * @return
     */
    public static MatchProxy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MatchProxy();
        }

        return INSTANCE;
    }

    /**
     * @param url
     * @param params
     * @return
     */
    private Match find(final String url, final MatchProxyParams params) {

        lastMatchProxyCall = waitBeforeNextCall(lastMatchProxyCall);

        final Map<String, String> paramsMap = new HashMap<>();
        if (params != null) {
            paramsMap.put("includes", params.getRelations());
            if (params.isValidId()) {
                paramsMap.put("id", params.getMatchId().toString());
            }
        }

        final HttpResponse<Match> httpResponse = SocceramaRest.get(url, paramsMap, Match.class);
        try {
            return httpResponse.getBody();
        } catch (Exception e) {
            LOGGER.error(e);
            return null;
        }
    }

    /**
     * @param MatchId
     * @return
     * @throws NotFoundException
     */
    public Match findOne(final Integer MatchId) throws NotFoundException {
        final MatchProxyParams params = new MatchProxyParams();
        params.setMatchId(MatchId);
        return findOne(params);
    }

    /**
	 * @param begin
	 * @param end
	 * @return
	 * @throws NotFoundException
	 */
	public List<Match> findByDateRange(final String begin, final String end) throws NotFoundException {
		final MatchProxyParams params = new MatchProxyParams();
		params.setRangeBegin(begin);
		params.setRangeEnd(end);
		return findSeverals(BY_DATE_RANGE_URL, params);
	}

	/**
	 * Liste de toutes les matches autorisées avec les relations définies
	 */
    public Match findOne(final MatchProxyParams params) {

        if (!params.isValidId()) {
            throw new HaveToDefineValidIdException();
        }

        return find(BY_ID_URL, params);
	}

	/**
	 * Liste de toutes les matches autorisées avec les relations définies
	 */
	public List<Match> findSeverals(final String url, final MatchProxyParams params) {

		lastMatchProxyCall = waitBeforeNextCall(lastMatchProxyCall);

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidBeginDate()) {
				paramsMap.put("begin", params.getRangeBegin());
			}
			if (params.isValidBeginDate()) {
				paramsMap.put("end", params.getRangeEnd());
			}
		}

		final HttpResponse<MatchesResponse> httpResponse = SocceramaRest.get(url, paramsMap, MatchesResponse.class);
		try {
			return httpResponse.getBody().getData();
		} catch (Exception e) {
			LOGGER.error(e);
			return new ArrayList<>();
		}
    }

    /**
     * Matches relations
     */
    public enum Relation {
        competition, season, homeTeam, awayTeam, venue, events, lineup, homeStats, awayStats, commentaries, odds, videos
    }

}
