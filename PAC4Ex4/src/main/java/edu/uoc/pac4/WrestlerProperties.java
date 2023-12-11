package edu.uoc.pac4;

/**
 * Represents the properties of a wrestler, including strength, agility, stamina, technique, and defense.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public class WrestlerProperties {

    /**
     * The strength attribute of the wrestler.
     */
    double strength;

    /**
     * The agility attribute of the wrestler.
     */
    double agility;

    /**
     * The stamina attribute of the wrestler.
     */
    double stamina;

    /**
     * The technique attribute of the wrestler.
     */
    double technique;

    /**
     * The defense attribute of the wrestler.
     */
    double defense;

    /**
     * Constructs WrestlerProperties with the specified attributes.
     *
     * @param strength  The strength attribute of the wrestler.
     * @param agility   The agility attribute of the wrestler.
     * @param stamina   The stamina attribute of the wrestler.
     * @param technique The technique attribute of the wrestler.
     * @param defense   The defense attribute of the wrestler.
     */
    public WrestlerProperties(double strength, double agility, double stamina, double technique, double defense) {
        this.strength = strength;
        this.agility = agility;
        this.stamina = stamina;
        this.technique = technique;
        this.defense = defense;
    }

    /**
     * Gets the strength attribute of the wrestler.
     *
     * @return The strength attribute of the wrestler.
     */
    public double getStrength() {
        return strength;
    }

    /**
     * Gets the agility attribute of the wrestler.
     *
     * @return The agility attribute of the wrestler.
     */
    public double getAgility() {
        return agility;
    }

    /**
     * Gets the stamina attribute of the wrestler.
     *
     * @return The stamina attribute of the wrestler.
     */
    public double getStamina() {
        return stamina;
    }

    /**
     * Gets the technique attribute of the wrestler.
     *
     * @return The technique attribute of the wrestler.
     */
    public double getTechnique() {
        return technique;
    }

    /**
     * Gets the defense attribute of the wrestler.
     *
     * @return The defense attribute of the wrestler.
     */
    public double getDefense() {
        return defense;
    }
}
