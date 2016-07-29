package pro.soccerama.client.bean.entity;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "team_id", "shots_on_goal", "shots_total", "fouls_total", "corners_total", "offsides_total",
	"possesion", "yellowcards", "redcards", "saves" })
public class MatchTeamStats {

	@JsonProperty("team_id")
	private Integer teamId;
	@JsonProperty("shots_on_goal")
	private Integer shotsOnGoal;
	@JsonProperty("shots_total")
	private Integer shotsTotal;
	@JsonProperty("fouls_total")
	private Integer foulsTotal;
	@JsonProperty("corners_total")
	private Integer cornersTotal;
	@JsonProperty("offsides_total")
	private Integer offsidesTotal;
	@JsonProperty("possesion")
	private Integer possesion;
	@JsonProperty("yellowcards")
	private Integer yellowcards;
	@JsonProperty("redcards")
	private Integer redcards;
	@JsonProperty("saves")
	private Integer saves;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The teamId
	 */
	@JsonProperty("team_id")
	public Integer getTeamId() {
		return teamId;
	}

	/**
	 *
	 * @param teamId
	 *            The team_id
	 */
	@JsonProperty("team_id")
	public void setTeamId(final Integer teamId) {
		this.teamId = teamId;
	}

	/**
	 *
	 * @return The shotsOnGoal
	 */
	@JsonProperty("shots_on_goal")
	public Integer getShotsOnGoal() {
		return shotsOnGoal;
	}

	/**
	 *
	 * @param shotsOnGoal
	 *            The shots_on_goal
	 */
	@JsonProperty("shots_on_goal")
	public void setShotsOnGoal(final Integer shotsOnGoal) {
		this.shotsOnGoal = shotsOnGoal;
	}

	/**
	 *
	 * @return The shotsTotal
	 */
	@JsonProperty("shots_total")
	public Integer getShotsTotal() {
		return shotsTotal;
	}

	/**
	 *
	 * @param shotsTotal
	 *            The shots_total
	 */
	@JsonProperty("shots_total")
	public void setShotsTotal(final Integer shotsTotal) {
		this.shotsTotal = shotsTotal;
	}

	/**
	 *
	 * @return The foulsTotal
	 */
	@JsonProperty("fouls_total")
	public Integer getFoulsTotal() {
		return foulsTotal;
	}

	/**
	 *
	 * @param foulsTotal
	 *            The fouls_total
	 */
	@JsonProperty("fouls_total")
	public void setFoulsTotal(final Integer foulsTotal) {
		this.foulsTotal = foulsTotal;
	}

	/**
	 *
	 * @return The cornersTotal
	 */
	@JsonProperty("corners_total")
	public Integer getCornersTotal() {
		return cornersTotal;
	}

	/**
	 *
	 * @param cornersTotal
	 *            The corners_total
	 */
	@JsonProperty("corners_total")
	public void setCornersTotal(final Integer cornersTotal) {
		this.cornersTotal = cornersTotal;
	}

	/**
	 *
	 * @return The offsidesTotal
	 */
	@JsonProperty("offsides_total")
	public Integer getOffsidesTotal() {
		return offsidesTotal;
	}

	/**
	 *
	 * @param offsidesTotal
	 *            The offsides_total
	 */
	@JsonProperty("offsides_total")
	public void setOffsidesTotal(final Integer offsidesTotal) {
		this.offsidesTotal = offsidesTotal;
	}

	/**
	 *
	 * @return The possesion
	 */
	@JsonProperty("possesion")
	public Integer getPossesion() {
		return possesion;
	}

	/**
	 *
	 * @param possesion
	 *            The possesion
	 */
	@JsonProperty("possesion")
	public void setPossesion(final Integer possesion) {
		this.possesion = possesion;
	}

	/**
	 *
	 * @return The yellowcards
	 */
	@JsonProperty("yellowcards")
	public Integer getYellowcards() {
		return yellowcards;
	}

	/**
	 *
	 * @param yellowcards
	 *            The yellowcards
	 */
	@JsonProperty("yellowcards")
	public void setYellowcards(final Integer yellowcards) {
		this.yellowcards = yellowcards;
	}

	/**
	 *
	 * @return The redcards
	 */
	@JsonProperty("redcards")
	public Integer getRedcards() {
		return redcards;
	}

	/**
	 *
	 * @param redcards
	 *            The redcards
	 */
	@JsonProperty("redcards")
	public void setRedcards(final Integer redcards) {
		this.redcards = redcards;
	}

	/**
	 *
	 * @return The saves
	 */
	@JsonProperty("saves")
	public Integer getSaves() {
		return saves;
	}

	/**
	 *
	 * @param saves
	 *            The saves
	 */
	@JsonProperty("saves")
	public void setSaves(final Integer saves) {
		this.saves = saves;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(final String name, final Object value) {
		additionalProperties.put(name, value);
	}

}