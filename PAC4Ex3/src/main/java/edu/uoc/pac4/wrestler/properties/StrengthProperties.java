package edu.uoc.pac4.wrestler.properties;

public class StrengthProperties implements WrestlerProperties {
    private double armPower;
    private double legPower;

    public StrengthProperties(double armPower, double legPower) {
        this.setArmPower(armPower);
        this.setLegPower(legPower);
    }

    public double getArmPower() {
        return armPower;
    }

    private void setArmPower(double armPower) {
        this.armPower = armPower < 0 || armPower > 100 ? 50 : armPower;
    }

    public double getLegPower() {
        return legPower;
    }

    private void setLegPower(double legPower) {
        this.legPower = legPower < 0 || legPower > 100 ? 50 : legPower;
    }

    @Override
    public double getOverall() {
        return (this.getArmPower() + this.getLegPower()) / this.size();
    }

    @Override
    public int size() {
        return 2;
    }
}
