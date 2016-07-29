package pro.soccerama.client.bean.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import pro.soccerama.client.bean.entity.MatchLineup;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "lineups" })
public class PlayerMatchLineups {

	@JsonProperty("lineups")
	private List<MatchLineup> lineups = new ArrayList<>();
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The lineups
	 */
	@JsonProperty("lineups")
	public List<MatchLineup> getLineups() {
		return lineups;
	}

	/**
	 *
	 * @param lineups
	 *            The lineups
	 */
	@JsonProperty("lineups")
	public void setLineups(final List<MatchLineup> lineups) {
		this.lineups = lineups;
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