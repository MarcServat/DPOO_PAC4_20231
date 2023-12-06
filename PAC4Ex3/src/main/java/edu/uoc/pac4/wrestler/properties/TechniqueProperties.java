package edu.uoc.pac4.wrestler.properties;

public class TechniqueProperties implements WrestlerProperties {
    private double holds;

    public TechniqueProperties(double holds) {
        this.setHolds(holds);
    }

    public double getHolds() {
        return holds;
    }

    private void setHolds(double holds) {
        this.holds = holds < 0 || holds > 100 ? 50 : holds;
    }

    @Override
    public double getOverall() {
        return this.getHolds() / this.size();
    }

    @Override
    public int size() {
        return 1;
    }
}
