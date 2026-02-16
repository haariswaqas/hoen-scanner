package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a search request submitted by users.
 * This class is used to deserialize JSON-encoded POST requests.
 */
public class Search {

    @JsonProperty
    private String city;

    /**
     * Default constructor required for Jackson deserialization.
     */
    public Search() {
    }

    /**
     * Constructor with city parameter.
     * 
     * @param city the city to search for hotels and rental cars
     */
    public Search(String city) {
        this.city = city;
    }

    /**
     * Gets the city for this search.
     * 
     * @return the city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city for this search.
     * 
     * @param city the city name
     */
    public void setCity(String city) {
        this.city = city;
    }
}