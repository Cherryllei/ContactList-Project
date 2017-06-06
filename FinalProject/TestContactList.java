package FinalProject;

import FinalProject.Contact;
import FinalProject.ContactList;

/**
 *  This class TestContactList by adding user’s personal information. This class also, adds new contacts, 
 *  prints a complete list of all contacts,  retrieve contacts by last name, save and open the data file from disk.
 * @author Chunlei Li
 */
public class TestContactList {
    public static void main(String[] args) {
        ContactList contact1 = new ContactList();
        Contact test = new Contact();
        test.getFirstName();
        test.getLastName();
        test.getStreetAddress();
        test.getEmailAddress();
        test.getPhoneNumber();
        test.getNotes();
        contact1.addContact(test);
        contact1.printContactList();
        contact1.getContact("Li");
        contact1.saveToDisk();
        contact1.openFile();
    }
}
