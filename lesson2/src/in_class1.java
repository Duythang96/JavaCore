import java.lang.Math;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class in_class1 {
    public static void main(String[] args) {
        String d1= "22/10/2022";
        String d2 = "25/10/2022";
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
        LocalDate day1 = LocalDate.parse(d1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate day2 = LocalDate.parse(d2,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Duration duration = Duration.between(day1.atStartOfDay(),day2.atStartOfDay());
        System.out.println(duration.toDays());
    }
}
