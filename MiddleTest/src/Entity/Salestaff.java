package Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Salestaff extends Person{

    public static int autoID = 0;
    private int id;
    private LocalDate contracDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getContracDate() {
        return contracDate;
    }

    public void setContracDate(LocalDate contracDate) {
        this.contracDate = contracDate;
    }

    @Override
    public String toString() {
        return "Salestaff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", contracDate=" + contracDate +
                '}';
    }
    @Override
    public void inputInfor(){
        this.id = autoID;
        autoID++;
        super.inputInfor();
        System.out.println("Moi nhap ngay ky hop dong(dd/MM/yyyy):");
        String date = new Scanner(System.in).next();
        this.contracDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
