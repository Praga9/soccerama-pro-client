package pro.soccerama.client.proxy;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 21/05/2016.
 */
public class LivescoreProxyParams extends AbstractProxyParams{
	private Integer matchId;
	private String date;
	private final Set<String> relations = new HashSet<>();

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(final String date) {
		this.date = date;
	}

	/**
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
	public void addRelation(final LivescoreProxy.Relation relation) {
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

	/**
	 *
	 */
	public boolean isValidDate(){
		return date != null && !date.toString().trim().isEmpty() && date.toString().length() == 10;
	}
}
