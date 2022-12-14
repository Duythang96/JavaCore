package coffeshop.handle;

import coffeshop.entity.Receipt;
import coffeshop.mainrun.Main;

import java.util.Scanner;

public class StaffReceipt {
    public void staffReceiptAction(Scanner sc,String userName){
        System.out.println("---Hóa đơn---");
        ReceiptHandle receiptHandle = new ReceiptHandle();
        do {
            Receipt receipt = receiptHandle.receiptInput(sc,userName);
            Main.receipts.add(receipt);
            System.out.println("Bạn muốn in hóa đơn không:");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int temp = 2;
            int choose = choiceFunciton(sc,temp);
            if (choose==2){
                break;
            }
            if (temp==1){
                System.out.println("---Hóa đơn---");

            }
        }while (true);
        System.out.println("Nhập hóa đơn thành công!");
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
