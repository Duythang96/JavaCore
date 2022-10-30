import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        System.out.println("Nhap h:");
        int h = new Scanner(System.in).nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
