package edu.uoc.pac4.wrestler.styles;

import edu.uoc.pac4.Gender;
import edu.uoc.pac4.SuperstarException;
import edu.uoc.pac4.wrestler.Wrestler;
import edu.uoc.pac4.wrestler.WrestlerException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a wrestler with a Technician style.
 */
public class Technician extends Wrestler {

    /**
     * Constructs a Technician wrestler with the specified attributes.
     *
     * @param birthName  The birth name of the wrestler.
     * @param birthDate  The birth date of the wrestler.
     * @param birthplace The birthplace of the wrestler.
     * @param gender     The gender of the wrestler.
     * @param height     The height of the wrestler.
     * @param weight     The weight of the wrestler.
     * @param ringName   The ring name of the wrestler.
     * @throws SuperstarException If there is an issue with the Superstar attributes.
     * @throws WrestlerException  If there is an issue with the Wrestler attributes.
     */
    public Technician(String birthName, LocalDate birthDate, String birthplace, Gender gender, double height,
                      double weight, String ringName) throws SuperstarException, WrestlerException {
        super(birthName, birthDate, birthplace, gender, height, weight, ringName, 10, 20, 20, 30, 20);
    }

    /**
     * Generates a string representation of the Technician wrestler.
     *
     * @return A formatted string containing the wrestler's information.
     */
    @Override
    public String toString() {
        return this.getRingName().toUpperCase() + System.lineSeparator()
                + "\t" + "Birth name: " + this.getBirthName() + System.lineSeparator()
                + "\t" + "Born: " + this.getBirthDate()
                .format(DateTimeFormatter.ofPattern("dd-MM-uuuu")) + System.lineSeparator()
                + "\t      " + this.getBirthplace() + System.lineSeparator()
                + "\t" + "Signature: " + this.getSignature() + System.lineSeparator()
                + "\t" + "Finisher: " + this.getFinisher() + System.lineSeparator()
                + "\t" + "Style: " + "Technician" + System.lineSeparator()
                + "\t" + "Overall: " + this.getOverall();
    }
}
