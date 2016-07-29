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
@JsonPropertyOrder({ "id", "body", "is_goal", "important", "minute" })
public class MatchComment {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("body")
	private String body;
	@JsonProperty("is_goal")
	private Integer isGoal;
	@JsonProperty("important")
	private Integer important;
	@JsonProperty("minute")
	private String minute;
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
	 * @return The body
	 */
	@JsonProperty("body")
	public String getBody() {
		return body;
	}

	/**
	 *
	 * @param body
	 *            The body
	 */
	@JsonProperty("body")
	public void setBody(final String body) {
		this.body = body;
	}

	/**
	 *
	 * @return The isGoal
	 */
	@JsonProperty("is_goal")
	public Integer getIsGoal() {
		return isGoal;
	}

	/**
	 *
	 * @param isGoal
	 *            The is_goal
	 */
	@JsonProperty("is_goal")
	public void setIsGoal(final Integer isGoal) {
		this.isGoal = isGoal;
	}

	/**
	 *
	 * @return The important
	 */
	@JsonProperty("important")
	public Integer getImportant() {
		return important;
	}

	/**
	 *
	 * @param important
	 *            The important
	 */
	@JsonProperty("important")
	public void setImportant(final Integer important) {
		this.important = important;
	}

	/**
	 *
	 * @return The minute
	 */
	@JsonProperty("minute")
	public String getMinute() {
		return minute;
	}

	/**
	 *
	 * @param minute
	 *            The minute
	 */
	@JsonProperty("minute")
	public void setMinute(final String minute) {
		this.minute = minute;
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