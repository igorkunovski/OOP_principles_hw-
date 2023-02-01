package database.download;

import phonebook.PhoneBook;

public interface Importer {
    public PhoneBook load();
}
