package edu.uoc.pac4;

/**
 * Represents a wrestler with various attributes and properties.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public class Wrestler {

    /**
     * The birth name of the wrestler.
     */
    String birthName;

    /**
     * The ring name of the wrestler.
     */
    String ringName;

    /**
     * The birthplace of the wrestler.
     */
    Birthplace birthplace;

    /**
     * The properties of the wrestler, including strength, agility, stamina, technique, and defense.
     */
    WrestlerProperties properties;

    /**
     * Constructs a new Wrestler with the specified attributes.
     *
     * @param birthName The birth name of the wrestler.
     * @param ringName  The ring name of the wrestler.
     * @param city      The city of birth for the wrestler.
     * @param country   The country of birth for the wrestler.
     * @param strength  The strength attribute of the wrestler.
     * @param agility   The agility attribute of the wrestler.
     * @param stamina   The stamina attribute of the wrestler.
     * @param technique The technique attribute of the wrestler.
     * @param defense   The defense attribute of the wrestler.
     */
    public Wrestler(String birthName, String ringName, String city, String country,
                    double strength, double agility, double stamina, double technique, double defense) {
        setBirthName(birthName);
        setRingName(ringName);
        birthplace = new Birthplace(city, country);
        properties = new WrestlerProperties(strength, agility, stamina, technique, defense);
    }

    /**
     * Gets the birth name of the wrestler.
     *
     * @return The birth name of the wrestler.
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * Sets the birth name of the wrestler.
     *
     * @param birthName The new birth name of the wrestler.
     */
    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    /**
     * Gets the ring name of the wrestler.
     *
     * @return The ring name of the wrestler.
     */
    public String getRingName() {
        return ringName;
    }

    /**
     * Sets the ring name of the wrestler.
     *
     * @param ringName The new ring name of the wrestler.
     */
    public void setRingName(String ringName) {
        this.ringName = ringName;
    }

    /**
     * Gets the birthplace of the wrestler.
     *
     * @return The birthplace of the wrestler.
     */
    public Birthplace getBirthplace() {
        return birthplace;
    }

    /**
     * Gets the properties of the wrestler.
     *
     * @return The properties of the wrestler.
     */
    public WrestlerProperties getProperties() {
        return properties;
    }

    /**
     * Creates a clone of the wrestler.
     *
     * @return A new Wrestler object with the same attributes as the current wrestler.
     * @throws CloneNotSupportedException If cloning is not supported.
     */
    public Wrestler clone() throws CloneNotSupportedException {
        return new Wrestler(
                this.getBirthName(),
                this.getRingName(),
                birthplace.getCity(),
                birthplace.getCountry(),
                properties.getStrength(),
                properties.getAgility(),
                properties.getStamina(),
                properties.getTechnique(),
                properties.getDefense());
    }
}
