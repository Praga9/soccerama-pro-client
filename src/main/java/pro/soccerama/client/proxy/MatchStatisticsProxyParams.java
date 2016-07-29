package pro.soccerama.client.proxy;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 21/05/2016.
 */
public class MatchStatisticsProxyParams extends AbstractProxyParams{
	private Integer matchId;
	private final Set<String> relations = new HashSet<>();

	/**
	 * @return the matchId
	 */
	public Integer getMatchId() {
		return matchId;
	}

	/**
	 * @param matchId
	 *            the matchId to set
	 */
	public void setMatchId(final Integer matchId) {
		this.matchId = matchId;
	}

	/**
	 * @return
	 */
	public boolean isValidMatchId() {
		return matchId != null && matchId > 0;
	}

	/**
	 * @param relation
	 */
	public void addRelation(final MatchStatisticsProxy.Relation relation) {
		relations.add(relation.toString());
	}

	/**
	 * @return
	 */
	public String getRelations() {
		return StringUtils.join(relations, ",");
	}
}
