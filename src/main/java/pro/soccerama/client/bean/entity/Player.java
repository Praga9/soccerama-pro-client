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
@JsonPropertyOrder({ "id", "name", "short_number", "fullname", "nationality",
        "birth_country",
        "birth_date",
        "birth_place",
        "height",
        "weight", "photo", "position", "team", "events", "lineups"})
public class Player {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
	@JsonProperty("short_number")
	private String shortNumber;
	@JsonProperty("fullname")
	private String fullName;
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
	 *
	 * @return
	 */
	@JsonProperty("shirt_number")
	public String getShortNumber() {
		return shortNumber;
	}

	/**
	 *
	 * @param shortNumber
	 */
	@JsonProperty("shirt_number")
	public void setShortNumber(final String shortNumber) {
		this.shortNumber = shortNumber;
	}

	/**
	 *
	 * @return
	 */
	@JsonProperty("fullname")
	public String getFullName() {
		return fullName;
	}

	/**
	 *
	 * @param fullName
	 */
	@JsonProperty("fullname")
	public void setFullName(final String fullName) {
		this.fullName = fullName;
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
