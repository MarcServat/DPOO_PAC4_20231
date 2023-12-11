package edu.uoc.pac4;

/**
 * The {@code SuperstarException} class is a custom exception that can be thrown in response to various validation errors
 * related to the {@link Superstar} class. It provides specific error messages for different validation scenarios,
 * helping to identify the cause of the exception.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public class SuperstarException extends Exception {

    /**
     * Error message for a null birth name.
     */
    public static final String MSG_ERR_BIRTH_NAME_NULL = "Superstar's birth name mustn't be null";

    /**
     * Error message for an invalid birth name length.
     */
    public static final String MSG_ERR_BIRTH_NAME_LENGTH = "Superstar's birth name must have between 1 and 60 characters";

    /**
     * Error message for a birth name containing numbers.
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
     * Error message for an invalid birthplace length.
     */
    public static final String MSG_ERR_BIRTHPLACE_LENGTH = "Superstar's birthplace must have between 1 and 80 characters";

    /**
     * Error message for an invalid height.
     */
    public static final String MSG_ERR_HEIGHT = "Superstar's height must be greater than 100 cm";

    /**
     * Error message for an invalid weight.
     */
    public static final String MSG_ERR_WEIGHT = "Superstar's weight must be greater than 30 kg";

    /**
     * Error message for a null ring name.
     */
    public static final String MSG_ERR_RING_NAME_NULL = "Superstar's ring name mustn't be null";

    /**
     * Error message for an invalid ring name length.
     */
    public static final String MSG_ERR_RING_NAME_LENGTH = "Superstar's ring name must have between 1 and 60";

    /**
     * Creates a new instance of {@code SuperstarException} with the specified error message.
     *
     * @param msg The error message.
     */
    public SuperstarException(String msg) {
        super(msg);
    }
}
