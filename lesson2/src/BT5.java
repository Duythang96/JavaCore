import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        String a;
        String b;
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap chuoi: ");
        a = input.nextLine();
        System.out.println("Hay nhap ky tu: ");
        b = input.nextLine();
        int index1 = a.indexOf(b);
        int index2 = a.lastIndexOf(b);
        System.out.println("Vi tri dau tien: "+index1);
        System.out.println("Vi tri cuoi cung: "+index2);
    }
}
