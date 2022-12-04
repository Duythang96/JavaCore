package coffeshop.constants;

public enum Constant {
    M ("Male"),
    F ("FeMale"),
    C("Cashier"),
    Mg("Manager"),
    T4("Bàn 4"),
    T6("Bàn 6"),
    T8("Bàn 8"),
    A("Available"),
     R("Reserved"),
    TM("Dessert"),
    MC("Main Dish"),
    DR("Drink");
    public String value;
    Constant(String value){
        this.value=value;
    }
}
