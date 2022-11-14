package Entity;

import java.util.Scanner;

public class Person implements Inputtable{
    protected String name;
    protected String address;
    protected String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    @Override
    public void inputInfor(){
        System.out.println("Moi nhap ten nhan vien:");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Moi nhap dia chi nhan vien:");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Moi nhap so dien thoai:");
        this.phone = new Scanner(System.in).nextLine();
    }
}
