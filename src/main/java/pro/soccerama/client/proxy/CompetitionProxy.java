package pro.soccerama.client.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mashape.unirest.http.HttpResponse;

import pro.soccerama.client.bean.entity.Competition;
import pro.soccerama.client.bean.structure.CompetitionsResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

public class CompetitionProxy extends SocceramaProxy {

	private static final String BASE_URL = SocceramaProxy.API_URL+SocceramaProxy.VERSION+"/competitions";
	private static final String BY_ID_URL = BASE_URL + "/{id}";
	private static CompetitionProxy INSTANCE;

	private CompetitionProxy() {
		// Hide constructor
	}

	/**
	 * Singleton
	 *
	 * @return
	 */
	public static CompetitionProxy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CompetitionProxy();
		}

		return INSTANCE;
	}

	/**
	 * Retourne la liste de toutes les compétitions autorisées
	 *
	 * @return {@List<@Competition>}
	 */
	public List<Competition> findAll() {
		return findAll(null);
	}

	/**
	 * Liste de toutes les competitions autorisées avec les relations définies
	 */
	public List<Competition> findAll(final CompetitionProxyParams params) {
		params.setCompetitionId(null);
		return find(BASE_URL, params);
	}

	private List<Competition> find(final String url, final CompetitionProxyParams params) {

		waitBeforeNextCall();

		final List<Competition> response = new ArrayList<>();

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidCompetitionId()) {
				paramsMap.put("id", params.getCompetitionId().toString());
			}
		}

		final HttpResponse<CompetitionsResponse> httpResponse = SocceramaRest.get(url, paramsMap, CompetitionsResponse.class);
		final CompetitionsResponse body = httpResponse.getBody();
		if(body != null){
			response.addAll(body.getData());
		}

		return response;
	}

	/**
	 * @param competitionId
	 * @return
	 * @throws NotFoundException
	 */
	public Competition findOne(final Integer competitionId) throws NotFoundException {
		final CompetitionProxyParams params = new CompetitionProxyParams();
		params.setCompetitionId(competitionId);
		return findOne(params);
	}

	/**
	 * Liste de toutes les competitions autorisées avec les relations définies
	 */
	public Competition findOne(final CompetitionProxyParams params) throws NotFoundException {

		if (!params.isValidCompetitionId()) {
			throw new HaveToDefineValidIdException();
		}

		final List<Competition> all = find(BY_ID_URL, params);
		if (all.isEmpty()) {
			throw new NotFoundException();
		}

		return all.get(0);
	}


	/**
	 * Competitions relations
	 */
	public enum Relation {
		country, currentSeason, seasons
	}

}
