package pro.soccerama.client.bean.entity;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "home",
        "away"
})
public class Formation {

    @JsonProperty("home")
    private String home;
    @JsonProperty("away")
    private String away;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The home
     */
    @JsonProperty("home")
    public String getHome() {
        return home;
    }

    /**
     * @param home The home
     */
    @JsonProperty("home")
    public void setHome(String home) {
        this.home = home;
    }

    /**
     * @return The away
     */
    @JsonProperty("away")
    public String getAway() {
        return away;
    }

    /**
     * @param away The away
     */
    @JsonProperty("away")
    public void setAway(String away) {
        this.away = away;
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