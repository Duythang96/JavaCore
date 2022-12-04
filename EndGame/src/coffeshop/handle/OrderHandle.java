package coffeshop.handle;

import coffeshop.entity.Menu;
import coffeshop.entity.Order;
import coffeshop.mainrun.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderHandle {
//    public Order orderInput(Scanner scanner,ArrayList<Menu> menuOder){
//        //
//        System.out.println("Moi bạn nhập số lượng :");
//        int foodAmount = numberInputCheck(scanner);
//        ArrayList<Menu> menuOder2 = menuOder;
//        //Order order = new Order(foodAmount, menuOrder2);
//       // return order;
//    }

    public int numberInputCheck(Scanner sc){
        int number;
        do {
            try{
                number=Integer.parseInt(sc.nextLine());
                return number;
            }catch (Exception e){
                System.out.println("Sai định dạng! Mời nhập lại.");
            }
        }while (true);
    }
}
