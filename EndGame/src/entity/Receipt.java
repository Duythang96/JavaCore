package entity;

import java.util.ArrayList;

public class Receipt {
    private static int autoID=1;
    private int id;
    private int year;
    private int month;
    private String staffName;
    private ArrayList<Menu> foodList;
    private int amount;

    public Receipt(int year, int month, String staffName, ArrayList<Menu> foodList, int amount) {
        this.id=autoID;
        autoID++;
        this.year = year;
        this.month = month;
        this.staffName = staffName;
        this.foodList = foodList;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public ArrayList<Menu> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Menu> foodList) {
        this.foodList = foodList;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", staffName='" + staffName + '\'' +
                ", foodList=" + foodList +
                ", amount=" + amount +
                '}';
    }
}
