import java.util.Scanner;

public class BT15 {
    public static void main(String[] args) {
        System.out.println("Nhap n va m:");
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        while (n != m) {
            if (n > m)
                n = n - m;
            else
                m = m - n;
        }
        if (m == 1) {
            System.out.printf("la so nt cung nhau");
        }
        else {
            System.out.printf("ko la so nt cung nhau");
        }
    }
}

