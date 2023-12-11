package edu.uoc.pac4.brand;

import edu.uoc.pac4.Superstar;
import edu.uoc.pac4.referee.Referee;
import edu.uoc.pac4.wrestler.Wrestler;

import java.util.*;
import java.util.stream.Stream;

/**
 * Represents a brand in the wrestling entertainment system.
 *
 * @author Marc Servat
 * @version 1.0
 * @since 2023-12-11
 */
public class Brand {
    private String name;
    private String tvChannel;
    private Day day;
    private final Set<Superstar> roster = new HashSet<>();

    /**
     * Creates a new Brand instance with the specified name, day, and TV channel.
     *
     * @param name      The name of the brand.
     * @param day       The day of the week the brand airs.
     * @param tvChannel The TV channel on which the brand is broadcasted.
     */
    public Brand(String name, Day day, String tvChannel) {
        this.setName(name);
        this.setDay(day);
        this.setTvChannel(tvChannel);
    }

    /**
     * Gets the name of the brand.
     *
     * @return The name of the brand.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the brand.
     *
     * @param name The name of the brand.
     */
    public void setName(String name) {
        this.name = Objects.requireNonNullElse(name, this.name);
    }

    /**
     * Gets the day of the week the brand airs.
     *
     * @return The day of the week the brand airs.
     */
    public Day getDay() {
        return this.day;
    }

    /**
     * Sets the day of the week the brand airs.
     *
     * @param day The day of the week the brand airs.
     */
    public void setDay(Day day) {
        this.day = Objects.requireNonNullElse(day, this.day);
    }

    /**
     * Gets the TV channel on which the brand is broadcasted.
     *
     * @return The TV channel on which the brand is broadcasted.
     */
    public String getTvChannel() {
        return this.tvChannel;
    }

    /**
     * Sets the TV channel on which the brand is broadcasted.
     *
     * @param tvChannel The TV channel on which the brand is broadcasted.
     */
    public void setTvChannel(String tvChannel) {
        this.tvChannel = Objects.requireNonNullElse(tvChannel, this.tvChannel);
    }

    /**
     * Gets a list of superstars in the brand's roster.
     *
     * @return A list of superstars in the brand's roster.
     */
    public List<Superstar> getRoster() {
        return new ArrayList<>(this.roster);
    }

    /**
     * Adds a superstar to the brand's roster.
     *
     * @param superstar The superstar to be added.
     * @return {@code true} if the superstar is successfully added, {@code false} otherwise.
     */
    public boolean addSuperstar(Superstar superstar) {
        if (superstar == null) {
            return false;
        }
        return this.roster.add(superstar);
    }

    /**
     * Removes a superstar from the brand's roster.
     *
     * @param superstar The superstar to be removed.
     * @return {@code true} if the superstar is successfully removed, {@code false} otherwise.
     */
    public boolean removeSuperstar(Superstar superstar) {
        return this.roster.remove(superstar);
    }

    /**
     * Checks if a superstar is part of the brand's roster.
     *
     * @param superstar The superstar to check.
     * @return {@code true} if the superstar is part of the roster, {@code false} otherwise.
     */
    public boolean isSuperstar(Superstar superstar) {
        return this.roster.contains(superstar);
    }

    /**
     * Checks if the brand's roster is empty.
     *
     * @return {@code true} if the roster is empty, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return this.roster.isEmpty();
    }

    /**
     * Gets the number of referees in the brand's roster.
     *
     * @return The number of referees in the brand's roster.
     */
    public int getNumReferees() {
        return (int) this.roster.stream().filter(superstar -> superstar instanceof Referee).count();
    }

    /**
     * Gets the average weight of the superstars in the brand's roster.
     *
     * @return The average weight of the superstars.
     */
    public double getWeightAverage() {
        return this.roster.stream().mapToDouble(Superstar::getWeight).average().orElse(0.0);
    }

    /**
     * Sets the signature and finisher of all wrestlers in the brand's roster to null.
     */
    public void setDefaultMoves() {
        this.roster.stream().filter(superstar -> superstar instanceof Wrestler)
                .forEach(wrestler -> {
                    ((Wrestler) wrestler).setSignature(null);
                    ((Wrestler) wrestler).setFinisher(null);
                });
    }

    /**
     * Gets a stream of the top wrestlers in the brand's roster based on overall rating.
     *
     * @param num The number of top wrestlers to retrieve.
     * @return A stream of the top wrestlers.
     */
    public Stream<Superstar> getTopWrestlers(int num) {
        return this.roster.stream().filter(superstar -> superstar instanceof Wrestler)
                .sorted(Comparator.comparing(wrestler -> ((Wrestler) wrestler).getOverall()).reversed()).limit(num);
    }

    /**
     * Returns a string representation of the brand.
     *
     * @return A string representation of the brand.
     */
    @Override
    public String toString() {
        return this.getName() + " every "
                + this.getDay().toString().charAt(0)
                + this.getDay().toString().substring(1).toLowerCase()
                + " on "
                + this.getTvChannel();
    }
}
