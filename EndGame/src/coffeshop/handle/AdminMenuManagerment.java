package coffeshop.handle;

import coffeshop.constants.Constant;
import coffeshop.entity.Menu;
import coffeshop.handle.MenuHandle;
import coffeshop.mainrun.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminMenuManagerment {
    public void MenuManagerment(Scanner sc){
        do {
            System.out.println("---Quản lý menu nhà hàng---");
            System.out.println("1. Thêm món ăn");
            System.out.println("2. Xóa món ăn");
            System.out.println("3. Danh sách món ăn");
            System.out.println("4. Quay lại");
            System.out.println("Mời chọn chức năng: ");
            int functionchoice = choiceFunction(sc);
            switch (functionchoice){
                case 1:
                    addMenu(sc, Main.menus);
                    break;
                case 2:
                    deleteMenu(sc,Main.menus);
                    break;
                case 3:
                    showMenu(sc,Main.menus);
                    break;
                case 4:
                    return;
            }
        }while (true);
    }

//    private void menuTemp() {
//        Menu menu1 = new Menu("Cocacola",Constant.DR.value,10000 );
//        Menu menu2 = new Menu("Pepsi",Constant.DR.value,10000 );
//        Menu menu3 = new Menu("Vịt quay",Constant.MC.value,150000 );
//        Menu menu4 = new Menu("Gà hấp",Constant.MC.value,10000 );
//        Menu menu5 = new Menu("Súp",Constant.TM.value,10000 );
//        Menu menu6 = new Menu("Khoai chiên",Constant.TM.value,10000 );
//        Main.menus.add(menu1);
//        Main.menus.add(menu2);
//        Main.menus.add(menu3);
//        Main.menus.add(menu4);
//        Main.menus.add(menu5);
//        Main.menus.add(menu6);
//    }

    private void showMenu(Scanner sc,ArrayList<Menu> menus) {
        System.out.println("Bạn muốn xem menu loại đồ ăn nào: ");
        System.out.println("1. Thức ăn nhẹ");
        System.out.println("2. Thức ăn mặn");
        System.out.println("3. Đồ uống");
        System.out.println("4. Quay lại");
        System.out.println("Hãy chọn: ");
        int functionChoice;
        do {
            try{
                functionChoice = Integer.parseInt(sc.nextLine());
                if (functionChoice>0&&functionChoice<=4){
                    break;
                }
                System.out.println("Mời chọn lại loại đồ ăn!");
            }catch (Exception e){
                System.out.println("Mời chọn lại loại đồ ăn!");
            }
        }while (true);
        if (functionChoice==1) {
            String type1 = Constant.TM.value;
            showFoodType(type1, menus);
        }
        if (functionChoice==2) {
            String type2 = Constant.MC.value;
            showFoodType(type2, menus);
        }
        if (functionChoice==3) {
            String type3 = Constant.DR.value;
            showFoodType(type3, menus);
        }
        if (functionChoice==4) {
            return;
        }
    }

    private void showFoodType(String type,ArrayList<Menu> menus){
        boolean temp = false;
        for (int i = 0; i < menus.size(); i++) {
            if (menus.get(i).getFoodType().equals(type)){
                System.out.println(menus.get(i));
                temp = true;
            }
        }
        if (temp==false){
            System.out.println("Không tìm thấy món ăn nào thuộc loại này!");
        }
    }

    private void deleteMenu(Scanner sc, ArrayList<Menu> menus) {
        System.out.println("Mời nhập id của thức ăn đồ uống bạn muốn xóa: ");
        int foodID = Integer.parseInt(sc.nextLine());
        boolean temp = false;
        for (int i = 0; i < menus.size(); i++) {
            if (foodID==menus.get(i).getId()){
                menus.remove(menus.get(i));
                temp =true;
            }
        }
        if (temp==false){
            System.out.println("Không tìm thấy món ăn có ID này!");
        }
        if (temp==true){
            System.out.println("Xóa món ăn thành công!");
        }
    }

    private void addMenu(Scanner sc,ArrayList<Menu> menus) {
        MenuHandle menuHandle = new MenuHandle();
        Menu menu = menuHandle.menuInput(sc);
        menus.add(menu);
        System.out.println("Thêm món ăn thành công");
    }

    private int choiceFunction(Scanner sc) {
        int function;
        do {
            try{
                function = Integer.parseInt(sc.nextLine());
                if (function>0&&function<=4){
                    return function;
                }
                System.out.println("Mời chọn lại chức năng!");
            }catch (Exception e){
                System.out.println("Mời chọn lại chức năng!");
            }
        }while (true);
    }
}
