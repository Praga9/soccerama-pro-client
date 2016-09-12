package pro.soccerama.client.bean.entity;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"id", "name", "nationality",
        "birth_country",
        "birth_date",
        "birth_place",
        "height",
        "weight",
        "photo"})
public class Chairman {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("birth_country")
    private String birthCountry;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("birth_place")
    private String birthPlace;
    @JsonProperty("height")
    private String height;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("photo")
    private String photo;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return The nationality
     */
    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality The nationality
     */
    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return The birthCountry
     */
    @JsonProperty("birth_country")
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * @param birthCountry The birth_country
     */
    @JsonProperty("birth_country")
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    /**
     * @return The birthDate
     */
    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate The birth_date
     */
    @JsonProperty("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return The birthPlace
     */
    @JsonProperty("birth_place")
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * @param birthPlace The birth_place
     */
    @JsonProperty("birth_place")
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * @return The height
     */
    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    /**
     * @param height The height
     */
    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return The weight
     */
    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight The weight
     */
    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    @JsonProperty("photo")
    public String getPhoto() {
        return photo;
    }

    /**
     *
     * @param photo
     */
    @JsonProperty("photo")
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * @param name
     * @param value
     */
    @JsonAnySetter
    public void setAdditionalProperty(final String name, final Object value) {
        additionalProperties.put(name, value);
    }

}
