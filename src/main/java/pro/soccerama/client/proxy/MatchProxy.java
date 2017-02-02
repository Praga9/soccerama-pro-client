package pro.soccerama.client.proxy;

import com.mashape.unirest.http.HttpResponse;
import org.apache.log4j.Logger;
import pro.soccerama.client.bean.entity.Match;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

import java.util.HashMap;
import java.util.Map;

/**
 * Proxy Matchs
 */
public class MatchProxy extends SocceramaProxy {

    private static final Logger LOGGER = Logger.getLogger(MatchProxy.class);

    private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/matches";
    private static final String BY_ID_URL = BASE_URL + "/{id}";
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
     * Liste de toutes les matches autorisées avec les relations définies
     */
    public Match findOne(final MatchProxyParams params) {

        if (!params.isValidId()) {
            throw new HaveToDefineValidIdException();
        }

        return find(BY_ID_URL, params);
    }

    /**
     * Matches relations
     */
    public enum Relation {
        competition, season, homeTeam, awayTeam, venue, events, lineup, homeStats, awayStats, commentaries, odds, videos
    }

}
