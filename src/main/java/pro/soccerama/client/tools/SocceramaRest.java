package pro.soccerama.client.tools;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;
import pro.soccerama.client.SocceramaAPIClient;
import pro.soccerama.client.proxy.SocceramaProxy;

import java.util.Map;

/**
 * Created by kevin on 21/05/2016.
 */
public class SocceramaRest {


    /**
     * @param baseUrl
     * @param params
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> HttpResponse<T> get(final String baseUrl, final Map<String, String> params, final Class<T> clazz) {

        final GetRequest getRequest = Unirest.get(baseUrl + SocceramaProxy.COMMON_URL_PARAMS);

        config(getRequest, params);

        try {
            return getRequest.asObject(clazz);
        } catch (UnirestException ue) {
            System.out.println("SocceramaAPIClient Exception : " + ue.getMessage());
        }
        return null;
    }

    /**
     * @param httpRequest
     * @param params
     */
    private static void config(final HttpRequest httpRequest, final Map<String, String> params) {
        httpRequest.routeParam("api_token", SocceramaAPIClient.getInstance().getApiToken());

        if (params != null && !params.isEmpty()) {
            for (Map.Entry<String, String> param : params.entrySet()) {
                httpRequest.routeParam(param.getKey(), param.getValue());
            }
        } else {
            httpRequest.routeParam("includes", "");
        }

        httpRequest.header("Accept", "application/json");
    }
}
