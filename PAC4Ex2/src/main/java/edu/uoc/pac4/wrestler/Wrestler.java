package edu.uoc.pac4.wrestler;

import edu.uoc.pac4.Gender;
import edu.uoc.pac4.Speakable;
import edu.uoc.pac4.Superstar;
import edu.uoc.pac4.SuperstarException;
import edu.uoc.pac4.wrestler.properties.*;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The {@code Wrestler} class represents a wrestler, extending the {@link Superstar} class. It provides attributes
 * related to wrestling skills and properties that contribute to the wrestler's overall performance. This class
 * implements the {@link Speakable} interface, allowing instances to produce speech, and the {@link Comparable}
 * interface to enable comparison based on overall performance.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public abstract class Wrestler extends Superstar implements Comparable<Wrestler>, Speakable {
    private double strength = 20;
    private double agility = 20;
    private double stamina = 20;
    private double technique = 20;
    private double defense = 20;
    private double energy = 100;
    private String signature = "Superkick";
    private String finisher = "Canadian Destroyer";
    private boolean isFace = true;

    private WrestlerProperties[] properties = {};

    public static final int ATTRIBUTES_MIN_VALUE = 1;
    public static final int ATTRIBUTES_MAX_VALUE = 96;
    private static final int ATTRIBUTES_SUM_VALUE = 100;
    private static final String DEFAULT_SIGNATURE = "Superkick";
    private static final String DEFAULT_FINISHER = "Canadian Destroyer";

    /**
     * Creates a new instance of {@code Wrestler} with specified attributes and properties. Validates the attributes
     * and ensures the sum of attributes is within the allowed range.
     *
     * @param birthName  The birth name of the wrestler.
     * @param birthDate  The birthdate of the wrestler.
     * @param birthplace The birthplace of the wrestler.
     * @param gender     The gender of the wrestler.
     * @param height     The height of the wrestler.
     * @param weight     The weight of the wrestler.
     * @param ringName   The ring name of the wrestler.
     * @param strength   The strength attribute of the wrestler.
     * @param agility    The agility attribute of the wrestler.
     * @param stamina    The stamina attribute of the wrestler.
     * @param technique  The technique attribute of the wrestler.
     * @param defense    The defense attribute of the wrestler.
     * @throws SuperstarException If there is an issue with the superclass constructor.
     * @throws WrestlerException  If there is an issue with wrestler attribute validation.
     */
    protected Wrestler(String birthName, LocalDate birthDate, String birthplace, Gender gender, double height,
                       double weight, String ringName, double strength, double agility, double stamina,
                       double technique,
                       double defense) throws SuperstarException, WrestlerException {
        super(birthName, birthDate, birthplace, gender, height, weight, ringName);
        this.setStrength(strength);
        this.setAgility(agility);
        this.setStamina(stamina);
        this.setTechnique(technique);
        this.setDefense(defense);
        this.setEnergy(this.energy);
        this.setFace(this.isFace);
        this.setSignature(DEFAULT_SIGNATURE);
        this.setFinisher(DEFAULT_FINISHER);
        if (!this.areAttributesSumInRange()) {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_MAX_VALUE);
        }
    }

    /**
     * Checks if a given attribute value is within the allowed range.
     *
     * @param value The attribute value to check.
     * @return {@code true} if the value is within the allowed range, otherwise {@code false}.
     */
    private boolean isAttributeInRange(double value) {
        return value >= ATTRIBUTES_MIN_VALUE && value <= ATTRIBUTES_MAX_VALUE;
    }


    /**
     * Checks if the sum of wrestler attributes is within the allowed range.
     *
     * @return {@code true} if the sum is within the allowed range, otherwise {@code false}.
     */
    private boolean areAttributesSumInRange() {
        return (this.strength + this.agility + this.stamina + this.technique + this.defense) == ATTRIBUTES_SUM_VALUE;
    }

    /**
     * Gets the strength attribute of the wrestler.
     *
     * @return The strength attribute.
     */
    public double getStrength() {
        return strength;
    }

    /**
     * Sets the strength attribute of the wrestler.
     *
     * @param strength The strength attribute to set.
     * @throws WrestlerException If the provided strength value is outside the allowed range.
     */
    private void setStrength(double strength) throws WrestlerException {
        if (this.isAttributeInRange(strength)) {
            this.strength = strength;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "strength");
        }
    }

    /**
     * Gets the agility attribute of the wrestler.
     *
     * @return The agility attribute.
     */
    public double getAgility() {
        return agility;
    }

    /**
     * Sets the agility attribute of the wrestler.
     *
     * @param agility The agility attribute to set.
     * @throws WrestlerException If the provided agility value is outside the allowed range.
     */
    private void setAgility(double agility) throws WrestlerException {
        if (this.isAttributeInRange(agility)) {
            this.agility = agility;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "agility");
        }
    }

    /**
     * Gets the stamina attribute of the wrestler.
     *
     * @return The stamina attribute.
     */
    public double getStamina() {
        return stamina;
    }

    /**
     * Sets the stamina attribute of the wrestler.
     *
     * @param stamina The stamina attribute to set.
     * @throws WrestlerException If the provided stamina value is outside the allowed range.
     */
    private void setStamina(double stamina) throws WrestlerException {
        if (this.isAttributeInRange(stamina)) {
            this.stamina = stamina;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "stamina");
        }
    }

    /**
     * Gets the technique attribute of the wrestler.
     *
     * @return The technique attribute.
     */
    public double getTechnique() {
        return technique;
    }

    /**
     * Sets the technique attribute of the wrestler.
     *
     * @param technique The technique attribute to set.
     * @throws WrestlerException If the provided technique value is outside the allowed range.
     */
    private void setTechnique(double technique) throws WrestlerException {
        if (this.isAttributeInRange(technique)) {
            this.technique = technique;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "technique");
        }
    }

    /**
     * Gets the defense attribute of the wrestler.
     *
     * @return The defense attribute.
     */
    public double getDefense() {
        return this.defense;
    }

    /**
     * Sets the defense attribute of the wrestler.
     *
     * @param defense The defense attribute to set.
     * @throws WrestlerException If the provided defense value is outside the allowed range.
     */
    private void setDefense(double defense) throws WrestlerException {
        if (this.isAttributeInRange(defense)) {
            this.defense = defense;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "defense");
        }
    }

    /**
     * Gets the energy level of the wrestler.
     *
     * @return The energy level.
     */
    public double getEnergy() {
        return energy;
    }

    /**
     * Sets the energy level of the wrestler, ensuring it is within the range [0, 100].
     *
     * @param energy The energy level to set.
     */
    public void setEnergy(double energy) {
        if (energy < 0) this.energy = 0;
        else if (energy > 100) this.energy = 100;
        else this.energy = energy;
    }

    /**
     * Gets the signature move of the wrestler.
     *
     * @return The signature move.
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the signature move of the wrestler.
     *
     * @param signature The signature move to set.
     */
    public void setSignature(String signature) {
        this.signature = Objects.requireNonNullElse(signature, DEFAULT_SIGNATURE);
    }


    /**
     * Gets the finishing move of the wrestler.
     *
     * @return The finishing move.
     */
    public String getFinisher() {
        return finisher;
    }

    /**
     * Sets the finishing move of the wrestler.
     *
     * @param finisher The finishing move to set.
     */
    public void setFinisher(String finisher) {
        this.finisher = Objects.requireNonNullElse(finisher, DEFAULT_FINISHER);
    }

    /**
     * Checks if the wrestler is considered a "face" (good guy) or "heel" (bad guy).
     *
     * @return {@code true} if the wrestler is a "face," {@code false} if the wrestler is a "heel."
     */
    public boolean isFace() {
        return isFace;
    }

    /**
     * Sets whether the wrestler is a "face" (good guy) or "heel" (bad guy).
     *
     * @param face {@code true} if the wrestler is a "face," {@code false} if the wrestler is a "heel."
     */
    public void setFace(boolean face) {
        isFace = face;
    }

    /**
     * Sets the additional properties of the wrestler.
     *
     * @param properties The array of properties to set.
     * @throws WrestlerException If the provided array of properties is null or contains null elements.
     */
    public void setProperties(WrestlerProperties[] properties) throws WrestlerException {
        if (properties == null) {
            throw new WrestlerException(WrestlerException.MSG_ERR_PROPERTIES_NULL);
        } else {
            for (WrestlerProperties property : properties) {
                if (property == null) {
                    throw new WrestlerException(WrestlerException.MSG_ERR_PROPERTIES_NULL);
                } else {
                    this.properties = properties;
                }
            }
        }
    }

    /**
     * Calculates and retrieves the overall performance score of the wrestler based on attributes and properties.
     *
     * @return The overall performance score.
     */
    public double getOverall() {
        double sum = 0.0;
        double totalWeight = this.strength + this.agility + this.stamina + this.technique + this.defense;
        for (WrestlerProperties property : this.properties) {
            if (property instanceof StrengthProperties) {
                sum += property.getOverall() * this.strength;
            } else if (property instanceof AgilityProperties) {
                sum += property.getOverall() * this.agility;
            } else if (property instanceof StaminaProperties) {
                sum += property.getOverall() * this.stamina;
            } else if (property instanceof TechniqueProperties) {
                sum += property.getOverall() * this.technique;
            } else {
                sum += property.getOverall() * this.defense;
            }
        }
        return Math.round(sum / totalWeight);
    }

    /**
     * Gets the weight class of the wrestler based on their weight.
     *
     * @return The weight class of the wrestler.
     * @see WeightClass
     */
    public WeightClass getWeightClass() {
        return WeightClass.getWeightClass(this.getWeight());
    }

    /**
     * Produces speech output, indicating that the wrestler is the best in the world.
     */
    @Override
    public void speak() {
        System.out.print("I'm the best wrestler in the world!!");
    }

    /**
     * Gets a string representation of the wrestler, including additional details such as signature, finisher,
     * and overall performance.
     *
     * @return A string representation of the wrestler.
     */
    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + "\t" + "Signature: " + this.getSignature() + System.lineSeparator()
                + "\t" + "Finisher: " + this.getFinisher() + System.lineSeparator()
                + "\t" + "Overall: " + this.getOverall();
    }

    /**
     * Compares this wrestler to another wrestler based on their overall performance.
     *
     * @param wrestler The wrestler to compare to.
     * @return A negative integer, zero, or a positive integer if this wrestler is less than, equal to,
     * or greater than the specified wrestler.
     */
    @Override
    public int compareTo(Wrestler wrestler) {
        return (int) Math.round(this.getOverall() - Objects.requireNonNull(wrestler).getOverall());
    }

}
