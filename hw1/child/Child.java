package child;

import product.Product;

public class Child extends Product {
    private int minAge;
    private boolean hypoallergenic;

    public Child(String name, double price, int qty, String unit, int minAge, boolean hypoallergenic) {
        super(name, price, qty, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinAge() {
        return minAge;
    }

    public boolean isHypoallergenic() {
        return hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Minimum age: " + this.getMinAge() + ", Hypoallergenic: " + this.isHypoallergenic();
    }
}
