import java.util.Scanner;
import java.lang.Math;

public class BT6 {
    public static void main(String[] args) {
        final float PI = 3.14f;
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhap ban kinh r= ");
        float r = input.nextFloat();
        double S = PI*Math.pow(r,2);
        System.out.printf("Dien tich hinh tron: %.2f",S);
    }
}
