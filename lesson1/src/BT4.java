import java.lang.Math;
public class BT4 {
    public static void main(String[] args) {
        float n = 2; // căn bậc 2
        float m = 1; // số trong căn mũ 1
        float a = 5; // số trong căn
        double p = Math.pow(a,(m / n));

        System.out.println("Can bac " + n + "cua "+a+"la " +(double)Math.round(p*1000)/1000);
    }
}
