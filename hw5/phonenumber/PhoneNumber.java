package phonenumber;

import exceptions.PhoneNumberException;

import static java.lang.Character.isDigit;

public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {

        phoneNumber = phoneNumber.trim().replace(" ","");
        if (isValid(phoneNumber)) {
            setPhoneNumber(phoneNumber);
        }else {
            try {
                throw new PhoneNumberException();
            } catch (PhoneNumberException e) {
                this.phoneNumber = "";
            }
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private static boolean isValid(String phoneNumber){

        try {
            if (phoneNumber.equals("")) {
                return false;
            }

            if (phoneNumber.charAt(0) == '+') {

                Integer.parseInt(phoneNumber.substring(1));
                return true;

            } else if (isDigit(phoneNumber.charAt(0))) {
                Integer.parseInt(phoneNumber);
                return true;
            } else {
                return false;
            }
        }catch (NumberFormatException e){
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getPhoneNumber();
    }
}