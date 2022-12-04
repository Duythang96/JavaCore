package handle;

import entity.Menu;
import entity.Receipt;
import entity.Table;
import mainrun.Main;

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
        //nhập danh sách món ăn chọn từ menu theo id
        ArrayList<Menu> menuReceipt = new ArrayList<>();
        int foodIdforRe;
        do {
            System.out.println("Mời nhập id món ăn muốn chọn: ");
            do {
                try{
                    foodIdforRe = Integer.parseInt(sc.nextLine());
                    break;
                }catch (Exception e){
                    System.out.println("Sai định dạng, mời nhập lại");
                }
            }while (true);
            boolean temp = false;
            for (int i = 0; i < Main.menus.size(); i++) {
                if (Main.menus.get(i).getId()==foodIdforRe){
                    menuReceipt.add(Main.menus.get(i));
                    temp = true;
                }
            }
            if (temp==false){
                System.out.println("Không tìm thấy id này!Mời nhập lại");
            }
            if (temp==true){
                break;
            }
        }while (true);
        //nhập số lượng
        System.out.println("Nhập số lượng: ");
        int amount = numberInputCheck(sc);
        //
        Receipt receipt = new Receipt(year,month,staffName,menuReceipt,amount);
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
}
