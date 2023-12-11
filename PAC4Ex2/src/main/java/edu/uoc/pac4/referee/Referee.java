package edu.uoc.pac4.referee;

import edu.uoc.pac4.Gender;
import edu.uoc.pac4.Superstar;
import edu.uoc.pac4.SuperstarException;
import edu.uoc.pac4.wrestler.Wrestler;

import java.time.LocalDate;

/**
 * Represents a referee in the wrestling world, responsible for making decisions during matches.
 */
public class Referee extends Superstar {

    /**
     * Default constructor for a referee. Throws an exception due to the absence of required parameters.
     *
     * @throws SuperstarException if the required parameters are missing.
     */
    public Referee() throws SuperstarException {
    }

    /**
     * Constructor to create a referee with specified attributes.
     *
     * @param birthName  The birth name of the referee.
     * @param birthDate  The birth date of the referee.
     * @param birthplace The birthplace of the referee.
     * @param gender     The gender of the referee.
     * @param height     The height of the referee.
     * @param weight     The weight of the referee.
     * @param ringName   The ring name of the referee.
     * @throws SuperstarException if there are issues with the provided attributes.
     */
    public Referee(String birthName, LocalDate birthDate, String birthplace, Gender gender, double height,
                   double weight, String ringName) throws SuperstarException {
        super(birthName, birthDate, birthplace, gender, height, weight, ringName);
    }

    /**
     * Makes a decision during a wrestling match based on the performance of two wrestlers.
     * The decision is based on counting pinfall or deciding a knockout.
     *
     * @param wrestler1 The first wrestler in the match.
     * @param wrestler2 The second wrestler in the match.
     * @return true if the match is decided, false otherwise.
     */
    public boolean decide(Wrestler wrestler1, Wrestler wrestler2) {
        return this.countPinfall(wrestler1, wrestler2) || this.decideKnockout(wrestler2);
    }

    /**
     * Determines if pinfall should be counted based on the energy difference and weight class comparison.
     *
     * @param wrestler1 The first wrestler in the match.
     * @param wrestler2 The second wrestler in the match.
     * @return true if pinfall should be counted, false otherwise.
     */
    private boolean countPinfall(Wrestler wrestler1, Wrestler wrestler2) {
        double difference20 = wrestler1.getEnergy() - (wrestler2.getEnergy() * 1.2);
        double difference50 = wrestler1.getEnergy() - (wrestler2.getEnergy() * 1.5);

        return difference20 > 0 && wrestler1.getWeightClass().isHeavier(wrestler2.getWeightClass()) || difference50 > 0;
    }

    /**
     * Determines if a knockout should be declared based on the energy level of a wrestler.
     *
     * @param wrestler The wrestler in the match.
     * @return true if a knockout should be declared, false otherwise.
     */
    private boolean decideKnockout(Wrestler wrestler) {
        return wrestler.getEnergy() < 5;
    }
}
