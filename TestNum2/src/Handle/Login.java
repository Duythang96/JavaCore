package Handle;

import Entity.UserPass;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public void formLogin(Scanner scanner){
        ArrayList<UserPass> userPasses = new ArrayList<>();
        do {
            System.out.println("ACCOUNT LOGING");
            System.out.println("1. Sign in");
            System.out.println("2. Sign up");
            System.out.println("Please chooce the function:");
            try {
                int loginChoose = Integer.parseInt(scanner.nextLine());
                if (loginChoose > 0 && loginChoose <= 2) {
                    switch (loginChoose) {
                        case 1:
                            SignIn signIn = new SignIn();
                            signIn.Accountsignin(userPasses);
                            break;
                        case 2:
                            Signup signUp = new Signup();
                            signUp.creatAccount(userPasses);
                            break;
                    }
                }
            }catch (Exception e) {
                    System.out.println("Please re-input:");
                }
        }while (true);
    }
}
//    int loginChoose = Integer.parseInt(scanner.nextLine());
//                if (loginChoose>0&&loginChoose<=2){
//                        switch (loginChoose){
//                        case 1:
//                        SignIn signIn = new SignIn();
//                        signIn.Accountsignin(userPasses);
//                        break;
//                        case 2:
//                        Signup signUp = new Signup();
//                        signUp.creatAccount(userPasses);
//                        break;
//                        }
//                        }
//                        else {
//                        System.out.println("Please re-input:");
//                        }