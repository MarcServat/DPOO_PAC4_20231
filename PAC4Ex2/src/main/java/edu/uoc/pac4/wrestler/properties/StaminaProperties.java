package edu.uoc.pac4.wrestler.properties;

public class StaminaProperties implements WrestlerProperties {
    private double bodyDurability;
    private double armDurability;
    private double legDurability;

    public StaminaProperties(double bodyDurability, double armDurability, double legDurability) {
        this.setBodyDurability(bodyDurability);
        this.setArmDurability(armDurability);
        this.setLegDurability(legDurability);
    }

    public double getBodyDurability() {
        return bodyDurability;
    }

    private void setBodyDurability(double bodyDurability) {
        this.bodyDurability = bodyDurability < 0 || bodyDurability > 100 ? 50 : bodyDurability;
    }

    public double getArmDurability() {
        return armDurability;
    }

    private void setArmDurability(double armDurability) {
        this.armDurability = armDurability < 0 || armDurability > 100 ? 50 : armDurability;
    }

    public double getLegDurability() {
        return legDurability;
    }

    private void setLegDurability(double legDurability) {
        this.legDurability = legDurability < 0 || legDurability > 100 ? 50 : legDurability;
    }

    @Override
    public double getOverall() {
        return (this.getBodyDurability()
                + this.getArmDurability()
                + this.getLegDurability()) / this.size();
    }

    @Override
    public int size() {
        return 3;
    }
}
