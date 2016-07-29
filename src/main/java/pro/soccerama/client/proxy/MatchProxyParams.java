package pro.soccerama.client.proxy;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 21/05/2016.
 */
public class MatchProxyParams extends AbstractProxyParams{
	private Integer matchId;
	private final Set<String> relations = new HashSet<>();

	/**
	 *
	 * @return
	 */
	public Integer getMatchId() {
		return matchId;
	}

	/**
	 * @param matchId
	 */
	public void setMatchId(final Integer matchId) {
		this.matchId = matchId;
	}

	/**
	 * @param relation
	 */
	public void addRelation(final MatchProxy.Relation relation) {
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
	public boolean isValidId() {
		return matchId != null && matchId > 0;
	}
}
