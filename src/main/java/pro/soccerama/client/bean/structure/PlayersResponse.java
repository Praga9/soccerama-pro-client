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

import pro.soccerama.client.bean.entity.Player;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "data" })
public class PlayersResponse {

	@JsonProperty("data")
	private List<Player> data = new ArrayList<Player>();
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The players
	 */
	@JsonProperty("data")
	public List<Player> getPlayers() {
		return data;
	}

	/**
	 *
	 * @param players
	 *            The players
	 */
	@JsonProperty("data")
	public void setPlayers(final List<Player> players) {
		this.data = players;
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