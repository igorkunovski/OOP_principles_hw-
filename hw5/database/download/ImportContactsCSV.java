package database.download;

import contact.Contact;
import email.Email;
import phonebook.PhoneBook;
import phonenumber.PhoneNumber;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static database.Config.pathCSV;

public class ImportContactsCSV implements Importer {

    @Override
    public PhoneBook load() {

        PhoneBook pb = new PhoneBook();
        try {
            FileReader file = new FileReader(pathCSV);
            BufferedReader reader = new BufferedReader(file);

            String line;
            while ((line = reader.readLine()) !=null) {
                Contact contact = getContact(line);
                pb.create(contact);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--PhoneBook downloaded--");
        return pb;
    }

    private Contact getContact(String line){
        Contact contact;
        List<Email> emails = new ArrayList<>();
        List<PhoneNumber> phones = new ArrayList<>();

        String name = line.split(";")[0];
        String emailsSTR = line.split(";")[1].replace("[","").replace("]","");
        String phonesSTR = line.split(";")[2].replace("[","").replace("]","");

        String [] emailsArr = emailsSTR.split(",");
        for (String email : emailsArr) {
            if (!email.equals("")) {
                emails.add(new Email(email));
            }
        }

        String [] phonesArr = phonesSTR.split(",");
        for (String phone : phonesArr) {
            if (!phone.equals("")) {
                phones.add(new PhoneNumber(phone));
            }
        }
        contact = new Contact(name, emails, phones);
        return contact;
    }
}
