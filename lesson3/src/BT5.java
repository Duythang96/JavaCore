import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n = new Scanner(System.in).nextInt();
        int m =n;
        int invert=0;
        while (m>0){
            invert = (invert*10)+(m%10);
            m/=10;
        }
        if (invert==n){
            System.out.println(n+" la so thuan nghich");
        }
        else{
            System.out.println(n+" ko la so thuan nghich");
        }
    }
}
