package figureOld;

import exceptionOld.TriangleException;

import java.util.Arrays;

public class Triangle extends Polygon {
    public Triangle(double side1, double side2, double side3) {
        super(new double[]{side1, side2, side3});
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new TriangleException();
        }
    }

    @Override
    public double getSquare() {
        double perimeter = this.getPerimeter() / 2;
        double side1 = this.sides[0];
        double side2 = this.sides[1];
        double side3 = this.sides[2];
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }
}
