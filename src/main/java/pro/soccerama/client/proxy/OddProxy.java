package pro.soccerama.client.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mashape.unirest.http.HttpResponse;

import pro.soccerama.client.bean.structure.OddBookmaker;
import pro.soccerama.client.bean.structure.OddsResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.tools.SocceramaRest;

/**
 * Proxy Teams
 */
public class OddProxy extends SocceramaProxy {

	private static final String BASE_URL = "https://api.soccerama.pro/" + SocceramaProxy.VERSION + "/odds/match";
	private static final String BY_ID_URL = BASE_URL + "/{matchId}";

	private static OddProxy INSTANCE;

	private OddProxy() {
		// Hide constructor
	}

	/**
	 * Singleton
	 *
	 * @return
	 */
	public static OddProxy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new OddProxy();
		}

		return INSTANCE;
	}

	/**
	 * Liste de toutes les équipes d'une saison
	 *
	 * @param matchId
	 * @return
	 */
	public List<OddBookmaker> findByMatch(final Integer matchId) {
		final OddProxyParams params = new OddProxyParams();
		params.setMatchId(matchId);
		return findByMatch(params);
	}

	/**
	 * Liste de toutes les équipes pour une saison avec les relations définies
	 */
	public List<OddBookmaker> findByMatch(final OddProxyParams params) {

		if (!params.isValidMatchId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BY_ID_URL, params);
	}

	private List<OddBookmaker> findResults(final String url, final OddProxyParams params) {

		waitBeforeNextCall();

		final List<OddBookmaker> response = new ArrayList<>();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", "");
			if (params.isValidMatchId()) {
				paramsMap.put("matchId", params.getMatchId().toString());
			}
		}

		final HttpResponse<OddsResponse> httpResponse = SocceramaRest.get(url, paramsMap, OddsResponse.class);
		final OddsResponse body = httpResponse.getBody();
		if(body != null){
			return body.getData();
		}

		return response;
	}


}
