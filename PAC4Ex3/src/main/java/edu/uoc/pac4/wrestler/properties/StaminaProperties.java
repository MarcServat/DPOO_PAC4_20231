package edu.uoc.pac4.wrestler.properties;

/**
 * Represents the stamina properties of a wrestler, including body durability, arm durability, and leg durability.
 */
public class StaminaProperties implements WrestlerProperties {

    private double bodyDurability;
    private double armDurability;
    private double legDurability;

    /**
     * Constructs StaminaProperties with the specified body durability, arm durability, and leg durability values.
     *
     * @param bodyDurability The body durability attribute of stamina.
     * @param armDurability  The arm durability attribute of stamina.
     * @param legDurability  The leg durability attribute of stamina.
     */
    public StaminaProperties(double bodyDurability, double armDurability, double legDurability) {
        this.setBodyDurability(bodyDurability);
        this.setArmDurability(armDurability);
        this.setLegDurability(legDurability);
    }

    /**
     * Gets the body durability attribute of stamina.
     *
     * @return The body durability attribute.
     */
    public double getBodyDurability() {
        return bodyDurability;
    }

    private void setBodyDurability(double bodyDurability) {
        this.bodyDurability = bodyDurability < 0 || bodyDurability > 100 ? 50 : bodyDurability;
    }

    /**
     * Gets the arm durability attribute of stamina.
     *
     * @return The arm durability attribute.
     */
    public double getArmDurability() {
        return armDurability;
    }

    private void setArmDurability(double armDurability) {
        this.armDurability = armDurability < 0 || armDurability > 100 ? 50 : armDurability;
    }

    /**
     * Gets the leg durability attribute of stamina.
     *
     * @return The leg durability attribute.
     */
    public double getLegDurability() {
        return legDurability;
    }

    private void setLegDurability(double legDurability) {
        this.legDurability = legDurability < 0 || legDurability > 100 ? 50 : legDurability;
    }

    /**
     * Calculates the overall rating of stamina based on body durability, arm durability, and leg durability attributes.
     *
     * @return The overall stamina rating.
     */
    @Override
    public double getOverall() {
        return (this.getBodyDurability()
                + this.getArmDurability()
                + this.getLegDurability()) / this.size();
    }

    /**
     * Gets the number of attributes in stamina (body durability, arm durability, leg durability).
     *
     * @return The number of attributes.
     */
    @Override
    public int size() {
        return 3;
    }
}
