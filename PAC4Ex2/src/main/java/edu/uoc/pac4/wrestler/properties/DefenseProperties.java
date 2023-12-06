package edu.uoc.pac4.wrestler.properties;

public class DefenseProperties implements WrestlerProperties {
    private double strikeReversal;
    private double grappleReversal;
    private double aerialReversal;
    private double submissionDefense;

    public DefenseProperties(double strikeReversal, double grappleReversal, double aerialReversal,
                             double submissionDefense) {
        this.setStrikeReversal(strikeReversal);
        this.setGrappleReversal(grappleReversal);
        this.setAerialReversal(aerialReversal);
        this.setSubmissionDefense(submissionDefense);
    }

    public double getStrikeReversal() {
        return strikeReversal;
    }

    private void setStrikeReversal(double strikeReversal) {
        this.strikeReversal = strikeReversal < 0 || strikeReversal > 100 ? 50 : strikeReversal;
    }

    public double getGrappleReversal() {
        return grappleReversal;
    }

    private void setGrappleReversal(double grappleReversal) {
        this.grappleReversal = grappleReversal < 0 || grappleReversal > 100 ? 50 : grappleReversal;
    }

    public double getAerialReversal() {
        return aerialReversal;
    }

    private void setAerialReversal(double aerialReversal) {
        this.aerialReversal = aerialReversal < 0 || aerialReversal > 100 ? 50 : aerialReversal;
    }

    public double getSubmissionDefense() {
        return submissionDefense;
    }

    private void setSubmissionDefense(double submissionDefense) {
        this.submissionDefense = submissionDefense < 0 || submissionDefense > 100 ? 50 : submissionDefense;
    }

    @Override
    public double getOverall() {
        return (this.getStrikeReversal() +
                this.getGrappleReversal() +
                this.getAerialReversal() +
                this.getSubmissionDefense()) / this.size();
    }

    @Override
    public int size() {
        return 4;
    }
}
