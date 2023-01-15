package food;

public class Egg extends Food {
    private int pcsPerPkg;

    public Egg(String name, double price, int qty, String unit, String expDate, int pcsPerPkg) {
        super(name, price, qty, unit, expDate);
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
