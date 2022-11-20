package entity;

import java.util.ArrayList;

public class Songs {
    private static int autoID = 10;
    private int id;
    private String name;
    private String singer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

    public Songs(String name, String singer) {
        this.id = autoID;
        autoID++;
        this.name = name;
        this.singer = singer;
    }
}
