import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        System.out.println("Nhap n va m:");
        int col = new Scanner(System.in).nextInt();
        int row = new Scanner(System.in).nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i==0||j==0||i==row-1||j==col -1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}