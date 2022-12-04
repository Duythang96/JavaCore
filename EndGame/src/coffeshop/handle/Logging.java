package coffeshop.handle;

import coffeshop.entity.Admin;
import coffeshop.entity.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class Logging {

    UserModel userModel = new UserModel();

    public void formLogging(Scanner scanner, ArrayList<Staff> users) {
        Admin admin = new Admin();
        Display display = new Display();
        do {
            System.out.println("---ACCOUNT LOGING---");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Thoát chương trình");
            System.out.println("Mời chọn chức năng: ");
            int temp = 2;
            int choose = choiceFunciton(scanner,temp);
            switch (choose) {
                case 1:
                    String checkloging = userModel.login(scanner, users);
                    //check logging
                    if (checkloging.equals("")) {
                        loginWrongView(scanner, users);
                    }
                    break;
                case 2:
                    System.exit(0);
            }
        }while (true);
    }

    private void loginWrongView(Scanner scanner, ArrayList<Staff> users) {
        System.out.println("Sai tài khoản hoặc mật khẩu");
        System.out.println("1. Đăng nhập lại");
        System.out.println("2. Quên mật khẩu");
        System.out.println("Mời chọn chức năng: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                userModel.login(scanner, users);
                break;
            case 2:
                userModel.forgetPassword(scanner, users);
                break;
        }
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
