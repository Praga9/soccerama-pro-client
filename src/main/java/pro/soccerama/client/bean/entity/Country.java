package pro.soccerama.client.bean.entity;

import com.fasterxml.jackson.annotation.*;
import pro.soccerama.client.bean.structure.CountryCompetitions;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "iso_code",
		"competitions" })
public class Country {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("iso_code")
	private String isoCode;
	@JsonProperty("competitions")
	private CountryCompetitions competitions;

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
	 * @return The isoCode
	 */
	@JsonProperty("iso_code")
	public String getIsoCode() {
		return isoCode;
	}

	/**
	 * 
	 * @param isoCode
	 *            The iso_code
	 */
	@JsonProperty("iso_code")
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
	/**
	 *
	 * @return
	 * The competitions
	 */
	@JsonProperty("competitions")
	public CountryCompetitions getCompetitions() {
		return competitions;
	}

	/**
	 *
	 * @param competitions
	 * The competitions
	 */
	@JsonProperty("competitions")
	public void setCompetitions(CountryCompetitions competitions) {
		this.competitions = competitions;
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