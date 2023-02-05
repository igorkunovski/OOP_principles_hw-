package exception;

public class NegativeRadiusException extends FigureCreationException{
    private static final String message = "Negative radius";

    static {
        System.err.println(message);
    }
}
