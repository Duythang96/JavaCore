package handle;

import entity.Admin;
import entity.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class UserModel {
    public String login(Scanner sc, ArrayList<Staff> users){

        System.out.println("Mời bạn nhập username: ");
        String username= sc.nextLine();
        System.out.println("Mời bạn nhập password:");
        String pass= sc.nextLine();
        Display homeView = new Display();
        Admin admin = new Admin();
        //kiểm tra có phải chủ cửa hàng không
        if (admin.getAdminAccount().equals(username)&&admin.getAdminPass().equals(pass)){
            homeView.adminDisplay(sc,users);
        }
        else {
            for (Staff user : users) {
                // Kiểm tra xem username và pass của staff có đúng k
                if (user.getUserName().equals(username) && user.getUserPass().equals(pass)) {
                    System.out.println("Đăng nhập thành công!");
                    //Hiển thị màn hình chức năng
                    if (user.getPosition().equals("Manager")) {
                        homeView.managerDisplay(sc,username,users);
                    } else if (user.getPosition().equals("Cashier")) {
                        homeView.staffDisplay(sc,username,users);
                    }
                    // Trả về tên người dùng
                    return username;
                }
            }
        }
        System.out.println("Đăng nhập không thành công!");
        return "";
    }

    public void forgetPassword(Scanner sc, ArrayList<Staff> users){
        System.out.println("Moi nhập tài khoản: ");
        String userName = sc.nextLine();
        System.out.println("Mời nhập mã nhân viên: ");
        int id = numberInputCheck(sc);
        boolean temp = false;
        for(Staff user: users){
            if (user.getUserName().equals(userName)&&user.getId()==id) {
                System.out.println("Mời nhập lại pass: ");
                user.setUserPass(sc.nextLine());
                System.out.println("Đổi pass thành công");
                temp = true;
            }
        }
        if (!temp) {
            System.out.println("Mã nhân viên không chính xác!");
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
