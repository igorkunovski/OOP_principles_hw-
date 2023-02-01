package contact;

import email.Email;
import phonenumber.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private final String name;
    private List<Email> emails;
    private List<PhoneNumber> phoneNumbers;


    public Contact(String name) {
        this.name = name;
        this.emails = new ArrayList<>();
        this.phoneNumbers = new ArrayList<>();
    }
    public Contact(String name, List<Email> emails, List<PhoneNumber> phoneNumbers) {
        this(name);
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
    }

    public Contact(String name, PhoneNumber phoneNumber) {
        this(name);
        phoneNumbers.add(phoneNumber);
    }

    public Contact(String name, Email email) {
        this(name);
        emails.add(email);
    }

    public Contact(String name, Email email, PhoneNumber phoneNumber) {

        this(name, email);
        phoneNumbers.add(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addNewEmail(Email email){
        if (!email.toString().equals("")) {
            emails.add(email);
        }
    }

    public void addNewPhone(PhoneNumber phoneNumber) {
        if (!phoneNumber.toString().equals("")) {
            phoneNumbers.add(phoneNumber);
        }
    }

    public void removeEmail(Email email){
        emails.remove(email);
    }

    public void removePhone(PhoneNumber phoneNumber) {
        phoneNumbers.remove(phoneNumber);
    }
    public String emailsString() {
        if (!emails.isEmpty()) {
            StringBuilder result = new StringBuilder();
            int counter = 1;
            for (Email email : emails) {
                result.append(String.format("e-mail %d: %s; ", counter, email));
                counter++;
            }
            return result.toString();
        }
        else {
            return ("E-mails:[]");
        }
    }

    public String phonesString() {
        if (!phoneNumbers.isEmpty()) {
            StringBuilder result = new StringBuilder();
            int counter = 1;
            for (PhoneNumber phone : phoneNumbers) {
                result.append(String.format("phone %d: %s; ", counter, phone));
                counter++;
            }
            return result.toString();
        }
        else {
            return ("Phones:[]");
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Emails:[%s] | Phones:[%s]\n", this.getName(),emailsString(), phonesString());
    }
}
