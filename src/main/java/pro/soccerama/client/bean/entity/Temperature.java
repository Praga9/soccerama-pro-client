package pro.soccerama.client.bean.entity;

import javax.annotation.Generated;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 21/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "temp", "unit"})
public class Temperature {

    @JsonProperty("temp")
    private Float temp;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("temp")
    public Float getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Float temp) {
        this.temp = temp;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
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
