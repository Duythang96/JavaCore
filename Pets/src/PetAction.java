import java.util.Scanner;

public class PetAction {

    public Pet petInput(Scanner scanner){
            System.out.println("Moi nhap tên thú cưng: ");
            String name = scanner.nextLine();
            System.out.println("Moi nhap giống loài thú cưng: ");
            String species = scanner.nextLine();
            System.out.println("Moi nhap tuoi thú cưng: ");
            String age = null;
            do {
                age = scanner.nextLine();
                checkNumber(age);
                if (checkNumber(age)==true){
                    break;
                }
                else {
                    System.out.println("Moi nhap lai");
                }
            }while (true);
            System.out.println("Moi nhap giới tính thú cưng: ");
            System.out.println("1.Male");
            System.out.println("2.Female");
            int sexChoice = Integer.parseInt(scanner.nextLine());
            String sex = null;
            if (sexChoice>0&&sexChoice<=2) {
                switch (sexChoice) {
                    case 1:
                        sex = Pettype.M.value;
                        break;
                    case 2:
                        sex = Pettype.F.value;
                        break;
                }
            }
            System.out.println("Moi nhap mô tả thú cưng: ");
            String description = scanner.nextLine();
            System.out.println("Moi chon loại thú cưng: ");
            System.out.println("1.Chó");
            System.out.println("2.Mèo");
            String type = null;
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice>0&&choice<=2) {
                switch (choice) {
                    case 1:
                        type = Pettype.DOG.value;
                        break;
                    case 2:
                        type = Pettype.CAT.value;
                        break;
                }
            }
            System.out.println("Moi ảnh thú cưng: ");
            String images = scanner.nextLine();
            Pet pet = new Pet(name,species,age,sex,description,type,images);
            return pet;
    }

    public static boolean checkNumber(String checkNum){
        if (checkNum == null){
            return false;
        }
        try {
            int num = Integer.parseInt(checkNum);
        }catch (NumberFormatException e){
            return false;
        }
        return  true;
    }
}
