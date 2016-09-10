package pro.soccerama.client.proxy;

import com.mashape.unirest.http.HttpResponse;
import pro.soccerama.client.bean.entity.MatchEvent;
import pro.soccerama.client.bean.structure.MatchEvents;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.tools.SocceramaRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Proxy Teams
 */
public class MatchEventProxy extends SocceramaProxy {

    private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/events/match/{matchId}";


    private static MatchEventProxy INSTANCE;

    private MatchEventProxy() {
        // Hide constructor
    }

    /**
     * Singleton
     *
     * @return
     */
    public static MatchEventProxy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MatchEventProxy();
        }

        return INSTANCE;
    }


    /**
     * Liste de toutes les videos d'une rencontre
     *
     * @param matchId
     * @return
     */
    public List<MatchEvent> findByMatch(final Integer matchId) {
        final MatchEventProxyParams params = new MatchEventProxyParams();
        params.setMatchId(matchId);
        return findByMatch(params);
    }

    /**
     * Liste de toutes les équipes pour une saison avec les relations définies
     */
    public List<MatchEvent> findByMatch(final MatchEventProxyParams params) {

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
    private List<MatchEvent> findResults(final String url, final MatchEventProxyParams params) {

        waitBeforeNextCall();

        final Map<String, String> paramsMap = new HashMap<>();
        if (params != null) {
            paramsMap.put("includes", params.getRelations());
            if (params.isValidMatchId()) {
                paramsMap.put("matchId", params.getMatchId().toString());
            }
        }

        final HttpResponse<MatchEvents> httpResponse = SocceramaRest.get(url, paramsMap, MatchEvents.class);

        final List<MatchEvent> response = new ArrayList<>();
        response.addAll(httpResponse.getBody().getData());

        return response;
    }


    /**
     * Video relations
     */
    public enum Relation {
        player
    }

}
