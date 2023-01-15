package food;

public class Bread extends Food {
    private String flour;

    public Bread(String name, double price, int qty, String unit, String expDate, String flour) {
        super(name, price, qty, unit, expDate);
        this.flour = flour;
    }

    public String getFlour() {
        return flour;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sort of flour: " + this.getFlour();
    }
}
