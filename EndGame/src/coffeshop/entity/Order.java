package coffeshop.entity;

import java.util.ArrayList;

public class Order {
    private int amount;
    private ArrayList<Menu> Menulist;

    public Order(int amount, ArrayList<Menu> menulist) {
        this.amount = amount;
        Menulist = menulist;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ArrayList<Menu> getMenulist() {
        return Menulist;
    }

    public void setMenulist(ArrayList<Menu> menulist) {
        Menulist = menulist;
    }

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", Menulist=" + Menulist +
                '}';
    }
}
