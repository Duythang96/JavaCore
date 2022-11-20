package entity;

import java.util.Scanner;

public class FollowerAction {
    public Follower inputFollower(Scanner scanner){
        System.out.println("Moi nhap ten follower: ");
        String name = scanner.nextLine();
        System.out.println("Moi nhap email follower: ");
        String mail = scanner.nextLine();
        System.out.println("Moi nhap so luong like: ");
        int likeNum = Integer.parseInt(scanner.nextLine());
        Follower follower = new Follower(name,mail,likeNum);
        return follower;
    }
}
