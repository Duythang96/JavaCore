import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class BT1 {
    public static void main(String[] args) {
        System.out.println("Nhap 4 so a,b,c,d");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int d = new Scanner(System.in).nextInt();
        int max = a;
        if(max<b) {
            max = b;
        }
        if (max<c){
            max = c;
        }
        if (max<d) {
            max = d;
        }
        System.out.println(max);
    }
}
