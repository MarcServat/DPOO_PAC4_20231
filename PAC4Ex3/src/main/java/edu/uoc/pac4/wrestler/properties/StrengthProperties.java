package edu.uoc.pac4.wrestler.properties;

/**
 * Represents the strength properties of a wrestler, including arm power and leg power.
 */
public class StrengthProperties implements WrestlerProperties {

    private double armPower;
    private double legPower;

    /**
     * Constructs StrengthProperties with the specified arm power and leg power values.
     *
     * @param armPower The arm power attribute of strength.
     * @param legPower The leg power attribute of strength.
     */
    public StrengthProperties(double armPower, double legPower) {
        this.setArmPower(armPower);
        this.setLegPower(legPower);
    }

    /**
     * Gets the arm power attribute of strength.
     *
     * @return The arm power attribute.
     */
    public double getArmPower() {
        return armPower;
    }

    private void setArmPower(double armPower) {
        this.armPower = armPower < 0 || armPower > 100 ? 50 : armPower;
    }

    /**
     * Gets the leg power attribute of strength.
     *
     * @return The leg power attribute.
     */
    public double getLegPower() {
        return legPower;
    }

    private void setLegPower(double legPower) {
        this.legPower = legPower < 0 || legPower > 100 ? 50 : legPower;
    }

    /**
     * Calculates the overall rating of strength based on arm power and leg power attributes.
     *
     * @return The overall strength rating.
     */
    @Override
    public double getOverall() {
        return (this.getArmPower() + this.getLegPower()) / this.size();
    }

    /**
     * Gets the number of attributes in strength (arm power and leg power).
     *
     * @return The number of attributes.
     */
    @Override
    public int size() {
        return 2;
    }
}
