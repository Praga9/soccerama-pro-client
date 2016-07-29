package pro.soccerama.client.proxy;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 21/05/2016.
 */
public class SeasonProxyParams extends AbstractProxyParams {
    private Integer seasonId;
    private Set<String> relations = new HashSet<>();

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public void addRelation(final SeasonProxy.Relation relation) {
        relations.add(relation.toString());
    }

    public String getRelations() {
        if (getCustomIncludes() == null || getCustomIncludes().trim().isEmpty())
            return StringUtils.join(relations, ",");
        else
            return getCustomIncludes();
    }

    public boolean isValidId() {
        return seasonId != null && seasonId > 0;
    }
}
