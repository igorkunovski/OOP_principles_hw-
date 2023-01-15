package drink;

import product.Product;

public class Drink extends Product {
    private float vol;

    public Drink(String name, double price, int qty, String unit, float vol) {
        super(name, price, qty, unit);
        this.vol = vol;
    }

    public float getVol() {
        return vol;
    }

    @Override
    public String toString() {
        return super.toString() + ", Volume: " + this.getVol() + " ltr";
    }
}
