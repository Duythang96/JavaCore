import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        System.out.println("Nhap h:");
        int h = new Scanner(System.in).nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = h; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
}