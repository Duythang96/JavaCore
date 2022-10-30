import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        System.out.println("Nhap n va m:");
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
