package edu.uoc.pac4.wrestler.properties;

/**
 * Represents the defense properties of a wrestler, including strike reversal, grapple reversal, aerial reversal, and submission defense.
 */
public class DefenseProperties implements WrestlerProperties {

    private double strikeReversal;
    private double grappleReversal;
    private double aerialReversal;
    private double submissionDefense;

    /**
     * Constructs DefenseProperties with the specified strike reversal, grapple reversal, aerial reversal, and submission defense values.
     *
     * @param strikeReversal    The strike reversal attribute of defense.
     * @param grappleReversal   The grapple reversal attribute of defense.
     * @param aerialReversal    The aerial reversal attribute of defense.
     * @param submissionDefense The submission defense attribute of defense.
     */
    public DefenseProperties(double strikeReversal, double grappleReversal, double aerialReversal,
                             double submissionDefense) {
        this.setStrikeReversal(strikeReversal);
        this.setGrappleReversal(grappleReversal);
        this.setAerialReversal(aerialReversal);
        this.setSubmissionDefense(submissionDefense);
    }

    /**
     * Gets the strike reversal attribute of defense.
     *
     * @return The strike reversal attribute.
     */
    public double getStrikeReversal() {
        return strikeReversal;
    }

    private void setStrikeReversal(double strikeReversal) {
        this.strikeReversal = strikeReversal < 0 || strikeReversal > 100 ? 50 : strikeReversal;
    }

    /**
     * Gets the grapple reversal attribute of defense.
     *
     * @return The grapple reversal attribute.
     */
    public double getGrappleReversal() {
        return grappleReversal;
    }

    private void setGrappleReversal(double grappleReversal) {
        this.grappleReversal = grappleReversal < 0 || grappleReversal > 100 ? 50 : grappleReversal;
    }

    /**
     * Gets the aerial reversal attribute of defense.
     *
     * @return The aerial reversal attribute.
     */
    public double getAerialReversal() {
        return aerialReversal;
    }

    private void setAerialReversal(double aerialReversal) {
        this.aerialReversal = aerialReversal < 0 || aerialReversal > 100 ? 50 : aerialReversal;
    }

    /**
     * Gets the submission defense attribute of defense.
     *
     * @return The submission defense attribute.
     */
    public double getSubmissionDefense() {
        return submissionDefense;
    }

    private void setSubmissionDefense(double submissionDefense) {
        this.submissionDefense = submissionDefense < 0 || submissionDefense > 100 ? 50 : submissionDefense;
    }

    /**
     * Calculates the overall rating of defense based on strike reversal, grapple reversal, aerial reversal, and submission defense attributes.
     *
     * @return The overall defense rating.
     */
    @Override
    public double getOverall() {
        return (this.getStrikeReversal() +
                this.getGrappleReversal() +
                this.getAerialReversal() +
                this.getSubmissionDefense()) / this.size();
    }

    /**
     * Gets the number of attributes in defense (strike reversal, grapple reversal, aerial reversal, submission defense).
     *
     * @return The number of attributes.
     */
    @Override
    public int size() {
        return 4;
    }
}
