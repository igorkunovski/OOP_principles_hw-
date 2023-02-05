package exceptionOld;

public class NegativeLengthException extends FigureCreationException{

    private static final String message = "Negative length";

    static {
        System.err.println(message);
    }
}
