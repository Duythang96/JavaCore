package Main;

import Entity.ListItem;
import Logic.*;

import java.util.ArrayList;

public class MainRun {
    public static ArrayList<ListItem> listItems = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true){
            Menu.showMenu();
            int functionchoice = Menu.functionChoice();
            switch (functionchoice){
                case 1:
                    Addandshowitem.addItem();
                    break;
                case 2:
                    Addandshowitem.showItem();
                    break;
                case 3:
                    Finditembyname.findItemByName();
                    break;
                case 4:
                    FinditembyID.findItemByID();
                    break;
                case 5:
                    Findquantitysmallthan5.findQuantitySmallThan5();
                    break;
                case 6:
                    Finditembyprice.findItemByPrice();
                    break;
                case 7:
                    return;
            }
        }
    }

}
