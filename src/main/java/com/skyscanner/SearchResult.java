package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a search result to be returned to users.
 * This class is used to serialize search results to JSON-encoded responses.
 */
public class SearchResult {

    @JsonProperty
    private String city;

    @JsonProperty
    private String kind;

    @JsonProperty
    private String title;

    /**
     * Default constructor required for Jackson deserialization.
     */
    public SearchResult() {
    }

    /**
     * Constructor with all fields.
     * 
     * @param city  the city where the result is located
     * @param kind  the type of result (e.g., "hotel" or "rental_car")
     * @param title the name/title of the hotel or rental car company
     */
    public SearchResult(String city, String kind, String title) {
        this.city = city;
        this.kind = kind;
        this.title = title;
    }

    /**
     * Gets the city for this search result.
     * 
     * @return the city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city for this search result.
     * 
     * @param city the city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the kind of search result.
     * 
     * @return the kind (e.g., "hotel" or "rental_car")
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the kind of search result.
     * 
     * @param kind the kind (e.g., "hotel" or "rental_car")
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Gets the title of this search result.
     * 
     * @return the title/name of the hotel or rental car company
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of this search result.
     * 
     * @param title the title/name of the hotel or rental car company
     */
    public void setTitle(String title) {
        this.title = title;
    }
}