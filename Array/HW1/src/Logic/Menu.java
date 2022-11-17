package Logic;

import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println("--CT Quan Ly San Pham---");
        System.out.println("1. Nhap san pham");
        System.out.println("2. Xem DS san pham");
        System.out.println("3. Tim san pham theo ten");
        System.out.println("4. Tim san pham theo ID");
        System.out.println("5. TIm san pham co so luong duoi 5");
        System.out.println("6. Tim sp theo muc gia");
        System.out.println("7. Thoat chuong trinh");
    }

    public static int functionChoice() {
        System.out.println("Moi nhap chuc năng: ");
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice>0&&choice<=7){
                break;
            }
            System.out.println("Chuc nang khong hop le, moi chon lai!");
        }while (true);
        return choice;
    }
}
