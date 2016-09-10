package pro.soccerama.client.bean.entity;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id"
})
public class Video {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("minute")
    private String minute;
    @JsonProperty("match_status")
    private String matchStatus;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The minute
     */
    @JsonProperty("minute")
    public String getMinute() {
        return minute;
    }

    /**
     * @param minute The minute
     */
    @JsonProperty("minute")
    public void setMinute(String minute) {
        this.minute = minute;
    }

    @JsonProperty("match_status")
    public String getMatchStatus() {
        return matchStatus;
    }

    @JsonProperty("match_status")
    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
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
