import java.util.ArrayList;
import java.util.Scanner;

public class Mainrun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentAction studentAction = new StudentAction();
        ArrayList<Student> students = new ArrayList<>();
        // vong lap nhap ten hoc sinh
        do {
            Student student = studentAction.studentInput(scanner);
            students.add(student);
            System.out.println("Ban muon nhap them hoc sinh khong?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice!=1){
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));  // in thong tin tung hoc sinh
                }
                break;
            }
        }while (true);
    }
}
