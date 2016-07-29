package pro.soccerama.client.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pro.soccerama.client.bean.entity.MatchTeamStats;
import pro.soccerama.client.exception.HaveToDefineValidIdException;

/**
 * Proxy Teams
 */
public class MatchStatisticsProxy extends SocceramaProxy {

	private static final String BASE_URL = "https://api.soccerama.pro/" + SocceramaProxy.VERSION + "/statistics";
	private static final String BY_MATCH_URL = BASE_URL + "/match/{matchId}";

	private static MatchStatisticsProxy INSTANCE;

	private MatchStatisticsProxy() {
		// Hide constructor
	}

	/**
	 * Singleton
	 *
	 * @return
	 */
	public static MatchStatisticsProxy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MatchStatisticsProxy();
		}

		return INSTANCE;
	}

	/**
	 * Liste de toutes les équipes d'une saison
	 *
	 * @param seasonId
	 * @return
	 */
	public List<MatchTeamStats> findBySeason(final Integer seasonId) {
		final MatchStatisticsProxyParams params = new MatchStatisticsProxyParams();
		params.setMatchId(seasonId);
		return findByMatch(params);
	}

	/**
	 * Liste de toutes les équipes pour une saison avec les relations définies
	 */
	public List<MatchTeamStats> findByMatch(final MatchStatisticsProxyParams params) {

		if (!params.isValidMatchId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BY_MATCH_URL, params);
	}

	/**
	 * Retourne une liste de résultat
	 *
	 * @param url
	 * @param params
	 * @return
	 */
	private List<MatchTeamStats> findResults(final String url, final MatchStatisticsProxyParams params) {

		waitBeforeNextCall();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidMatchId()) {
				paramsMap.put("matchId", params.getMatchId().toString());
			}
		}

		//TODO final HttpResponse<MatchStatisticsResponse> httpResponse = SocceramaRest.get(url, paramsMap, MatchStatisticsResponse.class);

		// return httpResponse.getBody().get();
		return null;
	}

	/**
	 * Matches stats relations
	 */
	public enum Relation {
		team, match
	}
}
