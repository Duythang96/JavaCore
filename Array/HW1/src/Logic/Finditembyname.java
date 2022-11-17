package Logic;

import Main.MainRun;

import java.util.Scanner;

public class Finditembyname {
    public static void findItemByName() {
        System.out.println("Ban muon tim san pham nao: ");
        String itemFind = new Scanner(System.in).nextLine();
        boolean check= false;
        for (int i = 0; i < MainRun.listItems.size(); i++) {
            if (MainRun.listItems.get(i)!=null && MainRun.listItems.get(i).getIteamName().equals(itemFind)){
                System.out.println(MainRun.listItems.get(i));
                check = true;
                break;
            }
        }
        if (check==false){
            System.out.println("Khong co san pham nay!");
        }
    }
}
