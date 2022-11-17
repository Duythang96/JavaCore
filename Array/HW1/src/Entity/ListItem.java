package Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class ListItem {
    public static int autoID = 100;
    protected int id;
    protected String iteamName;
    protected String iteamDescribe;
    protected int amount;
    protected int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIteamName() {
        return iteamName;
    }

    public void setIteamName(String iteamName) {
        this.iteamName = iteamName;
    }

    public String getIteamDescribe() {
        return iteamDescribe;
    }

    public void setIteamDescribe(String iteamDescribe) {
        this.iteamDescribe = iteamDescribe;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "ListItem{" +
                "id=" + id +
                ", iteamName='" + iteamName + '\'' +
                ", iteamDescribe='" + iteamDescribe + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    public void inputInfor(int i){
        this.id = autoID;
        autoID++;
        System.out.println("Moi nhap ten sp thứ "+(i+1)+":");
        this.iteamName = new Scanner(System.in).nextLine();
        System.out.println("Moi nhap mo ta sp:");
        this.iteamDescribe = new Scanner(System.in).nextLine();
        System.out.println("Moi nhap so luong sp:");
        this.amount = new Scanner(System.in).nextInt();
        System.out.println("Moi nhap gia ban:");
        this.price = new Scanner(System.in).nextInt();
    }

}
