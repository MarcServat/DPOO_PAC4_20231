package edu.uoc.pac4.wrestler;

public class WrestlerException extends Exception {
    public static final String MSG_ERR_ATTRIBUTES_VALUES = "Wrestler's attributes must be in range [1, 96]. Error in ";
    public static final String MSG_ERR_ATTRIBUTES_MAX_VALUE = "The sum of the wrestler's attributes mustn't greater than 100";
    public static final String MSG_ERR_PROPERTIES_NULL = "Wrestler's properties mustn't null";

    public WrestlerException(String msg) {
        super(msg);
    }
}
