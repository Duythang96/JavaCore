package Handle;

import Entity.UserPass;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserpassAction {
    public UserPass UserpassInput(Scanner scanner, ArrayList<UserPass> userPasses){
        // Nhập user name
        System.out.println("User Name:");
        String userName = userNameInput(scanner,userPasses);

        //Nhập password
        System.out.println("Password (Exg:Duythang_96):");
        String userPass = userPassInput(scanner,userPasses);

        //Nhập email
        System.out.println("Email (Exg:Duythang96@gmail.com):");
        String email = emailInput(scanner,userPasses);

        return new UserPass(userName,userPass,email);
    }

    private String emailInput(Scanner scanner, ArrayList<UserPass> userPasses) {
        String emailRegex = "^[A-Z][\\w(-_.,;)\\.]{2,30}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        //địa chỉ email phải bắt đầu bằng 1 ký tự chữ hoa
        //tập hợp của các ký tự a-z, 0-9 và có thể có các ký tự đặc biệt
        //tên miền của email có thể là tên miền cấp 1 or tên miền cấp 2
        // Duythang_96@mail.co.jp
        String email;
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher;
        do {
            boolean temp = true;
            boolean temp2 = false;
            email = scanner.nextLine();
            matcher = pattern.matcher(email);
            //kt co du lieu chua
            if (matcher.find()==true){
                temp2=true;
            }
            if (userPasses.size()==0&&temp2==true){
                break;
            }
            //kt co trùng user ko
            for (UserPass userPassCheck: userPasses){
                if (userPassCheck.getEmail().compareTo(email)==0){
                    temp = false;
                }
            }
            if (temp==false){
                System.out.println("Email available!Please re-input:");
            }
            if (temp==true&&temp2==false){
                System.out.println("Invalid email! Please re-input:");
            }
            if (temp==true&&temp2==true){
                break;
            }
        }while (true);
        return email;
    }

    private String userPassInput(Scanner scanner, ArrayList<UserPass> userPasses) {
        String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-_,.;]).{7,15}$";
        //co chữ thường // có chữ hoa// có số // có kỹ tự đặc biệt
        String userPass;
        Pattern pattern1 = Pattern.compile(passRegex);
        Matcher matcher1;
        do {
            boolean temp = true;
            userPass = scanner.nextLine();
            matcher1 = pattern1.matcher(userPass);
            if (matcher1.find()==true){
                break;
            }
            else{
                System.out.println("Invalid password! Please re-input:");
            }
        }while (true);
        return userPass;
    }

    private String userNameInput(Scanner scanner, ArrayList<UserPass> userPasses) {
        String userName;
        do {
            boolean temp = true;
            userName=  scanner.nextLine();
            if (userPasses.size()==0){
                break;
            }
            for (UserPass userPassCheck: userPasses){
                if (userPassCheck.getUser().compareTo(userName)==0){
                    temp = false;
                }
            }
            if (temp==false){
                System.out.println("Username available!");
            }
            if (temp==true){
                break;
            }
        }while (true);
        return userName;
    }
}
