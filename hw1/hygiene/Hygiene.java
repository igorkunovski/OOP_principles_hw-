package hygiene;

import product.Product;

public class Hygiene extends Product {
    private int pcsPerPkg;

    public Hygiene(String name, double price, int qty, String unit, int pcsPerPkg) {
        super(name, price, qty, unit);
        this.pcsPerPkg = pcsPerPkg;
    }

    public int getPcsPerPkg() {
        return pcsPerPkg;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pcs in package: " + this.getPcsPerPkg();
    }
}
