package Logichandle;

import Entity.Item;
import Main.Mainrun;

import java.util.Scanner;

public class ItemLogic {
    public static Item findItemID(int itemID){
        Item items  = null;
        for (int k = 0; k < Mainrun.items.length; k++) {
            if (Mainrun.items[k]!=null && Mainrun.items[k].getItemID()==itemID){
                items = Mainrun.items[k];
                break;
            }
        }
        return items;
    }
    public static void showItem() {
        for (int i = 0; i < Mainrun.items.length ; i++) {
            if (Mainrun.items[i]!=null){
                System.out.println(Mainrun.items[i]);
            }
        }
    }

    public static void addNewItem() {
        System.out.println("Ban muon them bao nhieu mat hang: ");
        int itemNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < itemNum; i++) {
            Item item = new Item();
            item.inputInfor();
            saveItem(item);

        }

    }

    public static void saveItem(Item item) {
        if (item == null){
            return;
        }
        for (int i = 0; i < Mainrun.items.length ; i++) {
            if (Mainrun.items[i]==null){
                Mainrun.items[i]=item;
                return;
            }
        }
    }
}
