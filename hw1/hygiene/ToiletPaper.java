package hygiene;

public class ToiletPaper extends Hygiene {
    private int layers;

    public ToiletPaper(String name, double price, int qty, String unit, int pcsPerPkg, int layers) {
        super(name, price, qty, unit, pcsPerPkg);
        this.layers = layers;
    }

    public int getLayers() {
        return layers;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of layers: " + this.getLayers();
    }
}
