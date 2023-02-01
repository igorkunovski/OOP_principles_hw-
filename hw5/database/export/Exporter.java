package database.export;

import phonebook.PhoneBook;

public interface Exporter {
    void save(PhoneBook pb);
}
