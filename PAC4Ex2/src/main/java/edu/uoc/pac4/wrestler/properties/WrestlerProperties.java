package edu.uoc.pac4.wrestler.properties;

/**
 * Interface representing the properties of a wrestler, providing methods to calculate the overall rating
 * and get the number of attributes.
 */
public interface WrestlerProperties {

    /**
     * Calculates the overall rating based on the wrestler's attributes.
     *
     * @return The overall rating.
     */
    double getOverall();

    /**
     * Gets the number of attributes in the wrestler's properties.
     *
     * @return The number of attributes.
     */
    int size();
}
