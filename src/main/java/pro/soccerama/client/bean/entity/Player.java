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

import pro.soccerama.client.bean.structure.PlayerMatchEvents;
import pro.soccerama.client.bean.structure.PlayerMatchLineups;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"id", "name", "nationality",
        "birth_country",
        "birth_date",
        "birth_place",
        "height",
        "weight", "position", "team", "events", "lineups"})
public class Player {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nationality")
    private Object nationality;
    @JsonProperty("birth_country")
    private Object birthCountry;
    @JsonProperty("birth_date")
    private Object birthDate;
    @JsonProperty("birth_place")
    private Object birthPlace;
    @JsonProperty("height")
    private Object height;
    @JsonProperty("weight")
    private Object weight;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("team")
    private Team team;
    @JsonProperty("events")
    private PlayerMatchEvents events;
    @JsonProperty("lineups")
    private PlayerMatchLineups lineups;
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
    public Object getNationality() {
        return nationality;
    }

    /**
     * @param nationality The nationality
     */
    @JsonProperty("nationality")
    public void setNationality(Object nationality) {
        this.nationality = nationality;
    }

    /**
     * @return The birthCountry
     */
    @JsonProperty("birth_country")
    public Object getBirthCountry() {
        return birthCountry;
    }

    /**
     * @param birthCountry The birth_country
     */
    @JsonProperty("birth_country")
    public void setBirthCountry(Object birthCountry) {
        this.birthCountry = birthCountry;
    }

    /**
     * @return The birthDate
     */
    @JsonProperty("birth_date")
    public Object getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate The birth_date
     */
    @JsonProperty("birth_date")
    public void setBirthDate(Object birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return The birthPlace
     */
    @JsonProperty("birth_place")
    public Object getBirthPlace() {
        return birthPlace;
    }

    /**
     * @param birthPlace The birth_place
     */
    @JsonProperty("birth_place")
    public void setBirthPlace(Object birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * @return The height
     */
    @JsonProperty("height")
    public Object getHeight() {
        return height;
    }

    /**
     * @param height The height
     */
    @JsonProperty("height")
    public void setHeight(Object height) {
        this.height = height;
    }

    /**
     * @return The weight
     */
    @JsonProperty("weight")
    public Object getWeight() {
        return weight;
    }

    /**
     * @param weight The weight
     */
    @JsonProperty("weight")
    public void setWeight(Object weight) {
        this.weight = weight;
    }

    /**
     * @return The position
     */
    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    /**
     * @param position The position
     */
    @JsonProperty("position")
    public void setPosition(final Position position) {
        this.position = position;
    }

    /**
     * @return The team
     */
    @JsonProperty("team")
    public Team getTeam() {
        return team;
    }

    /**
     * @param team The team
     */
    @JsonProperty("team")
    public void setTeam(final Team team) {
        this.team = team;
    }

    /**
     * @return The events
     */
    @JsonProperty("events")
    public PlayerMatchEvents getEvents() {
        return events;
    }

    /**
     * @param events The events
     */
    @JsonProperty("events")
    public void setEvents(final PlayerMatchEvents events) {
        this.events = events;
    }

    /**
     * @return The lineups
     */
    @JsonProperty("lineups")
    public PlayerMatchLineups getLineups() {
        return lineups;
    }

    /**
     * @param lineups The lineups
     */
    @JsonProperty("lineups")
    public void setLineups(final PlayerMatchLineups lineups) {
        this.lineups = lineups;
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
