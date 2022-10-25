import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        float a= input.nextFloat();
        System.out.println("Nhap so b: ");
        float b = input.nextFloat();
        String x = (a==0)? "Nhap a khac 0":"X = "+(-b/a);
        System.out.println(x);
    }
}
