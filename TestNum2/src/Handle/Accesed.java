package Handle;

import Entity.UserPass;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Accesed {

    public void AccessDisplay(String user, Scanner scanner, ArrayList<UserPass> userPasses){
        do {
            System.out.println("---Wellcome user "+user+"---");
            System.out.println("1. Change Username");
            System.out.println("2. Change Email");
            System.out.println("3. Change Password");
            System.out.println("4. SignOut");
            System.out.println("5. Exit");
            int functionChoose;
            do{
                try{
                    functionChoose =Integer.parseInt(scanner.nextLine());
                    if (functionChoose>0&&functionChoose<=6){
                        break;
                    }
                }catch (Exception e){
                    System.out.println("Function not correct, please re-select tne function:");
                }
            }while (true);
            switch (functionChoose){
                case 1:
                    changeUserName(scanner,user,userPasses);
                    break;
                case 2:
                    changeEmail(scanner,user,userPasses);
                    break;
                case 3:
                    changePass(scanner,user,userPasses);
                    break;
                case 4:
                    return;
                case 5:
                    System.exit(0);
                case 6:
                    for (int i = 0; i < userPasses.size(); i++) {
                        System.out.println(userPasses.get(i));
                    }
                    return;
            }
        }while (true);
    }

    private void changeUserName(Scanner scanner, String user, ArrayList<UserPass> userPasses) {
        String emailRegex = "^[A-Z][\\w(-_.,;)\\.]{2,30}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        System.out.println("Please input new name: ");
        String name;
        do {
            name = scanner.nextLine();
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.find()==true){
                break;
            }
            System.out.println("Invalid email! Please re-input:");
        }while (true);
        for (UserPass userPassCheck: userPasses){
            if (userPassCheck.getUser().compareTo(user)==0){
                userPassCheck.setUser(name);
                System.out.println("Name has changed!");
                break;
            }
        }
    }

    private void changeEmail(Scanner scanner, String user, ArrayList<UserPass> userPasses) {
        System.out.println("Please input new email: ");
        String email = scanner.nextLine();
        for (UserPass userPassCheck: userPasses){
            if (userPassCheck.getUser().compareTo(user)==0){
                userPassCheck.setEmail(email);
                System.out.println("Email has changed!");
                break;
            }
        }
    }

    private void changePass(Scanner scanner, String user, ArrayList<UserPass> userPasses) {
        String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-_,.;]).{7,15}$";
        System.out.println("Please input new password: ");
        String pass;
        do {
            pass = scanner.nextLine();
            Pattern pattern = Pattern.compile(passRegex);
            Matcher matcher = pattern.matcher(pass);
            if (matcher.find()==true){
                break;
            }
            System.out.println("Invalid password! Please re-input:");
        }while (true);
        for (UserPass userPassCheck: userPasses){
            if (userPassCheck.getUser().compareTo(user)==0){
                userPassCheck.setPass(pass);
                System.out.println("Password has changed!");
                break;
            }
        }

    }
}
