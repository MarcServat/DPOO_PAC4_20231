package edu.uoc.pac4;

/**
 * Represents the birthplace of a wrestler, including the city and country.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public class Birthplace {

    /**
     * The city where the wrestler was born.
     */
    String city;

    /**
     * The country where the wrestler was born.
     */
    String country;

    /**
     * Constructs a Birthplace with the specified city and country.
     *
     * @param city    The city where the wrestler was born.
     * @param country The country where the wrestler was born.
     */
    public Birthplace(String city, String country) {
        this.city = city;
        this.country = country;
    }

    /**
     * Gets the city where the wrestler was born.
     *
     * @return The city where the wrestler was born.
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets the country where the wrestler was born.
     *
     * @return The country where the wrestler was born.
     */
    public String getCountry() {
        return country;
    }
}
