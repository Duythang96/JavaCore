package coffeshop.handle;

import coffeshop.mainrun.Main;

import java.util.Scanner;

public class AccountChange {
    public void accountChange(Scanner scanner,String userName){
        System.out.println("---Thay đổi mật khẩu---");
        System.out.println("Mời bạn nhập mật khẩu mới:");
        String newPass = scanner.nextLine();
        for (int i = 0; i < Main.users.size(); i++) {
            if (Main.users.get(i).getUserName()==userName) {
                Main.users.get(i).setUserPass(userName);
            }
        }
        System.out.println("Đổi pass thành công");
        }
    }
