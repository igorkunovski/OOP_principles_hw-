package phonebook;

import contact.Contact;

import java.util.*;

public class PhoneBook  {
    private Map<String,Contact> contacts;

    public PhoneBook() {
        this.contacts = new TreeMap<>();
    }

    public Map<String,Contact> getContacts() {
        return this.contacts;
    }

    public void mapToString(Map<String,Contact> map){
        Collection<Contact> contacts = map.values();
        for (Contact contact: contacts){
            System.out.printf("%s ",contact.toString());
        }
    }

    private void setContact(Contact contact) {
        contacts.put(contact.getName(), contact);
    }

    public void create(Contact contact) {
        this.setContact(contact);
    }

    public void delete(String name) {
        this.contacts.remove(name);
    }

    public void search(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(contacts.get(name).toString());
        } else {
            System.out.println("No contacts found");
        }
    }
}
