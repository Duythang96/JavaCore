package coffeshop.handle;

import coffeshop.entity.Order;
import coffeshop.entity.Receipt;
import coffeshop.mainrun.Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ReceiptHandle {
    public Receipt receiptInput(Scanner sc,String staffN){
        //add tên người tạo hóa đơn vào staffname
        String staffName = staffN;
        //lấy năm và tháng tại thời điểm tạo hóa đơn
        Calendar instance = Calendar.getInstance();
        int year =instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH)+1;
        //Hien thi danh sach mon an
        System.out.println("Danh sách menu đang có:");
        for (int i = 0; i <Main.menus.size() ; i++) {
            System.out.println(Main.menus.get(i).getFoodName()+" ID: "+Main.menus.get(i).getId());
        }
        //nhập danh sách món ăn chọn từ menu theo id
        ArrayList<Order> oderReceipt = new ArrayList<>();
        int foodIdforRe;
        boolean temp;
        do {
            do {
                System.out.println("Mời nhập id đồ muốn chọn: ");
                do {
                    try{
                        foodIdforRe = Integer.parseInt(sc.nextLine());
                        break;
                    }catch (Exception e){
                        System.out.println("Sai định dạng, mời nhập lại");
                    }
                }while (true);
                temp = false;
                for (int i = 0; i < Main.menus.size(); i++) {
                    if (Main.menus.get(i).getId()==foodIdforRe){
                        OrderHandle orderHandle = new OrderHandle();
                        Order order = orderHandle.orderInput(sc);
                        oderReceipt.add(order);
                        temp = true;
                    }
                }
                System.out.println("Bạn muốn chọn thêm đồ không:");
                System.out.println("1. Có");
                System.out.println("2. Không");
                int temp2 = 2;
                int choose = choiceFunciton(sc,temp2);
                if (choose==2){
                    break;
                }
            }while (true);
            if (temp==false){
                System.out.println("Không tìm thấy id này!Mời nhập lại");
            }
            if (temp==true){
                break;
            }
        }while (true);
        //
        Receipt receipt = new Receipt(year,month,staffName,oderReceipt);
        return receipt;
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


    private int choiceFunciton(Scanner scanner,int temp) {
        int choice;
        do {
            try{
                choice = Integer.parseInt(scanner.nextLine());
                if (choice>0&&choice<=temp){
                    return choice;
                }
            }catch (Exception e){
                System.out.println("Mời chọn lại chức năng!");
            }
        }while (true);
    }
}
