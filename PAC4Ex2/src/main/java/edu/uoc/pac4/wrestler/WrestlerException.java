package edu.uoc.pac4.wrestler;

/**
 * The {@code WrestlerException} class is a custom exception that can be thrown in response to various validation errors
 * related to the {@link Wrestler} class. It provides specific error messages for different scenarios, helping to
 * identify the cause of the exception.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public class WrestlerException extends Exception {

    /**
     * Error message for invalid attribute values in a wrestler.
     */
    public static final String MSG_ERR_ATTRIBUTES_VALUES = "Wrestler's attributes must be in range [1, 96]. Error in ";

    /**
     * Error message for the sum of attributes exceeding the maximum value.
     */
    public static final String MSG_ERR_ATTRIBUTES_MAX_VALUE = "The sum of the wrestler's attributes mustn't be greater than 100";

    /**
     * Error message for null wrestler properties.
     */
    public static final String MSG_ERR_PROPERTIES_NULL = "Wrestler's properties mustn't be null";

    /**
     * Creates a new instance of {@code WrestlerException} with the specified error message.
     *
     * @param msg The error message.
     */
    public WrestlerException(String msg) {
        super(msg);
    }
}
