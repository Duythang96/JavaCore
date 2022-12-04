package coffeshop.handle;

import coffeshop.entity.Order;
import coffeshop.mainrun.Main;

import java.util.Scanner;

public class OrderHandle {
    public Order orderInput(Scanner scanner){
        //
        System.out.println("Moi bạn nhập số lượng :");
        int foodAmount = numberInputCheck(scanner);
        Order order = new Order(foodAmount, Main.menus);
        return order;
    }

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
