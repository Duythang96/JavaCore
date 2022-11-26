package Handle;

import Entity.UserPass;

import java.util.ArrayList;
import java.util.Scanner;

public class Signup {
   public void creatAccount(ArrayList<UserPass> userPasses){
       Scanner scanner = new Scanner(System.in);
       System.out.println("----SIGN UP----");
       UserpassAction userpassAction = new UserpassAction();
       UserPass userPass = userpassAction.UserpassInput(scanner,userPasses);
       userPasses.add(userPass);
       System.out.println("Sign Up Success!");
    }
}
