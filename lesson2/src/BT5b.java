import java.util.Scanner;

public class BT5b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi kt 1: ");
        String s = input.nextLine();
        System.out.println("Nhap chuoi kt 2: ");
        String s1 = input.nextLine();
        System.out.println("Nhap chuoi kt 3: ");
        String s2 = input.nextLine();
        System.out.println(s.replace(s1,s2));
    }
}
