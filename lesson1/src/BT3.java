
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.lang.Math;

public class BT3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        int c = 6;
        int d = 2;
        int Max = (a<b)? b:a;
        int Max1 = (Max<c)? c:Max;
        int Max2 = (Max1<d)? d:Max1;

        System.out.println("So lon nhat la "+Max2);
    }
}
