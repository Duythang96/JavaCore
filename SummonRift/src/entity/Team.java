package entity;

import java.util.ArrayList;

public class Team {
    private static int autoID=1;
    private int teamId;
    private ArrayList<Fingure> fingures;

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Team.autoID = autoID;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public ArrayList<Fingure> getFigures() {
        return fingures;
    }

    public void setFigures(ArrayList<Fingure> fingures) {
        this.fingures = fingures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", figures=" + fingures +
                '}';
    }

    public Team(ArrayList<Fingure> fingures) {
        this.teamId = autoID;
        autoID++;
        this.fingures = fingures;
    }
}
