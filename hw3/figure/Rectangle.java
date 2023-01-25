package figure;


public class Rectangle extends Polygon {

    private  double length;
    private  double width;

    public Rectangle(double length, double width) {
        super(new double[]{length, width, length, width});
        this.length = length;
        this.width = width;

    }

    @Override
    public double getSquare() {
        return this.sides[0] * this.sides[1];
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + length + " " + width +
                '}';
    }
}
