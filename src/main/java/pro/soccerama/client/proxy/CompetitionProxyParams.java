package pro.soccerama.client.proxy;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 21/05/2016.
 */
public class CompetitionProxyParams extends AbstractProxyParams{
	private Integer competitionId;
	private Set<String> relations = new HashSet<>();

	public Integer getCompetitionId() {
		return competitionId;
	}

	public void setCompetitionId(Integer competitionId) {
		this.competitionId = competitionId;
	}

	public void addRelation(final CompetitionProxy.Relation relation) {
		relations.add(relation.toString());
	}

	public String getRelations() {
		return StringUtils.join(relations, ",");
	}

	public boolean isValidCompetitionId() {
		return competitionId != null && competitionId > 0;
	}
}
