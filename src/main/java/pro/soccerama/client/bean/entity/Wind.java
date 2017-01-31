package pro.soccerama.client.bean.entity;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 21/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "speed", "degree"})
public class Wind {

    @JsonProperty("speed")
    private String speed;
    @JsonProperty("degree")
    private Float degree;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("speed")
    public String getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @JsonProperty("degree")
    public Float getDegree() {
        return degree;
    }

    @JsonProperty("degree")
    public void setDegree(Float degree) {
        this.degree = degree;
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
