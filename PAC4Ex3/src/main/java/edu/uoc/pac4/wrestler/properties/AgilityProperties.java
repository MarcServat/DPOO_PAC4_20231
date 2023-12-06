package edu.uoc.pac4.wrestler.properties;

public class AgilityProperties implements WrestlerProperties {
    private double speed;
    private double jump;
    private double acrobatics;

    public AgilityProperties(double speed, double jump, double acrobatics) {
        this.setSpeed(speed);
        this.setJump(jump);
        this.setAcrobatics(acrobatics);
    }

    public double getSpeed() {
        return speed;
    }

    private void setSpeed(double speed) {
        this.speed = speed < 0 || speed > 100 ? 50 : speed;
    }

    public double getJump() {
        return jump;
    }

    private void setJump(double jump) {
        this.jump = jump < 0 || jump > 100 ? 50 : jump;
    }

    public double getAcrobatics() {
        return acrobatics;
    }

    private void setAcrobatics(double acrobatics) {
        this.acrobatics = acrobatics < 0 || acrobatics > 100 ? 50 : acrobatics;
    }

    @Override
    public double getOverall() {
        return (this.getSpeed() +
                this.getJump() +
                this.getAcrobatics()) / this.size();
    }

    @Override
    public int size() {
        return 3;
    }
}
