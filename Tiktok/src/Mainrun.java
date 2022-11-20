import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainrun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhap thong tin idol
        IdolAction idolAction =new IdolAction();
        FollowerAction followerAction = new FollowerAction();
        ArrayList<Follower> followers = new ArrayList<>();
        ArrayList<Idol> idols = new ArrayList<>();
        System.out.println("Ban muon them bao nhieu idol?");
        int idolnum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < idolnum; i++) {
            Idol idol = idolAction.inputIdol(scanner);
            idols.add(idol);
        }

        // nhap thong tin bai hat
        ArrayList<Songs> songs = new ArrayList<>();
        SongAction songAction = new SongAction();
        System.out.println("Ban muon nhap bao nhieu bai hat?");
        int songNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < songNum; i++) {
            Songs newsong = songAction.inputSong(scanner);
            songs.add(newsong);
        }
        // in thong tin tiktok
        Tiktok tiktok = new Tiktok(idols,songs);
        for (int i = 0; i < idols.size(); i++) {
            System.out.println(tiktok.getIdols().get(i));
        }
        System.out.println(tiktok.getSongs());
    }
}
