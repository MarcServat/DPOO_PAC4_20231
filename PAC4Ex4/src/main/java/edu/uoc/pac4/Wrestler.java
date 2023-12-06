package edu.uoc.pac4;

public class Wrestler {
    String birthName;
    String ringName;

    Birthplace birthplace;

    WrestlerProperties properties;

    public Wrestler(String birthName, String ringName, String city, String country,
                    double strength, double agility, double stamina, double technique, double defense) {
        setBirthName(birthName);
        setRingName(ringName);
        birthplace = new Birthplace(city, country);
        properties = new WrestlerProperties(strength, agility, stamina, technique, defense);
    }

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    public String getRingName() {
        return ringName;
    }

    public void setRingName(String ringName) {
        this.ringName = ringName;
    }

    public Birthplace getBirthplace() {
        return birthplace;
    }

    public WrestlerProperties getProperties() {
        return properties;
    }

    public Wrestler clone() throws CloneNotSupportedException {
        return new Wrestler(
                this.getBirthName(),
                this.getRingName(),
                birthplace.getCity(),
                birthplace.getCountry(),
                properties.getStrength(),
                properties.getAgility(),
                properties.getStamina(),
                properties.getTechnique(),
                properties.getDefense());
    }
}
