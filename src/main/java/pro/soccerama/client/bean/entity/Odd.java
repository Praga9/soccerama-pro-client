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
        "label",
        "value",
        "prev_value",
        "last_update",
        "winning"
})
public class Odd {

    @JsonProperty("label")
    private String label;
    @JsonProperty("value")
    private String value;
    @JsonProperty("prev_value")
    private String prevValue;
    @JsonProperty("last_update")
    private String lastUpdate;
    @JsonProperty("winning")
    private Object winning;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     * The label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     *
     * @return
     * The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value
     * The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @return
     * The prevValue
     */
    @JsonProperty("prev_value")
    public String getPrevValue() {
        return prevValue;
    }

    /**
     *
     * @param prevValue
     * The prev_value
     */
    @JsonProperty("prev_value")
    public void setPrevValue(String prevValue) {
        this.prevValue = prevValue;
    }

    /**
     *
     * @return
     * The lastUpdate
     */
    @JsonProperty("last_update")
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     *
     * @param lastUpdate
     * The last_update
     */
    @JsonProperty("last_update")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     *
     * @return
     * The winning
     */
    @JsonProperty("winning")
    public Object getWinning() {
        return winning;
    }

    /**
     *
     * @param winning
     * The winning
     */
    @JsonProperty("winning")
    public void setWinning(Object winning) {
        this.winning = winning;
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