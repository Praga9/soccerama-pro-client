package pro.soccerama.client.proxy;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 28/05/2016.
 */
public class CountryProxyParams extends AbstractProxyParams {
    private Integer countryId;
     private Set<String> relations = new HashSet<>();

    public void addRelation(final CountryProxy.Relation relation) {
        relations.add(relation.toString());
    }

    public String getRelations() {
        return StringUtils.join(relations, ",");
    }

    public boolean isValidCountryId() {
        return countryId != null && countryId > 0;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
