package edu.uoc.pac4;

/**
 * The {@code Speakable} interface defines a contract for objects that can speak, indicating that they have a method
 * to produce speech or vocalization.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public interface Speakable {

    /**
     * Method signature for producing speech or vocalization.
     * Implementing classes or interfaces should provide a concrete implementation to define how the object speaks.
     */
    void speak();
}
