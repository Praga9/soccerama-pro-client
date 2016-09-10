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

import pro.soccerama.client.bean.structure.TeamMatches;
import pro.soccerama.client.bean.structure.TeamPlayers;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "name",
        "logo",
        "twitter",
        "venue_id",
        "players",
        "venue",
        "matches",
        "coach_id",
        "chairman"
})
public class Team {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("venue_id")
    private Integer venueId;
    @JsonProperty("players")
    private TeamPlayers players;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("matches")
    private TeamMatches matches;
    @JsonProperty("coach_id")
    private Integer coachId;
    @JsonProperty("chairman_id")
    private Integer chairmanId;
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
     * @return The logo
     */
    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo The logo
     */
    @JsonProperty("logo")
    public void setLogo(final String logo) {
        this.logo = logo;
    }

    /**
     * @return The twitter
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     * @param twitter The twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(final String twitter) {
        this.twitter = twitter;
    }

    /**
     * @return The venueId
     */
    @JsonProperty("venue_id")
    public Integer getVenueId() {
        return venueId;
    }

    /**
     * @param venueId The venue_id
     */
    @JsonProperty("venue_id")
    public void setVenueId(final Integer venueId) {
        this.venueId = venueId;
    }

    /**
     * @return The players
     */
    @JsonProperty("players")
    public TeamPlayers getPlayers() {
        return players;
    }

    /**
     * @param players The players
     */
    @JsonProperty("players")
    public void setPlayers(final TeamPlayers players) {
        this.players = players;
    }

    /**
     * @return The venue
     */
    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    /**
     * @param venue The venue
     */
    @JsonProperty("venue")
    public void setVenue(final Venue venue) {
        this.venue = venue;
    }

    /**
     * @return The matches
     */
    @JsonProperty("matches")
    public TeamMatches getMatches() {
        return matches;
    }

    /**
     * @param matches The matches
     */
    @JsonProperty("matches")
    public void setMatches(final TeamMatches matches) {
        this.matches = matches;
    }

    @JsonProperty("coach_id")
    public Integer getCoachId() {
        return coachId;
    }

    @JsonProperty("coach_id")
    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    @JsonProperty("chairman_id")
    public Integer getChairmanId() {
        return chairmanId;
    }

    @JsonProperty("chairman_id")
    public void setChairmanId(Integer chairmanId) {
        this.chairmanId = chairmanId;
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