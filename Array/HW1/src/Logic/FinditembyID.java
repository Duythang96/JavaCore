package Logic;

import Main.MainRun;

import java.util.Scanner;

public class FinditembyID {
    public static void findItemByID() {
        System.out.println("Ban muon tim IO nao: ");
        int itemFind = new Scanner(System.in).nextInt();
        boolean check= false;
        for (int i = 0; i < MainRun.listItems.size(); i++) {
            if (MainRun.listItems.get(i)!=null && MainRun.listItems.get(i).getId()==itemFind){
                System.out.println(MainRun.listItems.get(i));
                modifyItem(i);
                check = true;
                break;
            }
        }
        if (check==false){
            System.out.println("Khong co san pham nay!");
        }
    }
    public static void modifyItem(int i) {
        showMenuModify();
        System.out.println("Moi chon chức năng: ");
        int modifyChoice;
        do {
            modifyChoice = new Scanner(System.in).nextInt();
            if (modifyChoice>0 && modifyChoice<=3){
                break;
            }
            System.out.println("Chức năng không hợp lệ, mời chọn lại!");
        }while (true);
        switch (modifyChoice){
            case 1:
                deleteItem(i);
                break;
            case 2:
                updateItem(i);
                break;
            case 3:
                return;
        }
    }

    public static void updateItem(int i) {
        System.out.println("Nhap so luong bạn muốn sửa: ");
        int newQuantity = new Scanner(System.in).nextInt();
        MainRun.listItems.get(i).setAmount(newQuantity);
        System.out.println("So luong đã được thay đổi");
    }

    public static void deleteItem(int i) {
        System.out.println("Đã xóa sản phẩm "+MainRun.listItems.get(i).getIteamName());
        MainRun.listItems.remove(i);
    }

    public static void showMenuModify() {
        System.out.println("Ban muon chinh sua gi");
        System.out.println("1. Xóa sản phẩm");
        System.out.println("2. Cập nhật số lượng sản phẩm");
        System.out.println("3. Quay lai menu");
    }
}
