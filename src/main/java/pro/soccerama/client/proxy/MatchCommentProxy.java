package pro.soccerama.client.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mashape.unirest.http.HttpResponse;

import pro.soccerama.client.bean.entity.MatchComment;
import pro.soccerama.client.bean.structure.MatchCommentResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.tools.SocceramaRest;

/**
 * Proxy Matchs
 */
public class MatchCommentProxy extends SocceramaProxy {

    private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/commentaries/match";
    private static final String BY_ID_URL = BASE_URL + "/{matchId}";
    private static MatchCommentProxy INSTANCE;

    private MatchCommentProxy() {
        // Hide constructor
    }

    /**
     * Singleton
     *
     * @return
     */
    public static MatchCommentProxy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MatchCommentProxy();
        }

        return INSTANCE;
    }

    /**
     * @param matchId
     * @return
     */
    public List<MatchComment> findByMatch(final Integer matchId) {
        final MatchCommentProxyParams params = new MatchCommentProxyParams();
        params.setMatchId(matchId);
        return findByMatch(params);
    }

    /**
     * @param params
     * @return
     */
    private List<MatchComment> findByMatch(final MatchCommentProxyParams params) {
        if (!params.isValidMatchId()) {
            throw new HaveToDefineValidIdException();
        }

        return find(BY_ID_URL, params);
    }

    /**
     * @param url
     * @param params
     * @return
     */
    private List<MatchComment> find(final String url, final MatchCommentProxyParams params) {

        waitBeforeNextCall();

        final Map<String, String> paramsMap = new HashMap<>();
        if (params != null) {
            if (params.isValidMatchId()) {
                paramsMap.put("matchId", params.getMatchId().toString());
            }
        }

        final HttpResponse<MatchCommentResponse> httpResponse = SocceramaRest.get(url, paramsMap, MatchCommentResponse.class);

        return httpResponse.getBody().getCommentaries();
    }


}
