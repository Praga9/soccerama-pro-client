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
@JsonPropertyOrder({
	"id",
	"name",
	"started_at",
	"ended_at"
})
public class Round {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("started_at")
	private String startedAt;
	@JsonProperty("ended_at")
	private String endedAt;
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
	 * @return The startedAt
	 */
	@JsonProperty("started_at")
	public String getStartedAt() {
		return startedAt;
	}

	/**
	 * @param startedAt The started_at
	 */
	@JsonProperty("started_at")
	public void setStartedAt(final String startedAt) {
		this.startedAt = startedAt;
	}

	/**
	 * @return The endedAt
	 */
	@JsonProperty("ended_at")
	public String getEndedAt() {
		return endedAt;
	}

	/**
	 * @param endedAt The ended_at
	 */
	@JsonProperty("ended_at")
	public void setEndedAt(final String endedAt) {
		this.endedAt = endedAt;
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
