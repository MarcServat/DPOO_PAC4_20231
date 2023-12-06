package edu.uoc.pac4.wrestler;

import edu.uoc.pac4.Speakable;
import edu.uoc.pac4.Superstar;
import edu.uoc.pac4.Gender;
import edu.uoc.pac4.SuperstarException;
import edu.uoc.pac4.wrestler.properties.*;

import java.time.LocalDate;
import java.util.Objects;

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

    private boolean isAttributeInRange(double value) {
        return value >= ATTRIBUTES_MIN_VALUE && value <= ATTRIBUTES_MAX_VALUE;
    }

    private boolean areAttributesSumInRange() {
        return (this.strength + this.agility + this.stamina + this.technique + this.defense) == ATTRIBUTES_SUM_VALUE;
    }

    public double getStrength() {
        return strength;
    }

    private void setStrength(double strength) throws WrestlerException {
        if (this.isAttributeInRange(strength)) {
            this.strength = strength;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "strength");
        }
    }

    public double getAgility() {
        return agility;
    }

    private void setAgility(double agility) throws WrestlerException {
        if (this.isAttributeInRange(agility)) {
            this.agility = agility;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "agility");
        }
    }

    public double getStamina() {
        return stamina;
    }

    private void setStamina(double stamina) throws WrestlerException {
        if (this.isAttributeInRange(stamina)) {
            this.stamina = stamina;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "stamina");
        }
    }

    public double getTechnique() {
        return technique;
    }

    private void setTechnique(double technique) throws WrestlerException {
        if (this.isAttributeInRange(technique)) {
            this.technique = technique;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "technique");
        }
    }

    public double getDefense() {
        return this.defense;
    }

    private void setDefense(double defense) throws WrestlerException {
        if (this.isAttributeInRange(defense)) {
            this.defense = defense;
        } else {
            throw new WrestlerException(WrestlerException.MSG_ERR_ATTRIBUTES_VALUES + "defense");
        }
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        if (energy < 0) this.energy = 0;
        else if (energy > 100) this.energy = 100;
        else this.energy = energy;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = Objects.requireNonNullElse(signature, DEFAULT_SIGNATURE);
    }

    public String getFinisher() {
        return finisher;
    }

    public void setFinisher(String finisher) {
        this.finisher = Objects.requireNonNullElse(finisher, DEFAULT_FINISHER);
    }

    public boolean isFace() {
        return isFace;
    }

    public void setFace(boolean face) {
        isFace = face;
    }

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

    public WeightClass getWeightClass() {
        return WeightClass.getWeightClass(this.getWeight());
    }

    @Override
    public void speak() {
        System.out.print("I'm the best wrestler in the world!!");
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + "\t" + "Signature: " + this.getSignature() + System.lineSeparator()
                + "\t" + "Finisher: " + this.getFinisher() + System.lineSeparator()
                + "\t" + "Overall: " + this.getOverall();
    }

    @Override
    public int compareTo(Wrestler wrestler) {
        return (int) Math.round(this.getOverall() - Objects.requireNonNull(wrestler).getOverall());
    }

}
