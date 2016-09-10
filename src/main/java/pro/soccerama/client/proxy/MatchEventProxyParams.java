package pro.soccerama.client.proxy;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kevin on 21/05/2016.
 */
public class MatchEventProxyParams extends AbstractProxyParams {
    private Integer matchId;
    private Set<String> relations = new HashSet<>();

    /**
     * @return
     */
    public Integer getMatchId() {
        return matchId;
    }

    /**
     * @param matchId
     */
    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }


    /**
     * @param relation
     */
    public void addRelation(final TeamProxy.Relation relation) {
        relations.add(relation.toString());
    }

    /**
     * @return
     */
    public String getRelations() {
        return StringUtils.join(relations, ",");
    }

    /**
     * @return
     */
    public boolean isValidMatchId() {
        return matchId != null && matchId > 0;
    }

}
