package pro.soccerama.client.proxy;

import com.mashape.unirest.http.HttpResponse;
import pro.soccerama.client.bean.entity.Match;
import pro.soccerama.client.bean.entity.Team;
import pro.soccerama.client.bean.entity.Video;
import pro.soccerama.client.bean.structure.TeamMatches;
import pro.soccerama.client.bean.structure.TeamsResponse;
import pro.soccerama.client.bean.structure.VideosResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Proxy Teams
 */
public class VideoProxy extends SocceramaProxy {

	private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/videos/match/{matchId}";


	private static VideoProxy INSTANCE;

	private VideoProxy() {
		// Hide constructor
	}

	/**
	 * Singleton
	 *
	 * @return
	 */
	public static VideoProxy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new VideoProxy();
		}

		return INSTANCE;
	}


	/**
	 * Liste de toutes les videos d'une rencontre
	 *
	 * @param matchId
	 * @return
	 */
	public List<Video> findByMatch(final Integer matchId) {
		final VideoProxyParams params = new VideoProxyParams();
		params.setMatchId(matchId);
		return findByMatch(params);
	}

	/**
	 * Liste de toutes les équipes pour une saison avec les relations définies
	 */
	public List<Video> findByMatch(final VideoProxyParams params) {

		if (!params.isValidMatchId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BASE_URL, params);
	}


	/**
	 * Retourne une liste de résultat
	 *
	 * @param url
	 * @param params
	 * @return
	 */
	private List<Video> findResults(final String url, final VideoProxyParams params) {

		waitBeforeNextCall();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidMatchId()) {
				paramsMap.put("matchId", params.getMatchId().toString());
			}
		}

		final HttpResponse<VideosResponse> httpResponse = SocceramaRest.get(url, paramsMap, VideosResponse.class);

		final List<Video> response = new ArrayList<>();
		response.addAll(httpResponse.getBody().getData());

		return response;
	}


	/**
	 * Video relations
	 */
	public enum Relation {

	}

}
