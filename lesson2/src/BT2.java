import java.util.Scanner;
import java.lang.Math;

public class BT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        float a = input.nextFloat();
        System.out.println("Nhap so b: ");
        float b = input.nextFloat();
        System.out.println("Nhap so c: ");
        float c = input.nextFloat();
        double alpha = Math.pow(b,2)-4*a*c;
        String x = (alpha==0)? "X1= X2= "+-b/(2*a):(alpha<0)? "PT vo nghiem":"X1= "+(-b+Math.sqrt(alpha))/(2*a)+"\nX2= "+(-b+Math.sqrt(alpha))/(2*a);
        System.out.println(x);
    }
}
