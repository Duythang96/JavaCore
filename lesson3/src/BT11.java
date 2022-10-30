import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n = new Scanner(System.in).nextInt();
        int S = 0;int S1 = 0;int S2 = 0;
        for (int i = 0; i <=n; i++) {
            S+=i;
        }
        System.out.printf("S = %d",S);
        for (int i = 1; i <=n; i+=2) {
            S1+=i;
        }
        System.out.printf("\nS1 = %d",S1);
        for (int i = 0; i <=n; i+=2) {
            S2+=i;
        }
        System.out.printf("\nS2 = %d",S2);

    }
}
