package drink;

public class Milk extends Drink {
    private float fat;
    private String expDate;

    public Milk(String name, double price, int qty, String unit, float vol, float fat, String expDate) {
        super(name, price, qty, unit, vol);
        this.fat = fat;
        this.expDate = expDate;
    }

    public float getFat() {
        return fat;
    }

    public String getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fat: " + this.getFat() + "%, Expiry date: " + this.getExpDate();
    }
}
