import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        int tam =1;
        int j =2;
        System.out.println(n+" So nguyen to dau tien la:");
        while (count < n) {
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    tam = 0;
                    break;
                }
            }
            if (tam!=0){
                System.out.println(j);
                count++;
            }
            tam=1;
            j++;
            }
        }
    }
