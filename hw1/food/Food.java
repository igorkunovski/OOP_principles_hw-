package food;

import product.Product;

public class Food extends Product {
    private String expDate;

    public Food(String name, double price, int qty, String unit, String expDate) {
        super(name, price, qty, unit);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Expire date: " + this.getExpDate();
    }
}
