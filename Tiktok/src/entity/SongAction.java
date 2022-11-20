package entity;

import java.util.Scanner;

public class SongAction {
    public Songs inputSong(Scanner scanner){
        System.out.println("Moi nhap ten bai hat:");
        String songName = scanner.nextLine();
        System.out.println("Moi nhap ten ca si:");
        String songCs = scanner.nextLine();
        Songs songs = new Songs(songName,songCs);
        return songs;
    }
}
