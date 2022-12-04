package coffeshop.handle;

import coffeshop.mainrun.Main;

import java.util.Scanner;

public class RevenueManagerment {
    public void RevenueManagermentInput(Scanner sc){
        System.out.println("---Tính doanh thu tháng---");
        System.out.println("Mời bạn nhập năm cần tính: ");
        int yearForRev = numberInputCheck(sc);
        System.out.println("Mời bạn nhập tháng cần tính: ");
        int monthForRev = numberInputCheck(sc);
        System.out.println("Mời bạn nhập tiền nguyên liệu đầu vào: ");
        int priceIn = numberInputCheck(sc);
        //
        boolean temp = false;
        int priceTotal=0;
        for (int i = 0; i < Main.receipts.size(); i++) {
            //tìm hóa đơn tháng cần tính doanh thu
            if (Main.receipts.get(i).getMonth()==monthForRev && Main.receipts.get(i).getYear()==yearForRev){
                temp = true;
                for (int j = 0; j < Main.receipts.get(i).getFoodList().size(); j++) {
                    priceTotal+= Main.receipts.get(i).getFoodList().get(j).getMenulist().get(0).getFoodPrice() * Main.receipts.get(i).getFoodList().get(j).getAmount();
                    System.out.println("Tổng tiền bán hàng trong tháng "+monthForRev+":"+priceTotal);
                }
            }
        }
        System.out.println("Tổng tiền bán hàng trong tháng "+monthForRev+":"+priceTotal);
        if (temp==true){
            int turnover = priceTotal-priceIn;
            if (turnover>0){
                System.out.println("Doanh số tháng "+monthForRev+":"+turnover);
            }
            if (turnover<0){
                System.out.println("Doanh số tháng "+monthForRev+"lỗ :"+turnover);
            }
        }
        if (temp==false){
            System.out.println("Không tìm thấy tháng hoặc năm tương ứng!");
        }

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
