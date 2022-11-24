import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mainrun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetAction petAction = new PetAction();
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Pet> pets1 = new ArrayList<>();
        while (true){
            System.out.println("----CT phoi giong thu cung----");
            System.out.println("1. Nhap danh sach thu cung");
            System.out.println("2. Nhap thong tin thú cưng của bạn và ghep doi");
            System.out.println("3. Thoat chuong trinh");
            int systemChoice = choiceFunction(sc);

            switch (systemChoice){
                case 1:
                    petListInput(sc,petAction,pets);
                    break;
                case 2:
                    petInput(sc,petAction,pets1,pets);
                    break;
                case 3:
                    return;
            }
        }
    }

    private static int choiceFunction(Scanner sc){
        System.out.println("Moi nhap chuc nang: ");
        int choice;
        do {
            choice = Integer.parseInt(sc.nextLine());
            if (choice>0 && choice<=3){
                break;
            }
            System.out.println("Moi nhap lai chuc nang");
        }while (true);
        return choice;
    }

    private static void petInput(Scanner sc, PetAction petAction, ArrayList<Pet> pets1,ArrayList<Pet> pets){
        System.out.println("Nhap thong tin thú cưng:");
        Pet pet = petAction.petInput(sc);
        pets1.add(pet);
        System.out.println("Thong tin thú cưng ghép đôi");
        boolean find = false;
        for (Pet p: pets1){
            Pattern pattern1 = Pattern.compile(p.getType());
            Matcher matcher;
            for (Pet p1: pets) {
                matcher = pattern1.matcher(p1.getType());
                if (matcher.find()&& !p.getSex().equals(p1.getSex())){
                    System.out.println(p);
                    find = true;
                }

            }
        }
        if (!find){
            System.out.println("Không có thú cưng phù hợp!");
        }
        }

    private static void petListInput(Scanner sc, PetAction petAction, ArrayList<Pet> pets) {
        System.out.println("Nhap danh sách thú cưng");
        while (true){
            Pet pet = petAction.petInput(sc);
            pets.add(pet);
            System.out.println("Bạn muốn nhập tiếp không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice;
            do {
                choice = Integer.parseInt(sc.nextLine());
                if (choice==2||choice==1){
                    break;
                }
                if (choice<0||choice>2){
                    System.out.println("moi chon lai");
                }
            }while (true);
            if (choice==2){
                break;
            }
        }
    }
}
