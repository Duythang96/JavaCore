package coffeshop.entity;

import java.util.ArrayList;

public class Receipt {
    private static int autoID=1;
    private int id;
    private int year;
    private int month;
    private String staffName;
    private ArrayList<Order> foodList;

    public Receipt(int year, int month, String staffName, ArrayList<Order> foodList) {
        this.id=autoID;
        autoID++;
        this.year = year;
        this.month = month;
        this.staffName = staffName;
        this.foodList = foodList;
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

    public ArrayList<Order> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Order> foodList) {
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
                '}';
    }
}
