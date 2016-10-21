package pro.soccerama.client.bean.entity;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Created by kevin on 21/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "type", "icon", "temperature", "clouds", "humidity", "wind"})
public class Weather {

    @JsonProperty("type")
    private String type;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("temperature")
    private Temperature temperature;
    @JsonProperty("clouds")
    private String clouds;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("wind")
    private Wind wind;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("clouds")
    public String getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(String clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("humidity")
    public String getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
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
