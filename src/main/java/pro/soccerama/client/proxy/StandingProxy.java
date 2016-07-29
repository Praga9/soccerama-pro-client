package pro.soccerama.client.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mashape.unirest.http.HttpResponse;

import pro.soccerama.client.bean.entity.Standing;
import pro.soccerama.client.bean.structure.StandingResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.tools.SocceramaRest;

/**
 * Proxy Teams
 */
public class StandingProxy extends SocceramaProxy {

	private static final String BASE_URL = "https://api.soccerama.pro/" + SocceramaProxy.VERSION + "/standings";
	private static final String BY_SEASON_URL = BASE_URL + "/season/{seasonId}";

	private static StandingProxy INSTANCE;

	private StandingProxy() {
		// Hide constructor
	}

	/**
	 * Singleton
	 *
	 * @return
	 */
	public static StandingProxy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new StandingProxy();
		}

		return INSTANCE;
	}

	/**
	 * Liste de toutes les équipes d'une saison
	 *
	 * @param seasonId
	 * @return
	 */
	public List<Standing> findBySeason(final Integer seasonId) {
		final StandingProxyParams params = new StandingProxyParams();
		params.setSeasonId(seasonId);
		return findBySeason(params);
	}

	/**
	 * Liste de toutes les équipes pour une saison avec les relations définies
	 */
	public List<Standing> findBySeason(final StandingProxyParams params) {

		if (!params.isValidSeasonId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BY_SEASON_URL, params);
	}

	/**
	 * Retourne une liste de résultat
	 *
	 * @param url
	 * @param params
	 * @return
	 */
	private List<Standing> findResults(final String url, final StandingProxyParams params) {

		waitBeforeNextCall();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", "");
			if (params.isValidSeasonId()) {
				paramsMap.put("seasonId", params.getSeasonId().toString());
			}
		}

		final HttpResponse<StandingResponse> httpResponse = SocceramaRest.get(url, paramsMap, StandingResponse.class);

		return httpResponse.getBody().getStandings();
	}

}
