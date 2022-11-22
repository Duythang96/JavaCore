import java.util.ArrayList;
import java.util.Scanner;

public class Mainrun {
    public static void main(String[] args) {
        int studentNum= 0;
        float tempA = 0,tempB = 0,tempC = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Xep loai hoc sinh---");
        StudentAction studentAction = new StudentAction();
        ArrayList<Student> students = new ArrayList<>();
        do{
            Student student = studentAction.studentInput(scanner);
            students.add(student);
            studentNum++;
            System.out.println("Ban muon nhap them hs khong:");
            System.out.println("1. Co");
            System.out.println("2. Khong");
            int temp = Integer.parseInt(scanner.nextLine());
            if (temp!=1){
                studentGrading(students,tempA,tempB,tempC,studentNum);
                return;
            }
        }while (true);

    }



    private static void studentGrading(ArrayList<Student> students, float tempA,float tempB, float tempC, int studentNum) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
            if (students.get(i).getAvg()>=8){
                tempA++;
            }
            if (students.get(i).getAvg()>=6.5&&students.get(i).getAvg()<8){
                tempB++;
            }
            if (students.get(i).getAvg()<6.5){
                tempC++;
            }
        }
        System.out.println("tong hs:"+studentNum);
        System.out.println("hs A:"+tempA);
        System.out.println("hs B:"+tempB);
        System.out.println("hs C:"+tempC);

        System.out.println("% hoc sinh xep loai A: ");
        System.out.println((tempA/studentNum)*100+"%");
        System.out.println("% hoc sinh xep loai B: ");
        System.out.println((tempB/studentNum)*100+"%");
        System.out.println("% hoc sinh xep loai C: ");
        System.out.println((tempC/studentNum)*100+"%");
    }
}
