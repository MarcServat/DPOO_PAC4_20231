package edu.uoc.pac4.manager;

import edu.uoc.pac4.Gender;
import edu.uoc.pac4.Superstar;
import edu.uoc.pac4.SuperstarException;

import java.time.LocalDate;

public class Manager extends Superstar {
    public Manager() throws SuperstarException {
        super();
    }

    public Manager(String birthName, LocalDate birthDate, String birthplace, Gender gender, double height,
                   double weight, String ringName) throws SuperstarException {
        super(birthName, birthDate, birthplace, gender, height, weight, ringName);
    }

    public void speak() {
        System.out.print("I'm a manager!!");
    }
}
