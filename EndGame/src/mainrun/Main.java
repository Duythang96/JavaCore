package mainrun;

import entity.*;
import handle.Logging;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Staff> users = new ArrayList<>();
    public static ArrayList<Menu> menus = new ArrayList<>();
    public static ArrayList<Receipt> receipts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ NHÀ HÀNG---");
        Logging logging = new Logging();
        logging.formLogging(scanner,users);

    }
}
