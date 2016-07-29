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
        "competition_id",
        "season_id"
})
public class Stage {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("competition_id")
    private Integer competitionId;
    @JsonProperty("season_id")
    private Integer seasonId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The competitionId
     */
    @JsonProperty("competition_id")
    public Integer getCompetitionId() {
        return competitionId;
    }

    /**
     *
     * @param competitionId
     * The competition_id
     */
    @JsonProperty("competition_id")
    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    /**
     *
     * @return
     * The seasonId
     */
    @JsonProperty("season_id")
    public Integer getSeasonId() {
        return seasonId;
    }

    /**
     *
     * @param seasonId
     * The season_id
     */
    @JsonProperty("season_id")
    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
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