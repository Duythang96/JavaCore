package entity;

public class Follower {
    private static int autoID = 1;
    private String name;
    private int id;
    private String email;
    private int numberOfLike;

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

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }

    public Follower(String name, String email, int numberOfLike) {
        this.name = name;
        this.id = autoID;
        autoID++;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }
}
