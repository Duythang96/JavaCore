package entity;

import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Team> teams;
    private java.time.LocalTime times = java.time.LocalTime.now();

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public LocalTime getTimes() {
        return times;
    }

    public void setTimes(LocalTime times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "teams=" + teams +
                ", times=" + times +
                '}';
    }

    public SummonRift(ArrayList<Team> teams) {
        this.teams = teams;
    }
}
