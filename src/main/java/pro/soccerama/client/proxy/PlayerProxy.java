package pro.soccerama.client.proxy;

import com.mashape.unirest.http.HttpResponse;
import pro.soccerama.client.bean.entity.Player;
import pro.soccerama.client.bean.structure.PlayersResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Proxy Players
 */
public class PlayerProxy extends SocceramaProxy {

	private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/players";
	private static final String BY_ID_URL = BASE_URL + "/{playerId}";
	private static final String BY_TEAM_URL = BASE_URL + "/team/{teamId}";

	private static PlayerProxy INSTANCE;
	private long lastPlayerProxyCall = 0;

	private PlayerProxy() {
		// Hide constructor
	}

	/**
	 * Singleton
	 *
	 * @return
	 */
	public static PlayerProxy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PlayerProxy();
		}

		return INSTANCE;
	}

	/**
	 * @param url
	 * @param params
	 * @return
	 */
	private Player findUnique(final String url, final PlayerProxyParams params) {

		lastPlayerProxyCall = waitBeforeNextCall(lastPlayerProxyCall);

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidPlayerId()) {
				paramsMap.put("playerId", params.getPlayerId().toString());
			}
		}

		final HttpResponse<Player> httpResponse = SocceramaRest.get(url, paramsMap, Player.class);
		return httpResponse.getBody();
	}

	/**
	 * @param url
	 * @param params
	 * @return
	 */
	private List<Player> findResults(final String url, final PlayerProxyParams params) {

		lastPlayerProxyCall = waitBeforeNextCall(lastPlayerProxyCall);

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidTeamId()) {
				paramsMap.put("teamId", params.getTeamId().toString());
			}
		}

		final HttpResponse<PlayersResponse> httpResponse = SocceramaRest.get(url, paramsMap, PlayersResponse.class);
		final PlayersResponse body = httpResponse.getBody();
		return body.getPlayers();
	}

	/**
	 * @param playerId
	 * @return
	 * @throws NotFoundException
	 */
	public Player findOne(final Integer playerId) throws NotFoundException {
		final PlayerProxyParams params = new PlayerProxyParams();
		params.setPlayerId(playerId);
		return findOne(params);
	}

	/**
	 * Liste de toutes les matches autorisées avec les relations définies
	 */
	public Player findOne(final PlayerProxyParams params) {

		if (!params.isValidPlayerId()) {
			System.out.println("Invalid player id : " + params.getPlayerId());
			throw new HaveToDefineValidIdException(params.getPlayerId());
		}

		return findUnique(BY_ID_URL, params);
	}

	/**
	 * @param
	 * @return
	 * @throws NotFoundException
	 */
	public Player findByTeam(final Integer teamId) throws NotFoundException {
		final PlayerProxyParams params = new PlayerProxyParams();
		params.setTeamId(teamId);
		return findOne(params);
	}

	/**
	 * Liste de toutes les matches autorisées avec les relations définies
	 */
	public List<Player> findByTeam(final PlayerProxyParams params) {

		if (!params.isValidTeamId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BY_TEAM_URL, params);
	}

	/**
	 * Players relations
	 */
	public enum Relation {
		team, seasons, events, lineups, position
	}

}
