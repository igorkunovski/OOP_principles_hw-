package config;

import figure.*;

public class Calculation {

    public static void getPerimeter(Figure figure) {
        if (figure instanceof Perimeterable) {
            System.out.printf("%s perimeter: %.2f\n",figure, ((Perimeterable) figure).getPerimeter());
        }
    }

    public static void getSquare(Figure figure) {
        System.out.printf("%s square: %.2f\n", figure, figure.getSquare());
    }

    public static void getCircleLength(Figure figure) {
        if (figure instanceof CircleLength) {
            System.out.printf("%s length: %.2f\n", figure, ((CircleLength) figure).getCircleLength());
        }
    }
}
