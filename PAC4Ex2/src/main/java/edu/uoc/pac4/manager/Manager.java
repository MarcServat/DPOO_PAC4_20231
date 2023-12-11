package edu.uoc.pac4.manager;

import edu.uoc.pac4.Gender;
import edu.uoc.pac4.Superstar;
import edu.uoc.pac4.SuperstarException;

import java.time.LocalDate;

/**
 * Represents a manager in the wrestling world, responsible for managing and speaking on behalf of a superstar.
 */
public class Manager extends Superstar {

    /**
     * Default constructor for a manager. Throws an exception due to the absence of required parameters.
     *
     * @throws SuperstarException if the required parameters are missing.
     */
    public Manager() throws SuperstarException {
        super();
    }

    /**
     * Constructor to create a manager with specified attributes.
     *
     * @param birthName  The birth name of the manager.
     * @param birthDate  The birth date of the manager.
     * @param birthplace The birthplace of the manager.
     * @param gender     The gender of the manager.
     * @param height     The height of the manager.
     * @param weight     The weight of the manager.
     * @param ringName   The ring name of the manager.
     * @throws SuperstarException if there are issues with the provided attributes.
     */
    public Manager(String birthName, LocalDate birthDate, String birthplace, Gender gender, double height,
                   double weight, String ringName) throws SuperstarException {
        super(birthName, birthDate, birthplace, gender, height, weight, ringName);
    }

    /**
     * Speaks on behalf of the manager, providing a message indicating their role.
     */
    public void speak() {
        System.out.print("I'm a manager!!");
    }
}
