package Main;

import Handle.Login;

import java.util.Scanner;

public class Mainrun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Login Program---");
        Login login = new Login();
        login.formLogin(scanner);
    }
}
