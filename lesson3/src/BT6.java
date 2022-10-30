import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n = new Scanner(System.in).nextInt();
        int tam=0;
        int s=0;
        while (n>0){
            tam=(n%10);
            n/=10;
            s+=tam;
        }
        System.out.println(s);
    }
}
