package edu.uoc.pac4.wrestler;

/**
 * Enum representing different weight classes for wrestlers.
 */
public enum WeightClass {
    LIGHT_HEAVYWEIGHT(0, 85),
    CRUISERWEIGHT(85.01, 99),
    HEAVYWEIGHT(99.01, 120),
    SUPER_HEAVYWEIGHT(120.01, Double.POSITIVE_INFINITY);

    private double min;
    private double max;

    /**
     * Constructs a WeightClass with specified minimum and maximum weight values.
     *
     * @param min The minimum weight for the weight class.
     * @param max The maximum weight for the weight class.
     */
    private WeightClass(double min, double max) {
        this.setMin(min);
        this.setMax(max);
    }

    /**
     * Gets the minimum weight for the weight class.
     *
     * @return The minimum weight.
     */
    public double getMin() {
        return min;
    }

    /**
     * Sets the minimum weight for the weight class, ensuring it is not less than 0.
     *
     * @param min The minimum weight to set.
     */
    private void setMin(double min) {
        this.min = min < 0 ? 0 : min;
    }

    /**
     * Gets the maximum weight for the weight class.
     *
     * @return The maximum weight.
     */
    public double getMax() {
        return this.max;
    }

    /**
     * Sets the maximum weight for the weight class, ensuring it is not less than the minimum weight or 0.
     *
     * @param max The maximum weight to set.
     */
    private void setMax(double max) {
        this.max = max < this.min || max < 0 ? this.min : max;
    }

    /**
     * Gets the WeightClass based on a given weight value.
     *
     * @param weight The weight value.
     * @return The WeightClass for the specified weight value, or null if not found.
     */
    public static WeightClass getWeightClass(double weight) {
        for (WeightClass weightClass : values()) {
            if (weight >= weightClass.getMin() && weight <= weightClass.getMax()) {
                return weightClass;
            }
        }
        return null;
    }

    /**
     * Checks if the current weight class is heavier than another weight class.
     *
     * @param weightClass The other weight class for comparison.
     * @return {@code true} if the current weight class is heavier, {@code false} otherwise.
     */
    public boolean isHeavier(WeightClass weightClass) {
        return (this.ordinal() - weightClass.ordinal()) > 0;
    }
}
