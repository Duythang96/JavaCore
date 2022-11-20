package entity;

import java.util.ArrayList;

public class Idol {
    private static int autoID =100;
    private String name;
    private int id;
    private String email;
    private ArrayList<Follower> followers;

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Idol.autoID = autoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                '}';
    }

    public Idol(String name, String email, ArrayList<Follower> followers) {
        this.name = name;
        this.id = autoID;
        autoID++;
        this.email = email;
        this.followers = followers;
    }
}
