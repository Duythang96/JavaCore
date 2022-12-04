package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Person implements InputTable{
    protected String name;
    protected String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    @Override
    public void inputInfor(Scanner scanner){
        System.out.println("Mời nhập tên nhân viên: ");
        this.name = scanner.nextLine();
        System.out.println("Mời nhập số điện thoại nhân viên: ");
        this.phone = scanner.nextLine();
    }
}
