import console.Console;
import database.download.ImportContactsCSV;
import phonebook.PhoneBook;

public class Main_hw5 {
    public static void main(String[] args) {

        ImportContactsCSV loader = new ImportContactsCSV();
        PhoneBook pb = loader.load();

        Console v = new Console();
        v.mainMenu(pb);

    }
}
