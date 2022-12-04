package coffeshop.entity;

public class Menu {
    private static int autoID=1;
    private String foodName;
    private int id;
    private String foodType;
    private int foodPrice;
    private int amount;


    public Menu(String foodName, String foodType,int foodPrice) {
        this.foodName = foodName;
        this.id = autoID;
        autoID++;
        this.foodType = foodType;
        this.foodPrice = foodPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "foodName='" + foodName + '\'' +
                ", id=" + id +
                ", foodType='" + foodType + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}
