package pro.soccerama.client.proxy;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 21/05/2016.
 */
public class PlayerProxyParams extends AbstractProxyParams{
	private Integer playerId;
	private Integer teamId;
	private final Set<String> relations = new HashSet<>();

	/**
	 * @return the playerId
	 */
	public Integer getPlayerId() {
		return playerId;
	}

	/**
	 * @param playerId
	 *            the playerId to set
	 */
	public void setPlayerId(final Integer playerId) {
		this.playerId = playerId;
	}

	/**
	 * @return the teamId
	 */
	public Integer getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId
	 *            the teamId to set
	 */
	public void setTeamId(final Integer teamId) {
		this.teamId = teamId;
	}

	/**
	 * @param relation
	 */
	public void addRelation(final PlayerProxy.Relation relation) {
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
	public boolean isValidTeamId() {
		return teamId != null && teamId > 0;
	}

	/**
	 * @return
	 */
	public boolean isValidPlayerId() {
		return playerId != null && playerId > 0;
	}
}
