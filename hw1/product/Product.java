package product;

public class Product {
    private String name;
    private double price;
    private int qty;
    private String unit;

    public Product(String name, double price, int qty, String unit){
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Price: %.2f, Qty: %d, Unit of measurement: %s",
                this.getName(), this.getPrice(), this.getQty(), this.getUnit());
    }
}
