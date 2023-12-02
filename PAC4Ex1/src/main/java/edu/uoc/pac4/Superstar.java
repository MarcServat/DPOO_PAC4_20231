package edu.uoc.pac4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Superstar {
    private String birthName = "Anonymous";
    private LocalDate birthDate = LocalDate.now().minusDays(1);
    private String birthplace = "New York";
    private double height = 168;
    private double weight = 54;
    private String ringName = "Superstar";
    private Gender gender;

    // Constants
    public static final int BIRTH_NAME_MIN_LENGTH = 1;
    public static final int BIRTH_NAME_MAX_LENGTH = 60;
    public static final int BIRTHPLACE_MIN_LENGTH = 1;
    public static final int BIRTHPLACE_MAX_LENGTH = 80;
    public static final int RING_NAME_MIN_LENGTH = 1;
    public static final int RING_NAME_MAX_LENGTH = 60;
    public static final int HEIGHT_MIN_VALUE = 100;
    public static final int WEIGHT_MIN_VALUE = 30;


    public Superstar() throws SuperstarException {
        this.setBirthName(this.birthName);
        this.setBirthDate(this.birthDate);
        this.setBirthplace(this.birthplace);
        this.setGender(Gender.FEMALE);
        this.setHeight(this.height);
        this.setWeight(this.weight);
        this.setRingName(this.ringName);
    }

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

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) throws SuperstarException {
        if (birthName == null) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_NULL);
        } else if (birthName.trim().length() < BIRTH_NAME_MIN_LENGTH || birthName.trim().length() > BIRTH_NAME_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_LENGTH);
        } else if (birthName.matches(".*[0-9].*")) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_NUMBERS);
        } else {
            this.birthName = birthName.trim();
        }
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) throws SuperstarException {
        if (birthDate == null || !birthDate.isBefore(LocalDate.now())) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_DATE);
        } else {
            this.birthDate = birthDate;
        }
    }

    public String getBirthplace() { return birthplace; }

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

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws SuperstarException {
        if (height <= HEIGHT_MIN_VALUE) {
            throw new SuperstarException(SuperstarException.MSG_ERR_HEIGHT);
        } else {
            this.height = height;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws SuperstarException {
        if (weight <= WEIGHT_MIN_VALUE) {
            throw new SuperstarException(SuperstarException.MSG_ERR_WEIGHT);
        } else {
            this.weight = weight;
        }
    }

    public String getRingName() {
        return ringName;
    }

    public void setRingName(String ringName) throws SuperstarException {
        if (ringName == null) {
            throw new SuperstarException(SuperstarException.MSG_ERR_RING_NAME_NULL);
        } else if (ringName.trim().length() < RING_NAME_MIN_LENGTH || ringName.trim().length() > RING_NAME_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_RING_NAME_LENGTH);
        } else {
            this.ringName = ringName.trim();
        }
    }

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

    @Override
    public String toString() {

        return this.getRingName().toUpperCase() + System.lineSeparator()
                + "\t" + "Birth name: " + this.getBirthName() + System.lineSeparator()
                + "\t" + "Born: " + this.getBirthDate().format(DateTimeFormatter.ofPattern("dd-MM-uuuu")) + System.lineSeparator()
                + "\t      " + this.getBirthplace();
    }
}
