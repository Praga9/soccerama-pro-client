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

import pro.soccerama.client.bean.structure.SeasonMatches;
import pro.soccerama.client.bean.structure.SeasonRounds;
import pro.soccerama.client.bean.structure.SeasonStages;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"id",
	"competition_id",
	"name",
	"active",
	"matches",
	"competition",
	"rounds",
	"stages"
})
public class Season {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("competition_id")
	private Integer competitionId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("active")
	private Boolean active;
	@JsonProperty("matches")
	private SeasonMatches matches;
	@JsonProperty("competition")
	private Competition competition;
	@JsonProperty("rounds")
	private SeasonRounds rounds;
	@JsonProperty("stages")
	private SeasonStages stages;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * @return The id
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * @param id The id
	 */
	@JsonProperty("id")
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @return The leagueId
	 */
	@JsonProperty("competition_id")
	public Integer getCompetitionId() {
		return competitionId;
	}

	/**
	 * @param leagueId The league_id
	 */
	@JsonProperty("competition_id")
	public void setCompetitionId(final Integer leagueId) {
		competitionId = leagueId;
	}

	/**
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * @param name The name
	 */
	@JsonProperty("name")
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return The active
	 */
	@JsonProperty("active")
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active The active
	 */
	@JsonProperty("active")
	public void setActive(final Boolean active) {
		this.active = active;
	}

	/**
	 * @return The matches
	 */
	@JsonProperty("matches")
	public SeasonMatches getMatches() {
		return matches;
	}

	/**
	 * @param matches The matches
	 */
	@JsonProperty("matches")
	public void setMatches(final SeasonMatches matches) {
		this.matches = matches;
	}

	/**
	 * @return The competition
	 */
	@JsonProperty("competition")
	public Competition getCompetition() {
		return competition;
	}

	/**
	 * @param competition The competition
	 */
	@JsonProperty("competition")
	public void setCompetition(final Competition competition) {
		this.competition = competition;
	}

	/**
	 * @return The rounds
	 */
	@JsonProperty("rounds")
	public SeasonRounds getRounds() {
		return rounds;
	}

	/**
	 * @param rounds The rounds
	 */
	@JsonProperty("rounds")
	public void setRounds(final SeasonRounds rounds) {
		this.rounds = rounds;
	}

	/**
	 * @return The stages
	 */
	@JsonProperty("stages")
	public SeasonStages getStages() {
		return stages;
	}

	/**
	 * @param stages The stages
	 */
	@JsonProperty("stages")
	public void setStages(final SeasonStages stages) {
		this.stages = stages;
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