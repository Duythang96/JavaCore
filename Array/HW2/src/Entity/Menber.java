package Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menber {
    protected int id;
    protected String name;
    protected LocalDate dob;
    protected String job;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getdob() {
        return dob;
    }

    public void setdob(LocalDate dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Menber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }
    public void inputInfor(int i){
        System.out.println("Please input the information for member "+(i+1)+":");
        System.out.println("Member's ID: ");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("Member's name: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Date of birth (dd/MM/yy) :");
        String date = new Scanner(System.in).next();
        this.dob = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Member's job: ");
        this.job = new Scanner(System.in).nextLine();
    }
}
