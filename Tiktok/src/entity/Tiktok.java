package entity;

import java.util.ArrayList;

public class Tiktok {
    private ArrayList<Idol> idols;
    private ArrayList<Songs> songs;

    public ArrayList<Idol> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }

    public ArrayList<Songs> getSongs() {
        return songs;
    }



    public void setSongs(ArrayList<Songs> songs) {
        this.songs = songs;
    }
    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }

    public Tiktok(ArrayList<Idol> idols, ArrayList<Songs> songs) {
        this.idols = idols;
        this.songs = songs;
    }
}
