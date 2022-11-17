package Main;

import Entity.Menber;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainrun {
    public static ArrayList<Menber> menbers = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("How many members do you want to enter? (input more than 3 members)");
        int memberNum = new Scanner(System.in).nextInt();
        if (memberNum>3){
            for (int i = 0; i < memberNum; i++) {
                Menber menber = new Menber();
                menber.inputInfor(i);
                menbers.add(menber);
            }
            System.out.println("Member List:");
            for (int i = 0; i < menbers.size() ; i++) {
                System.out.println(menbers.get(i));
            }
        }
        else {
            System.out.println("Please add more than 3 members!!");
        }
        System.out.println("Member List:");


    }
}
