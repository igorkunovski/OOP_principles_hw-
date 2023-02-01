package exceptions;


public class EmailException extends Exception {

    private static final String message = "E-mail was not added";

    static {
        System.err.println(message);
    }
}
