package edu.uoc.pac4.wrestler.properties;

/**
 * Represents the technique properties of a wrestler, including the holds attribute.
 */
public class TechniqueProperties implements WrestlerProperties {

    private double holds;

    /**
     * Constructs TechniqueProperties with the specified holds attribute value.
     *
     * @param holds The holds attribute of technique.
     */
    public TechniqueProperties(double holds) {
        this.setHolds(holds);
    }

    /**
     * Gets the holds attribute of technique.
     *
     * @return The holds attribute.
     */
    public double getHolds() {
        return holds;
    }

    private void setHolds(double holds) {
        this.holds = holds < 0 || holds > 100 ? 50 : holds;
    }

    /**
     * Calculates the overall rating of technique based on the holds attribute.
     *
     * @return The overall technique rating.
     */
    @Override
    public double getOverall() {
        return this.getHolds() / this.size();
    }

    /**
     * Gets the number of attributes in technique (holds).
     *
     * @return The number of attributes.
     */
    @Override
    public int size() {
        return 1;
    }
}
