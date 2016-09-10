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

import pro.soccerama.client.bean.structure.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "id", "home_team_id", "away_team_id", "home_score", "away_score", "home_score_penalties",
	"away_score_penalties", "formation", "date_time_tba", "spectators", "starting_date", "starting_time", "status",
	"minute", "extra_time", "injury_time", "referee_id", "competition_id", "venue_id", "season_id", "round_id", "stage_id", "aggregate", "homeTeam",
	"awayTeam", "venue", "events", "lineup", "homeStats", "awayStats", "competition", "season", "commentaries", "weather", "temperature", "odds", "videos" })
public class Match {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("home_team_id")
	private Integer homeTeamId;
	@JsonProperty("away_team_id")
	private Integer awayTeamId;
	@JsonProperty("home_score")
	private Integer homeScore;
	@JsonProperty("away_score")
	private Integer awayScore;
	@JsonProperty("home_score_penalties")
	private Integer homeScorePenalties;
	@JsonProperty("away_score_penalties")
	private Integer awayScorePenalties;
	@JsonProperty("formation")
	private Formation formation;
	@JsonProperty("date_time_tba")
	private Boolean dateTimeTba;
	@JsonProperty("spectators")
	private Integer spectators;
	@JsonProperty("starting_date")
	private String startingDate;
	@JsonProperty("starting_time")
	private String startingTime;
	@JsonProperty("status")
	private String status;
	@JsonProperty("minute")
	private Integer minute;
	@JsonProperty("extra_time")
	private Integer extraTime;
	@JsonProperty("injury_time")
	private Integer injuryTime;
	@JsonProperty("referee_id")
	private Integer refereeId;
	@JsonProperty("competition_id")
	private Integer competitionId;
	@JsonProperty("venue_id")
	private Integer venueId;
	@JsonProperty("season_id")
	private Integer seasonId;
	@JsonProperty("round_id")
	private Integer roundId;
	@JsonProperty("stage_id")
	private Integer stageId;
	@JsonProperty("aggregate")
	private Object aggregate;
	@JsonProperty("homeTeam")
	private Team homeTeam;
	@JsonProperty("awayTeam")
	private Team awayTeam;
	@JsonProperty("venue")
	private Venue venue;
	@JsonProperty("events")
	private MatchEvents events;
	@JsonProperty("lineup")
	private MatchLineups lineup;
	@JsonProperty("homeStats")
	private MatchTeamStats homeStats;
	@JsonProperty("awayStats")
	private MatchTeamStats awayStats;
	@JsonProperty("competition")
	private Competition competition;
	@JsonProperty("season")
	private Season season;
	@JsonProperty("commentaries")
	private MatchCommentaries commentaries;
	@JsonProperty("weather")
	private String weather;
	@JsonProperty("temperature")
	private String temperature;
	@JsonProperty("odds")
	private OddsResponse odds;
	@JsonProperty("videos")
	private VideosResponse videos;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();


	/**
	 *
	 * @return The id
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @return The homeTeamId
	 */
	@JsonProperty("home_team_id")
	public Integer getHomeTeamId() {
		return homeTeamId;
	}

	/**
	 *
	 * @param homeTeamId
	 *            The home_team_id
	 */
	@JsonProperty("home_team_id")
	public void setHomeTeamId(final Integer homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	/**
	 *
	 * @return The awayTeamId
	 */
	@JsonProperty("away_team_id")
	public Integer getAwayTeamId() {
		return awayTeamId;
	}

	/**
	 *
	 * @param awayTeamId
	 *            The away_team_id
	 */
	@JsonProperty("away_team_id")
	public void setAwayTeamId(final Integer awayTeamId) {
		this.awayTeamId = awayTeamId;
	}

	/**
	 *
	 * @return The homeScore
	 */
	@JsonProperty("home_score")
	public Integer getHomeScore() {
		return homeScore;
	}

	/**
	 *
	 * @param homeScore
	 *            The home_score
	 */
	@JsonProperty("home_score")
	public void setHomeScore(final Integer homeScore) {
		this.homeScore = homeScore;
	}

	/**
	 *
	 * @return The awayScore
	 */
	@JsonProperty("away_score")
	public Integer getAwayScore() {
		return awayScore;
	}

	/**
	 *
	 * @param awayScore
	 *            The away_score
	 */
	@JsonProperty("away_score")
	public void setAwayScore(final Integer awayScore) {
		this.awayScore = awayScore;
	}

	/**
	 *
	 * @return The homeScorePenalties
	 */
	@JsonProperty("home_score_penalties")
	public Integer getHomeScorePenalties() {
		return homeScorePenalties;
	}

	/**
	 *
	 * @param homeScorePenalties
	 *            The home_score_penalties
	 */
	@JsonProperty("home_score_penalties")
	public void setHomeScorePenalties(final Integer homeScorePenalties) {
		this.homeScorePenalties = homeScorePenalties;
	}

	/**
	 *
	 * @return The awayScorePenalties
	 */
	@JsonProperty("away_score_penalties")
	public Integer getAwayScorePenalties() {
		return awayScorePenalties;
	}

	/**
	 *
	 * @param awayScorePenalties
	 *            The away_score_penalties
	 */
	@JsonProperty("away_score_penalties")
	public void setAwayScorePenalties(final Integer awayScorePenalties) {
		this.awayScorePenalties = awayScorePenalties;
	}

	/**
	 *
	 * @return The formation
	 */
	@JsonProperty("formation")
	public Formation getFormation() {
		return formation;
	}

	/**
	 *
	 * @param formation
	 *            The formation
	 */
	@JsonProperty("formation")
	public void setFormation(final Formation formation) {
		this.formation = formation;
	}

	/**
	 *
	 * @return The dateTimeTba
	 */
	@JsonProperty("date_time_tba")
	public Boolean getDateTimeTba() {
		return dateTimeTba;
	}

	/**
	 *
	 * @param dateTimeTba
	 *            The date_time_tba
	 */
	@JsonProperty("date_time_tba")
	public void setDateTimeTba(final Boolean dateTimeTba) {
		this.dateTimeTba = dateTimeTba;
	}

	/**
	 *
	 * @return The spectators
	 */
	@JsonProperty("spectators")
	public Integer getSpectators() {
		return spectators;
	}

	/**
	 *
	 * @param spectators
	 *            The spectators
	 */
	@JsonProperty("spectators")
	public void setSpectators(final Integer spectators) {
		this.spectators = spectators;
	}

	/**
	 *
	 * @return The startingDate
	 */
	@JsonProperty("starting_date")
	public String getStartingDate() {
		return startingDate;
	}

	/**
	 *
	 * @param startingDate
	 *            The starting_date
	 */
	@JsonProperty("starting_date")
	public void setStartingDate(final String startingDate) {
		this.startingDate = startingDate;
	}

	/**
	 *
	 * @return The startingTime
	 */
	@JsonProperty("starting_time")
	public String getStartingTime() {
		return startingTime;
	}

	/**
	 *
	 * @param startingTime
	 *            The starting_time
	 */
	@JsonProperty("starting_time")
	public void setStartingTime(final String startingTime) {
		this.startingTime = startingTime;
	}

	/**
	 *
	 * @return The status
	 */
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	/**
	 *
	 * @param status
	 *            The status
	 */
	@JsonProperty("status")
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 *
	 * @return The minute
	 */
	@JsonProperty("minute")
	public Integer getMinute() {
		return minute;
	}

	/**
	 *
	 * @param minute
	 *            The minute
	 */
	@JsonProperty("minute")
	public void setMinute(final Integer minute) {
		this.minute = minute;
	}

	/**
	 *
	 * @return The extraTime
	 */
	@JsonProperty("extra_time")
	public Integer getExtraTime() {
		return extraTime;
	}

	/**
	 *
	 * @param extraTime
	 *            The extra_time
	 */
	@JsonProperty("extra_time")
	public void setExtraTime(final Integer extraTime) {
		this.extraTime = extraTime;
	}

	/**
	 *
	 * @return The competitionId
	 */
	@JsonProperty("competition_id")
	public Integer getCompetitionId() {
		return competitionId;
	}

	/**
	 *
	 * @param competitionId
	 *            The league_id
	 */
	@JsonProperty("competition_id")
	public void setCompetitionId(final Integer competitionId) {
		this.competitionId = competitionId;
	}

	/**
	 *
	 * @return The venueId
	 */
	@JsonProperty("venue_id")
	public Integer getVenueId() {
		return venueId;
	}

	/**
	 *
	 * @param venueId
	 *            The venue_id
	 */
	@JsonProperty("venue_id")
	public void setVenueId(final Integer venueId) {
		this.venueId = venueId;
	}

	/**
	 *
	 * @return The seasonId
	 */
	@JsonProperty("season_id")
	public Integer getSeasonId() {
		return seasonId;
	}

	/**
	 *
	 * @param seasonId
	 *            The season_id
	 */
	@JsonProperty("season_id")
	public void setSeasonId(final Integer seasonId) {
		this.seasonId = seasonId;
	}

	/**
	 *
	 * @return The roundId
	 */
	@JsonProperty("round_id")
	public Integer getRoundId() {
		return roundId;
	}

	/**
	 *
	 * @param roundId
	 *            The round_id
	 */
	@JsonProperty("round_id")
	public void setRoundId(final Integer roundId) {
		this.roundId = roundId;
	}

	/**
	 *
	 * @return The stageId
	 */
	@JsonProperty("stage_id")
	public Integer getStageId() {
		return stageId;
	}

	/**
	 *
	 * @param stageId
	 *            The stage_id
	 */
	@JsonProperty("stage_id")
	public void setStageId(final Integer stageId) {
		this.stageId = stageId;
	}

	/**
	 *
	 * @return The aggregate
	 */
	@JsonProperty("aggregate")
	public Object getAggregate() {
		return aggregate;
	}

	/**
	 *
	 * @param aggregate
	 *            The aggregate
	 */
	@JsonProperty("aggregate")
	public void setAggregate(final Object aggregate) {
		this.aggregate = aggregate;
	}

	/**
	 *
	 * @return The homeTeam
	 */
	@JsonProperty("homeTeam")
	public Team getHomeTeam() {
		return homeTeam;
	}

	/**
	 *
	 * @param homeTeam
	 *            The homeTeam
	 */
	@JsonProperty("homeTeam")
	public void setHomeTeam(final Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	/**
	 *
	 * @return The awayTeam
	 */
	@JsonProperty("awayTeam")
	public Team getAwayTeam() {
		return awayTeam;
	}

	/**
	 *
	 * @param awayTeam
	 *            The awayTeam
	 */
	@JsonProperty("awayTeam")
	public void setAwayTeam(final Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	/**
	 *
	 * @return The venue
	 */
	@JsonProperty("venue")
	public Venue getVenue() {
		return venue;
	}

	/**
	 *
	 * @param venue
	 *            The venue
	 */
	@JsonProperty("venue")
	public void setVenue(final Venue venue) {
		this.venue = venue;
	}

	/**
	 *
	 * @return The events
	 */
	@JsonProperty("events")
	public MatchEvents getEvents() {
		return events;
	}

	/**
	 *
	 * @param events
	 *            The events
	 */
	@JsonProperty("events")
	public void setEvents(final MatchEvents events) {
		this.events = events;
	}

	/**
	 *
	 * @return The lineup
	 */
	@JsonProperty("lineup")
	public MatchLineups getLineup() {
		return lineup;
	}

	/**
	 *
	 * @param lineup
	 *            The lineup
	 */
	@JsonProperty("lineup")
	public void setLineup(final MatchLineups lineup) {
		this.lineup = lineup;
	}

	/**
	 *
	 * @return The homeStats
	 */
	@JsonProperty("homeStats")
	public MatchTeamStats getHomeStats() {
		return homeStats;
	}

	/**
	 *
	 * @param homeStats
	 *            The homeStats
	 */
	@JsonProperty("homeStats")
	public void setHomeStats(final MatchTeamStats homeStats) {
		this.homeStats = homeStats;
	}

	/**
	 *
	 * @return The awayStats
	 */
	@JsonProperty("awayStats")
	public MatchTeamStats getAwayStats() {
		return awayStats;
	}

	/**
	 *
	 * @param awayStats
	 *            The awayStats
	 */
	@JsonProperty("awayStats")
	public void setAwayStats(final MatchTeamStats awayStats) {
		this.awayStats = awayStats;
	}

	/**
	 *
	 * @return The competition
	 */
	@JsonProperty("competition")
	public Competition getCompetition() {
		return competition;
	}

	/**
	 *
	 * @param competition
	 *            The competition
	 */
	@JsonProperty("competition")
	public void setCompetition(final Competition competition) {
		this.competition = competition;
	}

	/**
	 *
	 * @return The season
	 */
	@JsonProperty("season")
	public Season getSeason() {
		return season;
	}

	/**
	 *
	 * @param season
	 *            The season
	 */
	@JsonProperty("season")
	public void setSeason(final Season season) {
		this.season = season;
	}

	/**
	 *
	 * @return The commentaries
	 */
	@JsonProperty("commentaries")
	public MatchCommentaries getCommentaries() {
		return commentaries;
	}

	/**
	 *
	 * @param commentaries
	 *            The commentaries
	 */
	@JsonProperty("commentaries")
	public void setCommentaries(final MatchCommentaries commentaries) {
		this.commentaries = commentaries;
	}

	@JsonProperty("injury_time")
	public Integer getInjuryTime() {
		return injuryTime;
	}

	@JsonProperty("injury_time")
	public void setInjuryTime(Integer injuryTime) {
		this.injuryTime = injuryTime;
	}

	@JsonProperty("referee_id")
	public Integer getRefereeId() {
		return refereeId;
	}

	@JsonProperty("referee_id")
	public void setRefereeId(Integer refereeId) {
		this.refereeId = refereeId;
	}

	@JsonProperty("weather")
	public String getWeather() {
		return weather;
	}

	@JsonProperty("weather")
	public void setWeather(String weather) {
		this.weather = weather;
	}

	@JsonProperty("temperature")
	public String getTemperature() {
		return temperature;
	}

	@JsonProperty("temperature")
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	@JsonProperty("odds")
	public OddsResponse getOdds() {
		return odds;
	}

	@JsonProperty("odds")
	public void setOdds(OddsResponse odds) {
		this.odds = odds;
	}

	@JsonProperty("videos")
	public VideosResponse getVideos() {
		return videos;
	}

	@JsonProperty("videos")
	public void setVideos(VideosResponse videos) {
		this.videos = videos;
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