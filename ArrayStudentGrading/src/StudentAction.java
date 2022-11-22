import java.util.Scanner;

public class StudentAction {
    public Student studentInput(Scanner scanner){
        int i =1;
        double avg;
        do{
            try{
                System.out.println("Moi nhap ten hoc sinh: ");
                String name = scanner.nextLine();
                System.out.println("Moi nhap ten diem toan: ");
                int scoreM = Integer.parseInt(scanner.nextLine());
                System.out.println("Moi nhap diem ly: ");
                int scoreP = Integer.parseInt(scanner.nextLine());
                System.out.println("Moi nhap diem hoa: ");
                int scoreC = Integer.parseInt(scanner.nextLine());
                avg = (double)((scoreC+scoreP+scoreM)/3);
                return new Student(name,scoreM,scoreP,scoreC, avg);
            }catch (Exception e){
                System.out.println("Ban nhap sai dinh dang, moi nhap lai!");
                return null;
            }
        }while(i!=0);

    }
}
