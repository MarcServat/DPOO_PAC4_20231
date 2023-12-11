package edu.uoc.pac4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * The {@code Superstar} class represents a celebrity in the entertainment industry.
 * It includes information such as birth name, birth date, birthplace, gender, height,
 * weight, and ring name.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public class Superstar {

    /**
     * Default birth name for a superstar if not provided.
     */
    private String birthName = "Anonymous";

    /**
     * Default birth date for a superstar if not provided.
     */
    private LocalDate birthDate = LocalDate.now().minusDays(1);

    /**
     * Default birthplace for a superstar if not provided.
     */
    private String birthplace = "New York";

    /**
     * Default height for a superstar if not provided.
     */
    private double height = 168;

    /**
     * Default weight for a superstar if not provided.
     */
    private double weight = 54;

    /**
     * Default ring name for a superstar if not provided.
     */
    private String ringName = "Superstar";

    /**
     * Default gender for a superstar if not provided.
     */
    private Gender gender;

    /**
     * Minimum length for the birth name.
     */
    public static final int BIRTH_NAME_MIN_LENGTH = 1;

    /**
     * Maximum length for the birth name.
     */
    public static final int BIRTH_NAME_MAX_LENGTH = 60;

    /**
     * Minimum length for the birthplace.
     */
    public static final int BIRTHPLACE_MIN_LENGTH = 1;

    /**
     * Maximum length for the birthplace.
     */
    public static final int BIRTHPLACE_MAX_LENGTH = 80;

    /**
     * Minimum length for the ring name.
     */
    public static final int RING_NAME_MIN_LENGTH = 1;

    /**
     * Maximum length for the ring name.
     */
    public static final int RING_NAME_MAX_LENGTH = 60;

    /**
     * Minimum allowed height for a superstar.
     */
    public static final int HEIGHT_MIN_VALUE = 100;

    /**
     * Minimum allowed weight for a superstar.
     */
    public static final int WEIGHT_MIN_VALUE = 30;

    /**
     * Creates a default superstar with predefined values.
     *
     * @throws SuperstarException if there is an issue with the default values.
     */
    public Superstar() throws SuperstarException {
        this.setBirthName(this.birthName);
        this.setBirthDate(this.birthDate);
        this.setBirthplace(this.birthplace);
        this.setGender(Gender.FEMALE);
        this.setHeight(this.height);
        this.setWeight(this.weight);
        this.setRingName(this.ringName);
    }

    /**
     * Creates a superstar with specified attributes.
     *
     * @param birthName  The birth name of the superstar.
     * @param birthDate  The birthdate of the superstar.
     * @param birthplace The birthplace of the superstar.
     * @param gender     The gender of the superstar.
     * @param height     The height of the superstar.
     * @param weight     The weight of the superstar.
     * @param ringName   The ring name of the superstar.
     * @throws SuperstarException if there is an issue with the provided values.
     */
    public Superstar(String birthName, LocalDate birthDate, String birthplace, Gender gender, double height,
                     double weight,
                     String ringName) throws SuperstarException {
        this.setBirthName(birthName);
        this.setBirthDate(birthDate);
        this.setBirthplace(birthplace);
        this.setGender(gender);
        this.setHeight(height);
        this.setWeight(weight);
        this.setRingName(ringName);
    }

    /**
     * Gets the birth name of the superstar.
     *
     * @return The birth name of the superstar.
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * Sets the birth name of the superstar with validation.
     *
     * @param birthName The birth name to set.
     * @throws SuperstarException if the provided birth name is invalid.
     */
    public void setBirthName(String birthName) throws SuperstarException {
        if (birthName == null) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_NULL);
        } else if (birthName.trim().length() < BIRTH_NAME_MIN_LENGTH || birthName.trim()
                .length() > BIRTH_NAME_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_LENGTH);
        } else if (birthName.matches(".*[0-9].*")) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_NUMBERS);
        } else {
            this.birthName = birthName.trim();
        }
    }


    /**
     * Gets the birthdate of the superstar.
     *
     * @return The birthdate of the superstar.
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the birthdate of the superstar with validation.
     *
     * @param birthDate The birthdate to set.
     * @throws SuperstarException if the provided birth date is invalid.
     */
    public void setBirthDate(LocalDate birthDate) throws SuperstarException {
        if (birthDate == null || !birthDate.isBefore(LocalDate.now())) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_DATE);
        } else {
            this.birthDate = birthDate;
        }
    }

    /**
     * Gets the birthplace of the superstar.
     *
     * @return The birthplace of the superstar.
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * Sets the birthplace of the superstar with validation.
     *
     * @param birthplace The birthplace to set.
     * @throws SuperstarException if the provided birthplace is invalid.
     */
    public void setBirthplace(String birthplace) throws SuperstarException {
        if (birthplace == null) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTHPLACE_NULL);
        } else if (birthplace.trim().length() < BIRTHPLACE_MIN_LENGTH || birthplace.trim()
                .length() > BIRTHPLACE_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTHPLACE_LENGTH);
        } else {
            this.birthplace = birthplace.trim();
        }
    }

    /**
     * Gets the gender of the superstar.
     *
     * @return The gender of the superstar.
     */
    public Gender getGender() {
        return this.gender;
    }


    /**
     * Sets the gender of the superstar.
     *
     * @param gender The gender to set.
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the height of the superstar.
     *
     * @return The height of the superstar.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the superstar with validation.
     *
     * @param height The height to set.
     * @throws SuperstarException if the provided height is invalid.
     */
    public void setHeight(double height) throws SuperstarException {
        if (height <= HEIGHT_MIN_VALUE) {
            throw new SuperstarException(SuperstarException.MSG_ERR_HEIGHT);
        } else {
            this.height = height;
        }
    }

    /**
     * Gets the weight of the superstar.
     *
     * @return The weight of the superstar.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the superstar with validation.
     *
     * @param weight The weight to set.
     * @throws SuperstarException if the provided weight is invalid.
     */
    public void setWeight(double weight) throws SuperstarException {
        if (weight <= WEIGHT_MIN_VALUE) {
            throw new SuperstarException(SuperstarException.MSG_ERR_WEIGHT);
        } else {
            this.weight = weight;
        }
    }

    /**
     * Gets the ring name of the superstar.
     *
     * @return The ring name of the superstar.
     */
    public String getRingName() {
        return ringName;
    }

    /**
     * Sets the ring name of the superstar with validation.
     *
     * @param ringName The ring name to set.
     * @throws SuperstarException if the provided ring name is invalid.
     */
    public void setRingName(String ringName) throws SuperstarException {
        if (ringName == null) {
            throw new SuperstarException(SuperstarException.MSG_ERR_RING_NAME_NULL);
        } else if (ringName.trim().length() < RING_NAME_MIN_LENGTH || ringName.trim().length() > RING_NAME_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_RING_NAME_LENGTH);
        } else {
            this.ringName = ringName.trim();
        }
    }

    /**
     * Checks if two superstars are equal based on certain attributes.
     *
     * @param obj The object to compare with.
     * @return {@code true} if the superstars are equal, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Superstar) {
            return Objects.equals(this.getBirthName(), ((Superstar) obj).getBirthName())
                    && this.getHeight() == ((Superstar) obj).getHeight()
                    && this.getWeight() == ((Superstar) obj).getWeight()
                    && this.getBirthDate().equals(((Superstar) obj).getBirthDate());
        } else {
            return false;
        }
    }

    /**
     * @return A string representation of the superstar.
     */
    @Override
    public String toString() {

        return this.getRingName().toUpperCase() + System.lineSeparator()
                + "\t" + "Birth name: " + this.getBirthName() + System.lineSeparator()
                + "\t" + "Born: " + this.getBirthDate()
                .format(DateTimeFormatter.ofPattern("dd-MM-uuuu")) + System.lineSeparator()
                + "\t      " + this.getBirthplace();
    }
}
