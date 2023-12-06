package edu.uoc.pac4.referee;

import edu.uoc.pac4.Gender;
import edu.uoc.pac4.Superstar;
import edu.uoc.pac4.SuperstarException;
import edu.uoc.pac4.wrestler.Wrestler;

import java.time.LocalDate;

public class Referee extends Superstar {
    public Referee() throws SuperstarException {
    }

    public Referee(String birthName, LocalDate birthDate, String birthplace, Gender gender, double height,
                   double weight, String ringName) throws SuperstarException {
        super(birthName, birthDate, birthplace, gender, height, weight, ringName);
    }

    public boolean decide(Wrestler wrestler1, Wrestler wrestler2) {
        return this.countPinfall(wrestler1, wrestler2) || this.decideKnockout(wrestler2);
    }

    private boolean countPinfall(Wrestler wrestler1, Wrestler wrestler2) {
        double difference20 = wrestler1.getEnergy() - (wrestler2.getEnergy() * 1.2);
        double difference50 = wrestler1.getEnergy() - (wrestler2.getEnergy() * 1.5);

        return difference20 > 0 && wrestler1.getWeightClass().isHeavier(wrestler2.getWeightClass()) || difference50 > 0;
    }

    private boolean decideKnockout(Wrestler wrestler) {
        return wrestler.getEnergy() < 5;
    }

}