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
	"bookmaker_id",
	"name",
	"types"
})
public class OddBookmaker {

	@JsonProperty("bookmaker_id")
	private Integer bookmakerId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("types")
	private OddBookmakerTypes types;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return
	 * The bookmakerId
	 */
	@JsonProperty("bookmaker_id")
	public Integer getBookmakerId() {
		return bookmakerId;
	}

	/**
	 *
	 * @param bookmakerId
	 * The bookmaker_id
	 */
	@JsonProperty("bookmaker_id")
	public void setBookmakerId(final Integer bookmakerId) {
		this.bookmakerId = bookmakerId;
	}

	/**
	 *
	 * @return
	 * The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 * The name
	 */
	@JsonProperty("name")
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 *
	 * @return
	 * The types
	 */
	@JsonProperty("types")
	public OddBookmakerTypes getTypes() {
		return types;
	}

	/**
	 *
	 * @param types
	 * The types
	 */
	@JsonProperty("types")
	public void setTypes(final OddBookmakerTypes types) {
		this.types = types;
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