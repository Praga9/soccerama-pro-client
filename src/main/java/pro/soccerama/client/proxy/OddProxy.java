package pro.soccerama.client.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mashape.unirest.http.HttpResponse;

import pro.soccerama.client.bean.structure.OddBookmaker;
import pro.soccerama.client.bean.structure.OddsResponse;
import pro.soccerama.client.exception.HaveToDefineValidDateException;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.tools.SocceramaRest;

/**
 * Proxy Teams
 */
public class OddProxy extends SocceramaProxy {

	private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/odds";
	private static final String BY_MATCH_URL = BASE_URL + "/match/{matchId}";
	private static final String BY_MATCH_AND_BOOKMAKER_URL = BY_MATCH_URL + "/bookmaker/{bookmakerId}";
	private static final String BY_BOOKMAKER_AND_DATE_URL = BASE_URL + "/bookmaker/{bookmakerId}/date/{date}";

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
	 *
	 * @param matchId
	 * @param bookmakerId
	 * @return
	 */
	public List<OddBookmaker> findByMatchAndBookmaker(final Integer matchId, final Integer bookmakerId) {
		final OddProxyParams params = new OddProxyParams();
		params.setMatchId(matchId);
		params.setBookmakerId(bookmakerId);
		return findByMatchAndBookmaker(params);
	}

	/**
	 *
	 * @param bookmakerId
	 * @param date
	 * @return
	 */
	public List<OddBookmaker> findByBookmakerAndDate(final Integer bookmakerId, final String date) {
		final OddProxyParams params = new OddProxyParams();
		params.setDate(date);
		params.setBookmakerId(bookmakerId);
		return findByBookmakerAndDate(params);
	}

	public List<OddBookmaker> findByBookmakerAndDate(final OddProxyParams params){

		if (!params.isValidBookmakerId()) {
			throw new HaveToDefineValidIdException();
		}

		if (!params.isValidDate()) {
			throw new HaveToDefineValidDateException();
		}

		return findResults(BY_BOOKMAKER_AND_DATE_URL, params);
	}

	/**
	 *
	 * @param params
	 * @return
     */
	public List<OddBookmaker> findByMatch(final OddProxyParams params) {

		if (!params.isValidMatchId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BY_MATCH_URL, params);
	}

	/**
	 *
	 * @param params
	 * @return
     */
	public List<OddBookmaker> findByMatchAndBookmaker(final OddProxyParams params) {

		if (!params.isValidMatchId() || !params.isValidBookmakerId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BY_MATCH_AND_BOOKMAKER_URL, params);
	}

	/**
	 *
	 * @param url
	 * @param params
     * @return
     */
	private List<OddBookmaker> findResults(final String url, final OddProxyParams params) {

		waitBeforeNextCall();

		final List<OddBookmaker> response = new ArrayList<>();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", "");
			if (params.isValidMatchId()) {
				paramsMap.put("matchId", params.getMatchId().toString());
			}
			if (params.isValidBookmakerId()) {
				paramsMap.put("bookmakerId", params.getMatchId().toString());
			}
			if(params.isValidDate()){
				paramsMap.put("date", params.getDate());
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
