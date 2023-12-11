package edu.uoc.pac4;

/**
 * A custom exception class that is thrown when there is an error in {@link Superstar}.
 *
 * @author Marc Servat
 * @version 1.0
 */
public class SuperstarException extends Exception {

    /**
     * Error message for a null birth name.
     */
    public static final String MSG_ERR_BIRTH_NAME_NULL = "Superstar's birth name mustn't be null";

    /**
     * Error message for a birth name that is not the correct length.
     */
    public static final String MSG_ERR_BIRTH_NAME_LENGTH = "Superstar's birth name must have between 1 and 60 characters";

    /**
     * Error message for a birth name that contains numbers.
     */
    public static final String MSG_ERR_BIRTH_NAME_NUMBERS = "Superstar's birth name mustn't have any numbers";

    /**
     * Error message for a null birth date.
     */
    public static final String MSG_ERR_BIRTH_DATE = "Superstar's birth date mustn't be null";

    /**
     * Error message for a null birthplace.
     */
    public static final String MSG_ERR_BIRTHPLACE_NULL = "Superstar's birthplace mustn't be null";

    /**
     * Error message for a birthplace that is not the correct length.
     */
    public static final String MSG_ERR_BIRTHPLACE_LENGTH = "Superstar's birthplace must have between 1 and 80 characters";

    /**
     * Error message for a height that is too short.
     */
    public static final String MSG_ERR_HEIGHT = "Superstar's height must be greater than 100 cm";

    /**
     * Error message for a weight that is too light.
     */
    public static final String MSG_ERR_WEIGHT = "Superstar's weight must be greater than 30 kg";

    /**
     * Error message for a null ring name.
     */
    public static final String MSG_ERR_RING_NAME_NULL = "Superstar's ring name mustn't be null";

    /**
     * Error message for a ring name that is not the correct length.
     */
    public static final String MSG_ERR_RING_NAME_LENGTH = "Superstar's ring name must have between 1 and 60";

    /**
     * Constructs a new SuperstarException with the specified message.
     *
     * @param msg The exception message.
     */
    public SuperstarException(String msg) {
        super(msg);
    }
}
