package Logic;

import Entity.ListItem;
import Main.MainRun;

import java.util.Scanner;

public class Addandshowitem {
    public static void showItem() {
        for (int i = 0; i < MainRun.listItems.size() ; i++) {
            System.out.println(MainRun.listItems.get(i));
        }
    }

    public static void addItem() {
        System.out.println("Ban muon nhap bao nhieu san pham: ");
        int item = new Scanner(System.in).nextInt();
        for (int i = 0; i < item; i++) {
            ListItem listItem = new ListItem();
            listItem.inputInfor(i);
            MainRun.listItems.add(listItem);
        }
    }
}
