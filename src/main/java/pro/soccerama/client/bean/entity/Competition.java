package pro.soccerama.client.bean.entity;

import com.fasterxml.jackson.annotation.*;
import pro.soccerama.client.bean.structure.CompetitionSeasons;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "active", "country", "currentSeason", "seasons" })
public class Competition {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("active")
	private Boolean active;
	@JsonProperty("country")
	private Country country;
	@JsonProperty("currentSeason")
	private Season currentSeason;
	@JsonProperty("seasons")
	private CompetitionSeasons seasons;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The active
	 */
	@JsonProperty("active")
	public Boolean getActive() {
		return active;
	}

	/**
	 * 
	 * @param active
	 *            The active
	 */
	@JsonProperty("active")
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * 
	 * @return The country
	 */
	@JsonProperty("country")
	public Country getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 *            The country
	 */
	@JsonProperty("country")
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * 
	 * @return The currentSeason
	 */
	@JsonProperty("currentSeason")
	public Season getCurrentSeason() {
		return currentSeason;
	}

	/**
	 * 
	 * @param currentSeason
	 *            The currentSeason
	 */
	@JsonProperty("currentSeason")
	public void setCurrentSeason(Season currentSeason) {
		this.currentSeason = currentSeason;
	}

	/**
	 * 
	 * @return The seasons
	 */
	@JsonProperty("seasons")
	public CompetitionSeasons getSeasons() {
		return seasons;
	}

	/**
	 * 
	 * @param seasons
	 *            The seasons
	 */
	@JsonProperty("seasons")
	public void setSeasons(CompetitionSeasons seasons) {
		this.seasons = seasons;
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