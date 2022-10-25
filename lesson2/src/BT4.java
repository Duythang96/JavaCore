import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay thang nam sinh: dd/MM/yyyy");
        String d = input.next();
        LocalDate date = LocalDate.parse(d, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate date2 = java.time.LocalDate.now();
        Duration Age = Duration.between(date.atStartOfDay(),date2.atStartOfDay());
        System.out.println(Age.toDays()/365);
    }
}
