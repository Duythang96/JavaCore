package Entity;

public class SalestaffDetail {
    private Item items;
    private int quantity;

    public SalestaffDetail(Item items, int quantity) {
        this.items = items;
        this.quantity = quantity;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SaleDetailManagerment{" +
                "items=" + items +
                ", quantity=" + quantity +
                '}';
    }
}
