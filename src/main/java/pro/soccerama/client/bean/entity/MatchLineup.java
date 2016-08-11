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
@JsonPropertyOrder({ "id", "team_id", "player_id", "player_name", "position", "shirt_number", "assists", "fouls_commited", "fouls_drawn", "goals", "offsides",
		"missed_penalties", "scored_penalties", "posx", "posy", "redcards", "saves", "shots_on_goal", "shots_total", "yellowcards", "type" })
public class MatchLineup {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("team_id")
	private Integer teamId;
	@JsonProperty("player_id")
	private Integer playerId;
	@JsonProperty("player_name")
	private String playerName;
	@JsonProperty("position")
	private String position;
	@JsonProperty("shirt_number")
	private Integer shirtNumber;
	@JsonProperty("assists")
	private Integer assists;
	@JsonProperty("fouls_commited")
	private Integer foulsCommited;
	@JsonProperty("fouls_drawn")
	private Integer foulsDrawn;
	@JsonProperty("goals")
	private Integer goals;
	@JsonProperty("offsides")
	private Integer offsides;
	@JsonProperty("missed_penalties")
	private Integer missedPenalties;
	@JsonProperty("scored_penalties")
	private Integer scoredPenalties;
	@JsonProperty("posx")
	private Integer posx;
	@JsonProperty("posy")
	private Integer posy;
	@JsonProperty("redcards")
	private Integer redcards;
	@JsonProperty("saves")
	private Integer saves;
	@JsonProperty("shots_on_goal")
	private Integer shotsOnGoal;
	@JsonProperty("shots_total")
	private Integer shotsTotal;
	@JsonProperty("yellowcards")
	private Integer yellowcards;
	@JsonProperty("type")
	private String type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return
	 * The id
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 * The id
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 * The teamId
	 */
	@JsonProperty("team_id")
	public Integer getTeamId() {
		return teamId;
	}

	/**
	 *
	 * @param teamId
	 * The team_id
	 */
	@JsonProperty("team_id")
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	/**
	 *
	 * @return
	 * The playerId
	 */
	@JsonProperty("player_id")
	public Integer getPlayerId() {
		return playerId;
	}

	/**
	 *
	 * @param playerId
	 * The player_id
	 */
	@JsonProperty("player_id")
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	/**
	 *
	 * @return
	 * The playerName
	 */
	@JsonProperty("player_name")
	public String getPlayerName() {
		return playerName;
	}

	/**
	 *
	 * @param playerName
	 * The player_name
	 */
	@JsonProperty("player_name")
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 *
	 * @return
	 * The position
	 */
	@JsonProperty("position")
	public String getPosition() {
		return position;
	}

	/**
	 *
	 * @param position
	 * The position
	 */
	@JsonProperty("position")
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 *
	 * @return
	 * The shirtNumber
	 */
	@JsonProperty("shirt_number")
	public Integer getShirtNumber() {
		return shirtNumber;
	}

	/**
	 *
	 * @param shirtNumber
	 * The shirt_number
	 */
	@JsonProperty("shirt_number")
	public void setShirtNumber(Integer shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	/**
	 *
	 * @return
	 * The assists
	 */
	@JsonProperty("assists")
	public Integer getAssists() {
		return assists;
	}

	/**
	 *
	 * @param assists
	 * The assists
	 */
	@JsonProperty("assists")
	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	/**
	 *
	 * @return
	 * The foulsCommited
	 */
	@JsonProperty("fouls_commited")
	public Integer getFoulsCommited() {
		return foulsCommited;
	}

	/**
	 *
	 * @param foulsCommited
	 * The fouls_commited
	 */
	@JsonProperty("fouls_commited")
	public void setFoulsCommited(Integer foulsCommited) {
		this.foulsCommited = foulsCommited;
	}

	/**
	 *
	 * @return
	 * The foulsDrawn
	 */
	@JsonProperty("fouls_drawn")
	public Integer getFoulsDrawn() {
		return foulsDrawn;
	}

	/**
	 *
	 * @param foulsDrawn
	 * The fouls_drawn
	 */
	@JsonProperty("fouls_drawn")
	public void setFoulsDrawn(Integer foulsDrawn) {
		this.foulsDrawn = foulsDrawn;
	}

	/**
	 *
	 * @return
	 * The goals
	 */
	@JsonProperty("goals")
	public Integer getGoals() {
		return goals;
	}

	/**
	 *
	 * @param goals
	 * The goals
	 */
	@JsonProperty("goals")
	public void setGoals(Integer goals) {
		this.goals = goals;
	}

	/**
	 *
	 * @return
	 * The offsides
	 */
	@JsonProperty("offsides")
	public Integer getOffsides() {
		return offsides;
	}

	/**
	 *
	 * @param offsides
	 * The offsides
	 */
	@JsonProperty("offsides")
	public void setOffsides(Integer offsides) {
		this.offsides = offsides;
	}

	/**
	 *
	 * @return
	 * The missedPenalties
	 */
	@JsonProperty("missed_penalties")
	public Integer getMissedPenalties() {
		return missedPenalties;
	}

	/**
	 *
	 * @param missedPenalties
	 * The missed_penalties
	 */
	@JsonProperty("missed_penalties")
	public void setMissedPenalties(Integer missedPenalties) {
		this.missedPenalties = missedPenalties;
	}

	/**
	 *
	 * @return
	 * The scoredPenalties
	 */
	@JsonProperty("scored_penalties")
	public Integer getScoredPenalties() {
		return scoredPenalties;
	}

	/**
	 *
	 * @param scoredPenalties
	 * The scored_penalties
	 */
	@JsonProperty("scored_penalties")
	public void setScoredPenalties(Integer scoredPenalties) {
		this.scoredPenalties = scoredPenalties;
	}

	/**
	 *
	 * @return
	 * The posx
	 */
	@JsonProperty("posx")
	public Integer getPosx() {
		return posx;
	}

	/**
	 *
	 * @param posx
	 * The posx
	 */
	@JsonProperty("posx")
	public void setPosx(Integer posx) {
		this.posx = posx;
	}

	/**
	 *
	 * @return
	 * The posy
	 */
	@JsonProperty("posy")
	public Integer getPosy() {
		return posy;
	}

	/**
	 *
	 * @param posy
	 * The posy
	 */
	@JsonProperty("posy")
	public void setPosy(Integer posy) {
		this.posy = posy;
	}

	/**
	 *
	 * @return
	 * The redcards
	 */
	@JsonProperty("redcards")
	public Integer getRedcards() {
		return redcards;
	}

	/**
	 *
	 * @param redcards
	 * The redcards
	 */
	@JsonProperty("redcards")
	public void setRedcards(Integer redcards) {
		this.redcards = redcards;
	}

	/**
	 *
	 * @return
	 * The saves
	 */
	@JsonProperty("saves")
	public Integer getSaves() {
		return saves;
	}

	/**
	 *
	 * @param saves
	 * The saves
	 */
	@JsonProperty("saves")
	public void setSaves(Integer saves) {
		this.saves = saves;
	}

	/**
	 *
	 * @return
	 * The shotsOnGoal
	 */
	@JsonProperty("shots_on_goal")
	public Integer getShotsOnGoal() {
		return shotsOnGoal;
	}

	/**
	 *
	 * @param shotsOnGoal
	 * The shots_on_goal
	 */
	@JsonProperty("shots_on_goal")
	public void setShotsOnGoal(Integer shotsOnGoal) {
		this.shotsOnGoal = shotsOnGoal;
	}

	/**
	 *
	 * @return
	 * The shotsTotal
	 */
	@JsonProperty("shots_total")
	public Integer getShotsTotal() {
		return shotsTotal;
	}

	/**
	 *
	 * @param shotsTotal
	 * The shots_total
	 */
	@JsonProperty("shots_total")
	public void setShotsTotal(Integer shotsTotal) {
		this.shotsTotal = shotsTotal;
	}

	/**
	 *
	 * @return
	 * The yellowcards
	 */
	@JsonProperty("yellowcards")
	public Integer getYellowcards() {
		return yellowcards;
	}

	/**
	 *
	 * @param yellowcards
	 * The yellowcards
	 */
	@JsonProperty("yellowcards")
	public void setYellowcards(Integer yellowcards) {
		this.yellowcards = yellowcards;
	}

	/**
	 *
	 * @return
	 * The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 *
	 * @param type
	 * The type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}