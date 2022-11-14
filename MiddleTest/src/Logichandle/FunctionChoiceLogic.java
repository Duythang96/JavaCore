package Logichandle;

import java.util.Scanner;

public class FunctionChoiceLogic {
    public static int functionChoice() {
        System.out.println("Moi nhap chuc nang: ");
        int choice=0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice>0 && choice<=9){
                break;
            }
            System.out.println("Moi nhap lai chuc nang");
        }while (true);
        return choice;
    }

    public static void showNemu() {
        System.out.println("---Phan mem quan ly ban hang---");
        System.out.println("1. Nhap mat hang moi");
        System.out.println("2. In danh sach mat hang");
        System.out.println("3. Nhap nhan vien moi");
        System.out.println("4. In ra danh sach nhan vien");
        System.out.println("5. Bang danh sach ban hang ");
        System.out.println("6. In ra danh sach ban hang");
        System.out.println("7. Sap xep danh sach ban hang");
        System.out.println("8. Tinh doanh thu cho nhan vien");
        System.out.println("9. Ket thuc chuong trinh");
    }
}
