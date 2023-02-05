package figureOld;

import exceptionOld.NegativeRadiusException;

public class Circle extends Figure implements CircleLength{

    private final double radius;

    public Circle(double radius) {
        if (radius<=0){
            throw new NegativeRadiusException();
        }
        this.radius = radius;
    }

    @Override
    public double getCircleLength() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getSquare() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
