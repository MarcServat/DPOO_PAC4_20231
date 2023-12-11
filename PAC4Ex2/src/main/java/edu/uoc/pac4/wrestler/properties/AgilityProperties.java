package edu.uoc.pac4.wrestler.properties;

/**
 * Represents the agility properties of a wrestler, including speed, jump, and acrobatics.
 */
public class AgilityProperties implements WrestlerProperties {

    private double speed;
    private double jump;
    private double acrobatics;

    /**
     * Constructs AgilityProperties with the specified speed, jump, and acrobatics values.
     *
     * @param speed      The speed attribute of agility.
     * @param jump       The jump attribute of agility.
     * @param acrobatics The acrobatics attribute of agility.
     */
    public AgilityProperties(double speed, double jump, double acrobatics) {
        this.setSpeed(speed);
        this.setJump(jump);
        this.setAcrobatics(acrobatics);
    }

    /**
     * Gets the speed attribute of agility.
     *
     * @return The speed attribute.
     */
    public double getSpeed() {
        return speed;
    }

    private void setSpeed(double speed) {
        this.speed = speed < 0 || speed > 100 ? 50 : speed;
    }

    /**
     * Gets the jump attribute of agility.
     *
     * @return The jump attribute.
     */
    public double getJump() {
        return jump;
    }

    private void setJump(double jump) {
        this.jump = jump < 0 || jump > 100 ? 50 : jump;
    }

    /**
     * Gets the acrobatics attribute of agility.
     *
     * @return The acrobatics attribute.
     */
    public double getAcrobatics() {
        return acrobatics;
    }

    private void setAcrobatics(double acrobatics) {
        this.acrobatics = acrobatics < 0 || acrobatics > 100 ? 50 : acrobatics;
    }

    /**
     * Calculates the overall rating of agility based on speed, jump, and acrobatics attributes.
     *
     * @return The overall agility rating.
     */
    @Override
    public double getOverall() {
        return (this.getSpeed() +
                this.getJump() +
                this.getAcrobatics()) / this.size();
    }

    /**
     * Gets the number of attributes in agility (speed, jump, acrobatics).
     *
     * @return The number of attributes.
     */
    @Override
    public int size() {
        return 3;
    }
}
