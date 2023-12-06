package edu.uoc.pac4.wrestler;

public enum WeightClass {
    LIGHT_HEAVYWEIGHT(0, 85),
    CRUISERWEIGHT(85.01, 99),
    HEAVYWEIGHT(99.01, 120),
    SUPER_HEAVYWEIGHT(120.01, Double.POSITIVE_INFINITY);
    private double min;
    private double max;

    private WeightClass(double min, double max) {
        this.setMin(min);
        this.setMax(max);
    }

    public double getMin() {
        return min;
    }

    private void setMin(double min) {
        this.min = min < 0 ? 0 : min;
    }

    public double getMax() {
        return this.max;
    }

    private void setMax(double max) {
        this.max = max < this.min || max < 0 ? this.min : max;
    }

    public static WeightClass getWeightClass(double weight) {
        for (WeightClass weightClass : values()) {
            if (weight >= weightClass.getMin() && weight <= weightClass.getMax()) {
                return weightClass;
            }
        }
        return null;
    }

    public boolean isHeavier(WeightClass weightClass) {
        return (this.ordinal() - weightClass.ordinal()) > 0;
    }

}
