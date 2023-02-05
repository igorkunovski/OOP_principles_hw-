package figure;

public class Square extends Rectangle{
    private final double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side= " + side +
                '}';
    }
}
