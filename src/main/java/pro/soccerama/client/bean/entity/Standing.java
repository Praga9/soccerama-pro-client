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
@JsonPropertyOrder({ "team_id", "position", "points", "home_win", "home_draw", "home_loose", "home_played",
	"home_goals_attempted", "home_goals_scored", "away_win", "away_draw", "away_loose", "away_played",
	"away_goals_attempted", "away_goals_scored", "result", "team" })
public class Standing {

	@JsonProperty("team_id")
	private Integer teamId;
	@JsonProperty("position")
	private Integer position;
	@JsonProperty("points")
	private Integer points;
	@JsonProperty("home_win")
	private Integer homeWin;
	@JsonProperty("home_draw")
	private Integer homeDraw;
	@JsonProperty("home_loose")
	private Integer homeLoose;
	@JsonProperty("home_played")
	private Integer homePlayed;
	@JsonProperty("home_goals_attempted")
	private Integer homeGoalsAttempted;
	@JsonProperty("home_goals_scored")
	private Integer homeGoalsScored;
	@JsonProperty("away_win")
	private Integer awayWin;
	@JsonProperty("away_draw")
	private Integer awayDraw;
	@JsonProperty("away_loose")
	private Integer awayLoose;
	@JsonProperty("away_played")
	private Integer awayPlayed;
	@JsonProperty("away_goals_attempted")
	private Integer awayGoalsAttempted;
	@JsonProperty("away_goals_scored")
	private Integer awayGoalsScored;
	@JsonProperty("result")
	private String result;
	@JsonProperty("team")
	private Team team;
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
	 * @return The position
	 */
	@JsonProperty("position")
	public Integer getPosition() {
		return position;
	}

	/**
	 *
	 * @param position
	 *            The position
	 */
	@JsonProperty("position")
	public void setPosition(final Integer position) {
		this.position = position;
	}

	/**
	 *
	 * @return The points
	 */
	@JsonProperty("points")
	public Integer getPoints() {
		return points;
	}

	/**
	 *
	 * @param points
	 *            The points
	 */
	@JsonProperty("points")
	public void setPoints(final Integer points) {
		this.points = points;
	}

	/**
	 *
	 * @return The homeWin
	 */
	@JsonProperty("home_win")
	public Integer getHomeWin() {
		return homeWin;
	}

	/**
	 *
	 * @param homeWin
	 *            The home_win
	 */
	@JsonProperty("home_win")
	public void setHomeWin(final Integer homeWin) {
		this.homeWin = homeWin;
	}

	/**
	 *
	 * @return The homeDraw
	 */
	@JsonProperty("home_draw")
	public Integer getHomeDraw() {
		return homeDraw;
	}

	/**
	 *
	 * @param homeDraw
	 *            The home_draw
	 */
	@JsonProperty("home_draw")
	public void setHomeDraw(final Integer homeDraw) {
		this.homeDraw = homeDraw;
	}

	/**
	 *
	 * @return The homeLoose
	 */
	@JsonProperty("home_loose")
	public Integer getHomeLoose() {
		return homeLoose;
	}

	/**
	 *
	 * @param homeLoose
	 *            The home_loose
	 */
	@JsonProperty("home_loose")
	public void setHomeLoose(final Integer homeLoose) {
		this.homeLoose = homeLoose;
	}

	/**
	 *
	 * @return The homePlayed
	 */
	@JsonProperty("home_played")
	public Integer getHomePlayed() {
		return homePlayed;
	}

	/**
	 *
	 * @param homePlayed
	 *            The home_played
	 */
	@JsonProperty("home_played")
	public void setHomePlayed(final Integer homePlayed) {
		this.homePlayed = homePlayed;
	}

	/**
	 *
	 * @return The homeGoalsAttempted
	 */
	@JsonProperty("home_goals_attempted")
	public Integer getHomeGoalsAttempted() {
		return homeGoalsAttempted;
	}

	/**
	 *
	 * @param homeGoalsAttempted
	 *            The home_goals_attempted
	 */
	@JsonProperty("home_goals_attempted")
	public void setHomeGoalsAttempted(final Integer homeGoalsAttempted) {
		this.homeGoalsAttempted = homeGoalsAttempted;
	}

	/**
	 *
	 * @return The homeGoalsScored
	 */
	@JsonProperty("home_goals_scored")
	public Integer getHomeGoalsScored() {
		return homeGoalsScored;
	}

	/**
	 *
	 * @param homeGoalsScored
	 *            The home_goals_scored
	 */
	@JsonProperty("home_goals_scored")
	public void setHomeGoalsScored(final Integer homeGoalsScored) {
		this.homeGoalsScored = homeGoalsScored;
	}

	/**
	 *
	 * @return The awayWin
	 */
	@JsonProperty("away_win")
	public Integer getAwayWin() {
		return awayWin;
	}

	/**
	 *
	 * @param awayWin
	 *            The away_win
	 */
	@JsonProperty("away_win")
	public void setAwayWin(final Integer awayWin) {
		this.awayWin = awayWin;
	}

	/**
	 *
	 * @return The awayDraw
	 */
	@JsonProperty("away_draw")
	public Integer getAwayDraw() {
		return awayDraw;
	}

	/**
	 *
	 * @param awayDraw
	 *            The away_draw
	 */
	@JsonProperty("away_draw")
	public void setAwayDraw(final Integer awayDraw) {
		this.awayDraw = awayDraw;
	}

	/**
	 *
	 * @return The awayLoose
	 */
	@JsonProperty("away_loose")
	public Integer getAwayLoose() {
		return awayLoose;
	}

	/**
	 *
	 * @param awayLoose
	 *            The away_loose
	 */
	@JsonProperty("away_loose")
	public void setAwayLoose(final Integer awayLoose) {
		this.awayLoose = awayLoose;
	}

	/**
	 *
	 * @return The awayPlayed
	 */
	@JsonProperty("away_played")
	public Integer getAwayPlayed() {
		return awayPlayed;
	}

	/**
	 *
	 * @param awayPlayed
	 *            The away_played
	 */
	@JsonProperty("away_played")
	public void setAwayPlayed(final Integer awayPlayed) {
		this.awayPlayed = awayPlayed;
	}

	/**
	 *
	 * @return The awayGoalsAttempted
	 */
	@JsonProperty("away_goals_attempted")
	public Integer getAwayGoalsAttempted() {
		return awayGoalsAttempted;
	}

	/**
	 *
	 * @param awayGoalsAttempted
	 *            The away_goals_attempted
	 */
	@JsonProperty("away_goals_attempted")
	public void setAwayGoalsAttempted(final Integer awayGoalsAttempted) {
		this.awayGoalsAttempted = awayGoalsAttempted;
	}

	/**
	 *
	 * @return The awayGoalsScored
	 */
	@JsonProperty("away_goals_scored")
	public Integer getAwayGoalsScored() {
		return awayGoalsScored;
	}

	/**
	 *
	 * @param awayGoalsScored
	 *            The away_goals_scored
	 */
	@JsonProperty("away_goals_scored")
	public void setAwayGoalsScored(final Integer awayGoalsScored) {
		this.awayGoalsScored = awayGoalsScored;
	}

	/**
	 *
	 * @return The result
	 */
	@JsonProperty("result")
	public String getResult() {
		return result;
	}

	/**
	 *
	 * @param result
	 *            The result
	 */
	@JsonProperty("result")
	public void setResult(final String result) {
		this.result = result;
	}

	/**
	 *
	 * @return The team
	 */
	@JsonProperty("team")
	public Team getTeam() {
		return team;
	}

	/**
	 *
	 * @param team
	 *            The team
	 */
	@JsonProperty("team")
	public void setTeam(final Team team) {
		this.team = team;
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