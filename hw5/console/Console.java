package console;


import contact.Contact;
import database.export.ExportContactsCSV;
import database.export.Exporter;
import email.Email;
import exceptions.NameEmptyException;
import phonebook.PhoneBook;
import phonenumber.PhoneNumber;

import java.util.Scanner;

public class Console {

    public void mainMenu(PhoneBook pb) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        while (true) {
            System.out.println("Menu items");
            System.out.println("1. Add new contact to phonebook");
            System.out.println("2. Find contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Edit contact");
            System.out.println("5. Show all contacts");
            System.out.println("0. Quit");
            int cmd = scan.nextInt();
            String searched;
            switch (cmd) {
                case 0 -> {
                    Exporter saver = new ExportContactsCSV();
                    saver.save(pb);
                    scan.close();
                    return;
                }
                case 1 -> pb.create(addContact(scan));

                case 2 -> {
                    searched = getName();
                    pb.search(searched);
                }
                case 3 -> {
                    pb.mapToString(pb.getContacts());
                    searched = getName();
                    if (pb.getContacts().containsKey(searched)) {
                        pb.delete(searched);
                        System.out.println("Successfully deleted");
                    } else {
                        System.out.println("This contact is not found");
                    }
                }
                case 4 -> {
                    searched = getName();
                    if (pb.getContacts().containsKey(searched)) {
                        fieldToBeEdit(searched, pb);
                    }
                }
                case 5 -> {
                    System.out.println("-----Contacts----");
                    pb.mapToString(pb.getContacts());
                    System.out.println("---------");
                }
                default -> System.out.println("Menu is not implemented");
            }
        }
    }

    private void fieldToBeEdit(String name, PhoneBook pb) {
        Contact cont = pb.getContacts().get(name);
        System.out.println("Field to be edited:");
        System.out.println("1. Edit name");
        System.out.println("2. Add new E-mail");
        System.out.println("3. Add new Phone");
        System.out.println("4. Remove email");
        System.out.println("5. Remove phone");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Insert new name");
                String newName = scanner.next();
                pb.create(new Contact(newName, cont.getEmails(), cont.getPhoneNumbers()));
                pb.delete(name);
                System.out.println("Name changed");
            }
            case 2 -> {
                System.out.println("Insert new e-mail");
                String newEmail = scanner.next();
                pb.getContacts().get(name).addNewEmail(new Email(newEmail));
                System.out.println("Email added");
            }
            case 3 -> {
                System.out.println("Insert new Phone number");
                String newPhone = scanner.next();
                pb.getContacts().get(name).addNewPhone(new PhoneNumber(newPhone));
                System.out.println("Phone added");
            }

            case 4 -> {
                System.out.println("Insert email number to be deleted");
                System.out.println(pb.getContacts().get(name).emailsString());
                int emailNum = scanner.nextInt();

                if (emailNum <= pb.getContacts().get(name).getEmails().size()) {
                    Email email = pb.getContacts().get(name).getEmails().get(emailNum - 1);
                    pb.getContacts().get(name).removeEmail(email);
                    System.out.println("Email removed");
                } else {
                    System.out.println("Invalid index");
                }
            }

            case 5 -> {
                System.out.println("Insert phone number to be deleted");
                System.out.println(pb.getContacts().get(name).phonesString());
                int phoneNum = scanner.nextInt();

                if (phoneNum <= pb.getContacts().get(name).getPhoneNumbers().size()) {
                    PhoneNumber pn = pb.getContacts().get(name).getPhoneNumbers().get(phoneNum - 1);
                    pb.getContacts().get(name).removePhone(pn);
                    System.out.println("Phone removed");
                } else {
                    System.out.println("Invalid index");
                }
            }
        }
    }

    private String getName() {
        System.out.println("Insert contact name");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private Contact addContact(Scanner scan) {

        String name = "";

        while (name.equals("")) {
            scan = new Scanner(System.in);
            System.out.print("Enter name: ");
            name = scan.nextLine();
            if (name.equals("")){
                try {
                    throw new NameEmptyException();
                } catch (NameEmptyException e) {
                    System.out.println();
                }
            }
        }

        scan = new Scanner(System.in);
        System.out.print("Enter email: ");
        String emailStr = scan.nextLine();

        scan = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String pnString = scan.nextLine();

        Email email = new Email(emailStr);
        PhoneNumber phoneNumber = new PhoneNumber(pnString);

        if (emailStr.equals("") && pnString.equals("")) {
            return new Contact(name);
        }
        if (emailStr.equals("")) {
            return new Contact(name, phoneNumber);
        }
        if (pnString.equals("")) {
            return new Contact(name, email);
        }
        return new Contact(name, email, phoneNumber);
    }
}



