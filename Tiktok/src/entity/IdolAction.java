package entity;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolAction {
    public Idol inputIdol(Scanner scanner){
        FollowerAction followerAction = new FollowerAction();
        System.out.println("Moi nhap ten idol : ");
        String name = scanner.nextLine();
        System.out.println("Moi nhap email idol: ");
        String email = scanner.nextLine();
        System.out.println("Ban muon nhap bao nhieu follower:");
        int follower = Integer.parseInt(scanner.nextLine());
        ArrayList<Follower> followers = new ArrayList<>();
        for (int i = 0; i < follower; i++) {
            Follower follower1 = followerAction.inputFollower(scanner);
            followers.add(follower1);
        }
        Idol idols = new Idol(name,email,followers);
        return idols;
    }

}
