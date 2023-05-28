package work.collection.gouwuche;

public class CartItem {
    private String id;      // 商品编号
    private String name;    // 商品名称
    private double price;   // 商品单价
    private int quantity;   // 购买数量

    public CartItem(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%.2f元/%d个\t%.2f元", id, name, price, quantity, getTotalPrice());
    }
}