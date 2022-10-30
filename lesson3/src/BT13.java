import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 0; i <= n; i++) {
            if (i%7==0){
                S+=i;
                System.out.print(i+", ");
            }
        }
        System.out.printf("\ntong cac so chia het cho 7: %d",S);
    }
}
