package Handle;

import Entity.UserPass;
import Handle.UserpassAction;
import Main.Mainrun;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignIn {
    public void Accountsignin(ArrayList<UserPass> userPasses){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---SIGN IN---");
        do {
            System.out.println("User Name:");
            String userName = scanner.nextLine();
            System.out.println("Password:");
            String userPass = scanner.nextLine();
            boolean temp = true;
            boolean temp1 = true;
            for (int i = 0; i < userPasses.size() ; i++) {
                if (userPasses.get(i).getUser().compareTo(userName)==0){
                    if (userPasses.get(i).getPass().compareTo(userPass)==0){
                        Accesed accesed = new Accesed();
                        accesed.AccessDisplay(userName,scanner,userPasses);
                        return;
                    }
                    else {
                        temp = false;
                    }
                    if (temp==false){
                        System.out.println("Password wrong!");
                        break;
                    }
                }
                else {
                    temp1=false;
                }
            }
            if (temp1==false){
                System.out.println("Incorrect Account! Please re-confirm");
                break;
            }
        }while (true);

    }
}
