import java.util.Scanner;

public class BT12 {
    public static void main(String[] args) {
        System.out.println("Nhap n va m:");
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        int s=0;
        int tam;
        if (n<m) {
            for (int i = n; i <= m; i++) {
                tam = (int)Math.sqrt(i);
               // System.out.println(tam);
                if (tam * tam == i) {
                    System.out.print(i+", ");
                    s++;
                }
            }
            System.out.println("co "+s+" so chinh phuong");
        }
        else {
            System.out.println("nhap n<m");
        }
    }
}
