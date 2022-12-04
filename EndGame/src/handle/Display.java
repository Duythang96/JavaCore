package handle;

import entity.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {
    AdminStaffManagerFunction adminFunction = new AdminStaffManagerFunction();
    AdminMenuManagerment adminMenuManagerment = new AdminMenuManagerment();
    RevenueManagerment revenueManagerment = new RevenueManagerment();
    public void adminDisplay(Scanner scanner, ArrayList<Staff> users){
        do {
            System.out.println("Màn hình cho chủ cửa hàng, Bạn muốn thực hiện chức năng gì: ");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý thực đơn");
            System.out.println("3. Xem danh sách hóa đơn");
            System.out.println("4. Thống kê doanh thu");
            System.out.println("5. Quay lai đăng nhập");
            int temp1 = 5;
            int functionChoice = choiceFunciton(scanner, temp1);
            switch (functionChoice){
                case 1:
                    adminFunction.staffManagerment(scanner,users);
                    break;
                case 2:
                    adminMenuManagerment.MenuManagerment(scanner);
                    break;
                case 3:
                    StaffShowReceipt staffShowReceipt = new StaffShowReceipt();
                    staffShowReceipt.staffShowReceiptAction(scanner);
                    break;
                case 4:
                    revenueManagerment.RevenueManagermentInput(scanner);
                    break;
                case 5:
                   Logging logging = new Logging();
                   logging.formLogging(scanner,users);
            }
        }while (true);
    }

    public void managerDisplay(Scanner scanner,String userName,ArrayList<Staff> users){
        do {
            System.out.println("Màn hình cho quản lý, Bạn muốn thực hiện chức năng gì: ");
            System.out.println("1. Xem danh sách nhân viên");
            System.out.println("2. Quản lý thực đơn");
            System.out.println("3. Xem danh sách hóa đơn");
            System.out.println("4. Thống kê doanh thu");
            System.out.println("5. Đổi mật khẩu");
            System.out.println("6. Quay lại đăng nhập");
            int temp1 =6;
            int functionChoice = choiceFunciton(scanner,temp1);
            switch (functionChoice){
                case 1:
                    ManagerShowStaff managerShowStaff = new ManagerShowStaff();
                    managerShowStaff.showStaffByPosition(scanner,users);
                    break;
                case 2:
                    adminMenuManagerment.MenuManagerment(scanner);
                    break;
                case 3:
                    StaffShowReceipt staffShowReceipt = new StaffShowReceipt();
                    staffShowReceipt.staffShowReceiptAction(scanner);
                    break;
                case 4:
                    revenueManagerment.RevenueManagermentInput(scanner);
                    break;
                case 5:
                    AccountChange accountChange = new AccountChange();
                    accountChange.accountChange(scanner,userName);
                    break;
                case 6:
                    Logging logging = new Logging();
                    logging.formLogging(scanner,users);
            }
        }while (true);
    }

    public void staffDisplay(Scanner scanner,String staffName,ArrayList<Staff> users){
        StaffReceipt staffReceipt = new StaffReceipt();
        StaffShowReceipt staffShowReceipt = new StaffShowReceipt();
        StaffShowMenu staffShowMenu = new StaffShowMenu();
        do {
            System.out.println("Màn hình cho nhân viên, Bạn muốn thực hiện chức năng gì: ");
            System.out.println("1. Lập hóa đơn");
            System.out.println("2. Xem danh sách hóa đơn");
            System.out.println("3. Tra cứu thực đơn");
            System.out.println("4. Đổi mật khẩu");
            System.out.println("5. Quay lại đăng nhập");
            int temp1 = 5;
            int functionChoice = choiceFunciton(scanner,temp1);
            switch (functionChoice){
                case 1:
                    staffReceipt.staffReceiptAction(scanner,staffName);
                    break;
                case 2:
                    staffShowReceipt.staffShowReceiptAction(scanner);
                    break;
                case 3:
                    staffShowMenu.menuShow();
                    break;
                case 4:
                    AccountChange accountChange = new AccountChange();
                    accountChange.accountChange(scanner,staffName);
                    break;
                case 5:
                    Logging logging = new Logging();
                    logging.formLogging(scanner,users);
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
