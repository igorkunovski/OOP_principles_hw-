package figure;

import exception.NegativeLengthException;

public abstract class Polygon extends Figure implements Perimeterable{
    protected double[] sides;

    public Polygon( double[] sides){
        for (double side : sides) {
            if (side <= 0) {
                throw new NegativeLengthException();
            }
        }
        this.sides = sides;
    }

    public double getPerimeter() {
        double result = 0;
        for (double side : sides) {
            result += side;
        }
        return result;
    }
}
