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
@JsonPropertyOrder({ "id", "minute", "extra_min", "type", "player_id", "assist_id", "team_id", "player_in_id",
	"player_out_id", "related_event_id" })
public class MatchEvent {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("minute")
	private Integer minute;
	@JsonProperty("extra_min")
	private Integer extraMin;
	@JsonProperty("type")
	private String type;
	@JsonProperty("player_id")
	private Integer playerId;
	@JsonProperty("assist_id")
	private Integer assistId;
	@JsonProperty("team_id")
	private Integer teamId;
	@JsonProperty("player_in_id")
	private Integer playerInId;
	@JsonProperty("player_out_id")
	private Integer playerOutId;
	@JsonProperty("related_event_id")
	private Integer relatedEventId;
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
	 * @return The extraMin
	 */
	@JsonProperty("extra_min")
	public Integer getExtraMin() {
		return extraMin;
	}

	/**
	 *
	 * @param extraMin
	 *            The extra_min
	 */
	@JsonProperty("extra_min")
	public void setExtraMin(final Integer extraMin) {
		this.extraMin = extraMin;
	}

	/**
	 *
	 * @return The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 *
	 * @param type
	 *            The type
	 */
	@JsonProperty("type")
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 *
	 * @return The playerId
	 */
	@JsonProperty("player_id")
	public Integer getPlayerId() {
		return playerId;
	}

	/**
	 *
	 * @param playerId
	 *            The player_id
	 */
	@JsonProperty("player_id")
	public void setPlayerId(final Integer playerId) {
		this.playerId = playerId;
	}

	/**
	 *
	 * @return The assistId
	 */
	@JsonProperty("assist_id")
	public Integer getAssistId() {
		return assistId;
	}

	/**
	 *
	 * @param assistId
	 *            The assist_id
	 */
	@JsonProperty("assist_id")
	public void setAssistId(final Integer assistId) {
		this.assistId = assistId;
	}

	/**
	 *
	 * @return The teamId
	 */
	@JsonProperty("team_id")
	public Integer getTeamId() {
		return teamId;
	}

	/**
	 *
	 * @param teamId
	 *            The team_id
	 */
	@JsonProperty("team_id")
	public void setTeamId(final Integer teamId) {
		this.teamId = teamId;
	}
	/**
	 *
	 * @return
	 * The relatedEventId
	 */
	@JsonProperty("related_event_id")
	public Integer getRelatedEventId() {
		return relatedEventId;
	}

	/**
	 *
	 * @param relatedEventId
	 * The related_event_id
	 */
	@JsonProperty("related_event_id")
	public void setRelatedEventId(final Integer relatedEventId) {
		this.relatedEventId = relatedEventId;
	}
	/**
	 *
	 * @return The playerInId
	 */
	@JsonProperty("player_in_id")
	public Integer getPlayerInId() {
		return playerInId;
	}

	/**
	 *
	 * @param playerInId
	 *            The player_in_id
	 */
	@JsonProperty("player_in_id")
	public void setPlayerInId(final Integer playerInId) {
		this.playerInId = playerInId;
	}

	/**
	 *
	 * @return The playerOutId
	 */
	@JsonProperty("player_out_id")
	public Integer getPlayerOutId() {
		return playerOutId;
	}

	/**
	 *
	 * @param playerOutId
	 *            The player_out_id
	 */
	@JsonProperty("player_out_id")
	public void setPlayerOutId(final Integer playerOutId) {
		this.playerOutId = playerOutId;
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