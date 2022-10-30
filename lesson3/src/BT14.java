import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        System.out.println("so chan:");
        for (int i = 0; i <= n; i+=2) {
            System.out.print(i+",");
        }
        System.out.println("\nso le:");
        for (int i = 1; i <= n; i+=2) {
                System.out.print(i+",");
        }
    }
}
