package coffeshop.handle;

import coffeshop.mainrun.Main;

import java.util.Scanner;

public class StaffShowReceipt {
    public void staffShowReceiptAction(Scanner scanner){
        System.out.println("---Danh sách hóa đơn---");
        System.out.println("1. Hiển thị hóa đơn theo tháng");
        System.out.println("2. Hiển thị tat ca hóa đơn ");
        System.out.println("3. Quay lại");
        int temp = 3;
        int functionChoice = choiceFunciton(scanner,temp);
        switch (functionChoice){
            case 1:
                showReceiptByMonth(scanner);
                break;
            case 2:
                showReceipt();
                break;
            case 3:
                return;
        }
    }

    private void showReceipt() {
        for (int i = 0; i < Main.receipts.size(); i++) {
            System.out.println(Main.receipts.get(i));
        }
    }

    private void showReceiptByMonth(Scanner scanner) {
        System.out.println("Bạn muốn xem hóa đơn của năm nào: ");
        int year = numberInputCheck(scanner);
        System.out.println("Bạn muốn xem hóa đơn của tháng nào trong năm"+year+": ");
        int month= numberInputCheck(scanner);
        boolean temp = false;
        for (int i = 0; i < Main.receipts.size(); i++) {
            if (Main.receipts.get(i).getMonth()==month&&Main.receipts.get(i).getYear()==year){
                temp = true;
                System.out.println(Main.receipts.get(i));
            }
        }
        if (temp==false){
            System.out.println("Không tìm thấy tháng hoặc năm này!");
        }
    }

    private int choiceFunciton(Scanner scanner, int temp) {
        int choice = Integer.parseInt(scanner.nextLine());
        do {
            try{
                if (choice>0&&choice<=temp){
                    return choice;
                }
            }catch (Exception e){
                System.out.println("Mời chọn lại chức năng!");
            }
        }while (true);
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
