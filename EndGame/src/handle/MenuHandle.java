package handle;

import constants.Constant;
import entity.Menu;

import java.util.Scanner;

public class MenuHandle {
    public Menu menuInput(Scanner sc){
        System.out.println("Mời bạn nhập loại món ăn muốn thêm: ");
        String foodType = foodTypeInput(sc);
        //
        System.out.println("Mời bạn nhập tên món ăn: ");
        String foodName = sc.nextLine();
        //
        System.out.println("Mời bạn nhập giá cho món này: ");
        int price = Integer.parseInt(sc.nextLine());
        //
        Menu menu = new Menu(foodType,foodName,price);
        return menu;
    }

    private String foodTypeInput(Scanner sc) {
        System.out.println("1. Thức ăn nhẹ");
        System.out.println("2. Thức ăn mặn");
        System.out.println("3. Đồ uống");
        System.out.println("Hãy chọn: ");
        int functionChoice;
        String foodTyppe = null;
        do {
            try{
                functionChoice = Integer.parseInt(sc.nextLine());
                if (functionChoice>0&&functionChoice<=3){
                    break;
                }
                System.out.println("Mời chọn lại loại đồ ăn!");
            }catch (Exception e){
                System.out.println("Mời chọn lại loại đồ ăn!");
            }
        }while (true);
        switch (functionChoice){
            case 1:
                foodTyppe = Constant.TM.value;
                break;
            case 2:
                foodTyppe = Constant.MC.value;
                break;
            case 3:
                foodTyppe = Constant.DR.value;
                break;
        }
        return foodTyppe;
    }
}
