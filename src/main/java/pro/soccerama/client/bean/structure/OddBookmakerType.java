package pro.soccerama.client.bean.structure;

/**
 * Created by kevin on 28/05/2016.
 */

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
	"type",
	"odds"
})
public class OddBookmakerType {

	@JsonProperty("type")
	private String type;
	@JsonProperty("odds")
	private OddBookmakerTypeOdds odds;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 *
	 * @return
	 * The odds
	 */
	@JsonProperty("odds")
	public OddBookmakerTypeOdds getOdds() {
		return odds;
	}

	/**
	 *
	 * @param odds
	 * The odds
	 */
	@JsonProperty("odds")
	public void setOdds(final OddBookmakerTypeOdds odds) {
		this.odds = odds;
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