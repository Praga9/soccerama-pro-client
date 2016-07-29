package pro.soccerama.client.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mashape.unirest.http.HttpResponse;

import pro.soccerama.client.bean.entity.Match;
import pro.soccerama.client.bean.structure.LivescoreResponse;
import pro.soccerama.client.exception.HaveToDefineValidDateException;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

/**
 * Proxy Matchs
 */
public class LivescoreProxy extends SocceramaProxy {

	private static final String BASE_URL = "https://api.soccerama.pro/"+SocceramaProxy.VERSION+"/livescore";
	private static final String CURRENTLY_PLAYED_URL = BASE_URL + "/now";
	private static final String BY_DATE_URL = BASE_URL + "/date/{date}";
	private static final String BY_MATCH_URL = BASE_URL + "/match/{matchId}";

	private static LivescoreProxy INSTANCE;

	private LivescoreProxy() {
		// Hide constructor
	}

	/**
	 * Singleton
	 *
	 * @return
	 */
	public static LivescoreProxy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LivescoreProxy();
		}

		return INSTANCE;
	}

	/**
	 * @param url
	 * @param params
	 * @return {@link Match}
	 */
	private Match findOne(final String url, final LivescoreProxyParams params) {

		waitBeforeNextCall();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidMatchId()) {
				paramsMap.put("matchId", params.getMatchId().toString());
			}
			if (params.isValidDate()) {
				paramsMap.put("date", params.getDate());
			}
		}

		final HttpResponse<Match> httpResponse = SocceramaRest.get(url, paramsMap, Match.class);
		return httpResponse.getBody();
	}

	/**
	 * @param url
	 * @param params
	 * @return {@linkList<{@link Match}>}
	 */
	private List<Match> find(final String url, final LivescoreProxyParams params) {

		waitBeforeNextCall();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidDate()) {
				paramsMap.put("date", params.getDate());
			}
		}

		final HttpResponse<LivescoreResponse> httpResponse = SocceramaRest.get(url, paramsMap, LivescoreResponse.class);
		return httpResponse.getBody().getData();
	}

	/**
	 * @param MatchId
	 * @return
	 * @throws NotFoundException
	 */
	public Match findByMatch(final Integer MatchId) throws NotFoundException {
		final LivescoreProxyParams params = new LivescoreProxyParams();
		params.setMatchId(MatchId);
		return findByMatch(params);
	}

	/**
	 * Liste de toutes les livescores autorisées avec les relations définies
	 */
	public Match findByMatch(final LivescoreProxyParams params) {

		if (!params.isValidMatchId()) {
			throw new HaveToDefineValidIdException();
		}
		params.setDate(null);
		return findOne(BY_MATCH_URL, params);
	}

	/**
	 * @param date YYYY-MM-DD
	 * @return
	 * @throws NotFoundException
	 */
	public List<Match> findByDate(final String date) throws NotFoundException {
		final LivescoreProxyParams params = new LivescoreProxyParams();
		params.setDate(date);
		return findByDate(params);
	}

	/**
	 * Liste de toutes les livescores autorisées avec les relations définies
	 */
	public List<Match> findByDate(final LivescoreProxyParams params) {

		if (!params.isValidDate()) {
			throw new HaveToDefineValidDateException();
		}
		params.setMatchId(null);
		return find(BY_DATE_URL, params);
	}

	/**
	 * @return
	 * @throws NotFoundException
	 */
	public List<Match> findToday() throws NotFoundException {
		final LivescoreProxyParams params = new LivescoreProxyParams();
		return findToday(params);
	}

	/**
	 * Liste de toutes les livescores autorisées avec les relations définies
	 */
	public List<Match> findToday(final LivescoreProxyParams params) {

		params.setDate(null);
		params.setMatchId(null);
		return find(BASE_URL, params);
	}

	/**
	 * @param
	 * @return
	 * @throws NotFoundException
	 */
	public List<Match> findCurrentlyPlayed(){
		final LivescoreProxyParams params = new LivescoreProxyParams();
		return findCurrentlyPlayed(params);
	}

	/**
	 * Liste de toutes les livescores autorisées avec les relations définies
	 */
	public List<Match> findCurrentlyPlayed(final LivescoreProxyParams params) {
		params.setMatchId(null);
		params.setDate(null);
		return find(CURRENTLY_PLAYED_URL, params);
	}

	/**
	 * Matches relations
	 */
	public enum Relation {
		league, season, homeTeam, awayTeam, venue, events, lineup, homeStats, awayStats, commentaries
	}

}
