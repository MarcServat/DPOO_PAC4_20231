package edu.uoc.pac4.brand;

import edu.uoc.pac4.Superstar;
import edu.uoc.pac4.referee.Referee;
import edu.uoc.pac4.wrestler.Wrestler;

import java.util.*;
import java.util.stream.Stream;

public class Brand {
    private String name;
    private String tvChannel;
    private Day day;
    private final Set<Superstar> roster = new HashSet<>();


    public Brand(String name, Day day, String tvChannel) {
        this.setName(name);
        this.setDay(day);
        this.setTvChannel(tvChannel);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNullElse(name, this.name);
    }

    public Day getDay() {
        return this.day;
    }

    public void setDay(Day day) {
        this.day = Objects.requireNonNullElse(day, this.day);
    }

    public String getTvChannel() {
        return this.tvChannel;
    }

    public void setTvChannel(String tvChannel) {
        this.tvChannel = Objects.requireNonNullElse(tvChannel, this.tvChannel);
    }

    public List<Superstar> getRoster() {
        return new ArrayList<Superstar>(this.roster);
    }

    public boolean addSuperstar(Superstar superstar) {
        if (superstar == null) {
            return false;
        }

        return this.roster.add(superstar);
    }

    public boolean removeSuperstar(Superstar superstar) {
        return this.roster.remove(superstar);
    }

    public boolean isSuperstar(Superstar superstar) {
        return this.roster.contains(superstar);
    }

    public boolean isEmpty() {
        return this.roster.isEmpty();
    }

    public int getNumReferees() {
        return (int) this.roster.stream().filter(superstar -> superstar instanceof Referee).count();
    }

    public double getWeightAverage() {
        return this.roster.stream().mapToDouble(Superstar::getWeight).average().orElse(0.0);
    }

    public void setDefaultMoves() {
        this.roster.stream().filter(superstar -> superstar instanceof Wrestler)
                .forEach(wrestler -> {
                    ((Wrestler) wrestler).setSignature(null);
                    ((Wrestler) wrestler).setFinisher(null);
                });
    }

    public Stream<Superstar> getTopWrestlers(int num) {
        return this.roster.stream().filter(superstar -> superstar instanceof Wrestler)
                .sorted(Comparator.comparing(wrestler -> ((Wrestler) wrestler).getOverall()).reversed()).limit(num);

    }

    @Override
    public String toString() {
        return this.getName() + " every "
                + this.getDay().toString().charAt(0)
                + this.getDay().toString().substring(1).toLowerCase()
                + " on "
                + this.getTvChannel();
    }

}
