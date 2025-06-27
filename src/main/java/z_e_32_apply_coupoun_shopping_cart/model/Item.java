package z_e_32_apply_coupoun_shopping_cart.model;

public class Item {

    private String name;
    private Double price;
    private ItemType type;

    public Item(String name, Double price, ItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

    public Item clone() {
        return new Item(name, price, type);
    }
}
