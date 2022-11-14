package Main;

import Entity.Item;
import Entity.Salestaff;
import Entity.Salestaffmanagerment;
import Logichandle.*;

import java.util.Scanner;

public class Mainrun {
    public static Item[] items = new Item[100];
    public static Salestaff[] salestaffs = new Salestaff[100];
    public static Salestaffmanagerment[] saleDetailManagerments = new Salestaffmanagerment[100];
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            FunctionChoiceLogic.showNemu();
            int functionChoice = FunctionChoiceLogic.functionChoice();
            switch (functionChoice) {
                case 1:
                    ItemLogic.addNewItem();
                    break;
                case 2:
                    ItemLogic.showItem();
                    break;
                case 3:
                    SalestaffLogic.addNewStaff();
                    break;
                case 4:
                    SalestaffLogic.showNewStaff();
                    break;
                case 5:
                    SalestaffManagermentLogic.saleStaffManagerment();
                    break;
                case 6:
                    SalestaffManagermentLogic.showSalestaffDetailManagerment();
                    break;
                case 7:
                    showSortMenu();
                    break;
                case 8:
                    break;
                case 9:
                    return;
            }
        }
    }

    private static void showSortMenu() {
        System.out.println("Chon tieu chí sắp xếp: ");
        System.out.println("1. Theo họ tên nhân viên");
        System.out.println("2. Theo nhóm mặt hàng");
        System.out.println("3. Thoát ra ngoài menu chính");
        System.out.print("Chọn tieu chí: ");
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice>0 && choice<=3){
                break;
            }
            System.out.println("Moi nhap lai tiêu chí!");
        }while (true);
        switch (choice){
            case 1:
                staffManagermentLogic.sortByWriterName();
                break;
            case 2:

                break;
            case 3:
                return;
        }
    }


}


