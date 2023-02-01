package email;

import exceptions.EmailException;

public class Email {
    private String email;

    public Email(String email){
        if (isValid(email)) {
            this.email = email;
        }else try {
            throw new EmailException();
        } catch (EmailException e) {
            this.email = "";
        }
    }

    private static boolean isValid(String email) {
        return email.contains("@");
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return this.getEmail();
    }
}
