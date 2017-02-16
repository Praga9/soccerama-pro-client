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
	private String rangeBegin;
	private String rangeEnd;

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

	public void setRangeBegin(final String rangeBegin) {
		this.rangeBegin = rangeBegin;
	}

	public String getRangeBegin() {
		return rangeBegin;
	}

	public void setRangeEnd(final String rangeEnd) {
		this.rangeEnd = rangeEnd;
	}

	public String getRangeEnd() {
		return rangeEnd;
	}

	/**
	 *
	 */
	public boolean isValidBeginDate() {
		return rangeBegin != null && !rangeBegin.toString().trim().isEmpty() && rangeBegin.toString().length() == 10;
	}

	/**
	 *
	 */
	public boolean isValidEndDate() {
		return rangeEnd != null && !rangeEnd.toString().trim().isEmpty() && rangeEnd.toString().length() == 10;
	}
}
