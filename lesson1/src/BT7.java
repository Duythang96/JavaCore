public class BT7 {
    public static void main(String[] args) {
        float a = 3;
        float b = -8;
        float c = 4;
        final double DELTA = Math.pow(b,2)-(4*a*c);
        double x1 =(DELTA>0)?  (-b+Math.sqrt(DELTA))/(2*a):0;
        double x2 =(DELTA>0)?  (-b-Math.sqrt(DELTA))/(2*a):0;
        System.out.println("X1= "+x1+ "X2= "+ x2);
    }
}
