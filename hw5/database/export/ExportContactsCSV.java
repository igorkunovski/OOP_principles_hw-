package database.export;

import contact.Contact;
import phonebook.PhoneBook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static database.Config.pathCSV;

public class ExportContactsCSV implements Exporter {

    @Override
    public void save(PhoneBook pb) {
        File file = new File(pathCSV);
        try {
            FileWriter fw = new FileWriter(file);
            for (Contact contact : pb.getContacts().values()) {
                fw.write(String.format("%s;%s;%s\n", contact.getName(), contact.getEmails(), contact.getPhoneNumbers()));
            }
            System.out.println("--Phonebook saved--");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
