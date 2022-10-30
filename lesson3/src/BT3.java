import sun.security.rsa.RSASignature;
import sun.util.resources.cldr.ln.CurrencyNames_ln;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        System.out.println("Nhap 4 so a,b");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int ucln = 0;
        int bcnn = 0;
        if (a==0 || b==0){
            System.out.printf("ucln la: %d", a+b);
            System.out.printf("\nKhong co bcnn");
        }
        else {
            for (int i = 1; i <= a || i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    ucln = i;
                    bcnn = (a * b) / ucln;
                }
            }
            System.out.printf("ucln la: %d", ucln);
            System.out.printf("\nBCNN là :%d", bcnn);
        }
    }
}
