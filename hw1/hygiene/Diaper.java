package hygiene;

public class Diaper extends Hygiene {
    private String size;
    private float minWeight;
    private float maxWeight;
    private String type;

    public Diaper(String name, double price, int qty, String unit, int pcsPerPkg, String size, float minWeight,
                  float maxWeight, String type) {
        super(name, price, qty, unit, pcsPerPkg);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public float getMinWeight() {
        return minWeight;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + this.getSize()+ ", Minimum weight: " + this.getMinWeight() +
                "kg, Maximum weight: " + this.getMaxWeight() + "kg" + ", Type: " + this.getType();
    }
}
