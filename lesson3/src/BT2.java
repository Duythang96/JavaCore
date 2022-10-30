import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        System.out.println("Nhap so tu nhien n");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.print(i+",");
            }
        }
    }
}
