package edu.uoc.pac4.wrestler.styles;

import edu.uoc.pac4.Gender;
import edu.uoc.pac4.SuperstarException;
import edu.uoc.pac4.wrestler.Wrestler;
import edu.uoc.pac4.wrestler.WrestlerException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Powerhouse extends Wrestler {
    public Powerhouse(String birthName, LocalDate birthDate, String birthplace, Gender gender,
                      double height, double weight, String ringName) throws SuperstarException, WrestlerException {
        super(birthName, birthDate, birthplace, gender, height, weight, ringName, 30, 10, 25, 15,
                20);
    }

    @Override
    public String toString() {
        return this.getRingName().toUpperCase() + System.lineSeparator()
                + "\t" + "Birth name: " + this.getBirthName() + System.lineSeparator()
                + "\t" + "Born: " + this.getBirthDate()
                .format(DateTimeFormatter.ofPattern("dd-MM-uuuu")) + System.lineSeparator()
                + "\t      " + this.getBirthplace() + System.lineSeparator()
                + "\t" + "Signature: " + this.getSignature() + System.lineSeparator()
                + "\t" + "Finisher: " + this.getFinisher() + System.lineSeparator()
                + "\t" + "Style: " + "Powerhouse" + System.lineSeparator()
                + "\t" + "Overall: " + this.getOverall();
    }
}