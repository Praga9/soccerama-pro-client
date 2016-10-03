package pro.soccerama.client.proxy;

import com.mashape.unirest.http.HttpResponse;
import pro.soccerama.client.bean.entity.Season;
import pro.soccerama.client.bean.structure.SeasonResponse;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Proxy Seasons
 */
public class SeasonProxy extends SocceramaProxy {

    private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/seasons";
    private static final String BY_ID_URL = BASE_URL + "/{id}";
    private static SeasonProxy INSTANCE;

    private SeasonProxy() {
        // Hide constructor
    }

    /**
     * Singleton
     *
     * @return
     */
    public static SeasonProxy getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SeasonProxy();

        return INSTANCE;
    }

    /**
     * Retourne la liste de toutes les saisons autorisées
     *
     * @return {@List<@Season>}
     */
    public List<Season> findAll() {
        return findAll(null);
    }

    /**
     * Liste de toutes les saisons autorisées avec les relations définies
     */
    public List<Season> findAll(final SeasonProxyParams params) {
        if(null != params) {
            params.setSeasonId(null);
        }
        return find(BASE_URL, params);
    }

    private List<Season> find(final String url, final SeasonProxyParams params) {

        waitBeforeNextCall();

        final Map<String, String> paramsMap = new HashMap<>();
        if (params != null) {
            paramsMap.put("includes", params.getRelations());
            if (params.isValidId()) {
                paramsMap.put("id", params.getSeasonId().toString());
            }
        }

        final HttpResponse<SeasonResponse> httpResponse = SocceramaRest.get(url, paramsMap, SeasonResponse.class);

        final List<Season> response = new ArrayList<>();
        response.addAll(httpResponse.getBody().getData());

        return response;
    }

    /**
     * @param seasonId
     * @return
     * @throws NotFoundException
     */
    public Season findOne(final Integer seasonId) throws NotFoundException {
        final SeasonProxyParams params = new SeasonProxyParams();
        params.setSeasonId(seasonId);
        return findOne(params);
    }

    /**
     * Retourne un résultat unique
     *
     * @param params
     * @return
     */
    public Season findOne(final SeasonProxyParams params) {

        waitBeforeNextCall();

        final Map<String, String> paramsMap = new HashMap<>();
        if (params != null) {
            paramsMap.put("includes", params.getRelations());
            if (params.isValidId()) {
                paramsMap.put("id", params.getSeasonId().toString());
            }
        }

        final HttpResponse<Season> httpResponse = SocceramaRest.get(BY_ID_URL, paramsMap, Season.class);

        return httpResponse.getBody();
    }


    /**
     * Seasoon relations
     */
    public enum Relation {
        matches, league, rounds, stages
    }

}
