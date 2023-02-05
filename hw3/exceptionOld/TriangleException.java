package exceptionOld;

public class TriangleException extends FigureCreationException{
    private static final String message = "Incorrect side lengths for building Triangle";

    static {
        System.err.println(message);
    }
}
