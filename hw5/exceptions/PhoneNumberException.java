package exceptions;


public class PhoneNumberException extends Exception {
    private static final String message = "Phone number was not added";

    static {
        System.err.println(message);
    }
}
