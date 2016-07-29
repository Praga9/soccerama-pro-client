package pro.soccerama.client.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mashape.unirest.http.HttpResponse;

import pro.soccerama.client.bean.entity.Match;
import pro.soccerama.client.bean.entity.Team;
import pro.soccerama.client.bean.structure.TeamMatches;
import pro.soccerama.client.bean.structure.TeamsResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

/**
 * Proxy Teams
 */
public class TeamProxy extends SocceramaProxy {

	private static final String BASE_URL = "https://api.soccerama.pro/" + SocceramaProxy.VERSION + "/teams";
	private static final String BY_ID_URL = BASE_URL + "/{teamId}";
	private static final String BY_SEASON_URL = BASE_URL + "/season/{seasonId}";
	private static final String MATCHES_BY_SEASON_URL = BASE_URL + "/{teamId}/season/{seasonId}";



	private static TeamProxy INSTANCE;

	private TeamProxy() {
		// Hide constructor
	}

	/**
	 * Singleton
	 *
	 * @return
	 */
	public static TeamProxy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new TeamProxy();
		}

		return INSTANCE;
	}

	/**
	 * @param teamId
	 * @return
	 * @throws NotFoundException
	 */
	public Team findOne(final Integer teamId) throws NotFoundException {
		final TeamProxyParams params = new TeamProxyParams();
		params.setTeamId(teamId);
		return findOne(params);
	}

	/**
	 * Liste de toutes les équipe d'une saison avec les relations définies
	 *
	 * @param params
	 * @return
	 * @throws NotFoundException
	 */
	public Team findOne(final TeamProxyParams params) throws NotFoundException {

		if (!params.isValidTeamId()) {
			throw new HaveToDefineValidIdException();
		}

		return findUnique(BY_ID_URL, params);
	}

	/**
	 * Liste de toutes les équipes d'une saison
	 *
	 * @param seasonId
	 * @return
	 */
	public List<Team> findBySeason(final Integer seasonId) {
		final TeamProxyParams params = new TeamProxyParams();
		params.setSeasonId(seasonId);
		return findBySeason(params);
	}

	/**
	 * Liste de toutes les équipes pour une saison avec les relations définies
	 */
	public List<Team> findBySeason(final TeamProxyParams params) {

		if (!params.isValidSeasonId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BY_SEASON_URL, params);
	}

	/**
	 * Liste des matches pour une équipe et une saison définie
	 *
	 */
	public List<Match> findMatchesByTeamAndSeason(final Integer teamId, final Integer seasonId) {
		final TeamProxyParams params = new TeamProxyParams();
		params.setSeasonId(seasonId);
		params.setTeamId(teamId);

		return findMatchesByTeamAndSeason(params);
	}

	/**
	 * Liste des matches pour une équipe et une saison définie
	 *
	 */
	public List<Match> findMatchesByTeamAndSeason(final TeamProxyParams params) {

		if (!params.isValidTeamId()) {
			throw new HaveToDefineValidIdException("teamId");
		}
		if (!params.isValidSeasonId()) {
			throw new HaveToDefineValidIdException("seasonId");
		}

		return findMatches(MATCHES_BY_SEASON_URL, params);
	}

	/**
	 * Retourne une liste de match
	 *
	 * @param url
	 * @param params
	 * @return
	 */
	private List<Match> findMatches(final String url, final TeamProxyParams params) {

		waitBeforeNextCall();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			paramsMap.put("teamId", params.getTeamId().toString());
			paramsMap.put("seasonId", params.getSeasonId().toString());
		}

		final HttpResponse<Team> httpResponse = SocceramaRest.get(url, paramsMap, Team.class);

		final List<Match> matches = new ArrayList<>();

		final Team team = httpResponse.getBody();
		if (team != null) {
			final TeamMatches teamMatches = team.getMatches();
			matches.addAll(teamMatches.getData());
		}

		return matches;
	}

	/**
	 * Retourne une liste de résultat
	 *
	 * @param url
	 * @param params
	 * @return
	 */
	private List<Team> findResults(final String url, final TeamProxyParams params) {

		waitBeforeNextCall();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidTeamId()) {
				paramsMap.put("teamId", params.getTeamId().toString());
			}
			if (params.isValidSeasonId()) {
				paramsMap.put("seasonId", params.getSeasonId().toString());
			}
		}

		final HttpResponse<TeamsResponse> httpResponse = SocceramaRest.get(url, paramsMap, TeamsResponse.class);

		final List<Team> response = new ArrayList<>();
		response.addAll(httpResponse.getBody().getData());

		return response;
	}

	/**
	 * Retourne un résultat unique
	 *
	 * @param url
	 * @param params
	 * @return
	 */
	private Team findUnique(final String url, final TeamProxyParams params) {

		waitBeforeNextCall();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidTeamId()) {
				paramsMap.put("teamId", params.getTeamId().toString());
			}
		}

		final HttpResponse<Team> httpResponse = SocceramaRest.get(url, paramsMap, Team.class);

		return httpResponse.getBody();
	}

	/**
	 * Team relations
	 */
	public enum Relation {
		players, venue
	}

}
