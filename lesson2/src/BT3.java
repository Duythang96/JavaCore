import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhapp chieu dai: ");
        float a = input.nextFloat();
        System.out.println("Nhap chieu rong: ");
        float b = input.nextFloat();
        System.out.printf("Dien tich hinh chu nhat: %.2f",a*b);
        System.out.printf("\nChu vi hinh chu nhat: %.2f",2*(a+b));
    }
}
