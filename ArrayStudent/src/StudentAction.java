import java.util.Scanner;

public class StudentAction {
    public Student studentInput(Scanner scanner){
        int i=1;
        while (i!=0){
            try{
                System.out.println("Moi nhap ten hoc sinh: ");
                String name = scanner.nextLine();
                System.out.println("Moi nhap dia chi hoc sinh: ");
                String address = scanner.nextLine();
                System.out.println("Moi nhap tuoi hoc sinh: ");
                int age = Integer.parseInt(scanner.nextLine());
                return new Student(name,address,age);
            }catch (Exception e){
                System.out.println("Ban da nhap sai dinh dang, moi ban nhap lai!");
            }
        }
        return null;
    }
}
