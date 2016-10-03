package pro.soccerama.client.proxy;

import com.mashape.unirest.http.HttpResponse;
import pro.soccerama.client.bean.entity.Country;
import pro.soccerama.client.bean.structure.CountriesResponse;
import pro.soccerama.client.exception.HaveToDefineValidIdException;
import pro.soccerama.client.exception.NotFoundException;
import pro.soccerama.client.tools.SocceramaRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kevin on 28/05/2016.
 */
public class CountryProxy extends SocceramaProxy {

    private static final String BASE_URL = SocceramaProxy.API_URL + SocceramaProxy.VERSION + "/countries";
    private static final String BY_ID_URL = BASE_URL + "/{id}";
    private static CountryProxy INSTANCE;

    private CountryProxy() {
        // Hide constructor
    }

    /**
     * Singleton
     *
     * @return
     */
    public static CountryProxy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CountryProxy();
        }

        return INSTANCE;
    }

    /**
     * Retourne la liste de toutes les compétitions autorisées
     *
     * @return {@List<@Competition>}
     */
    public List<Country> findAll() {
        return findAll(null);
    }

    /**
     * Liste de toutes les competitions autorisées avec les relations définies
     */
    public List<Country> findAll(final CountryProxyParams params) {
        if(null != params) {
            params.setCountryId(null);
        }
        return find(BASE_URL, params);
    }

    private List<Country> find(final String url, final CountryProxyParams params) {

        waitBeforeNextCall();

        final List<Country> response = new ArrayList<>();

        final Map<String, String> paramsMap = new HashMap<>();
        if (params != null) {
            paramsMap.put("includes", params.getRelations());
            if (params.isValidCountryId()) {
                paramsMap.put("id", params.getCountryId().toString());
            }
        }

        final HttpResponse<CountriesResponse> httpResponse = SocceramaRest.get(url, paramsMap, CountriesResponse.class);
        final CountriesResponse body = httpResponse.getBody();
        if (body != null) {
            response.addAll(body.getData());
        }

        return response;
    }

    /**
     * @param countryId
     * @return
     * @throws NotFoundException
     */
    public Country findOne(final Integer countryId) throws NotFoundException {
        final CountryProxyParams params = new CountryProxyParams();
        params.setCountryId(countryId);
        return findOne(params);
    }

    /**
     * Liste de toutes les competitions autorisées avec les relations définies
     */
    public Country findOne(final CountryProxyParams params) throws NotFoundException {

        if (!params.isValidCountryId()) {
            throw new HaveToDefineValidIdException();
        }

        final List<Country> all = find(BY_ID_URL, params);
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
