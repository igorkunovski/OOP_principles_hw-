package exceptions;

public class NameEmptyException extends Exception{
    private static final String message = "Name can not be empty";

    static {
        System.err.println(message);
    }
}
