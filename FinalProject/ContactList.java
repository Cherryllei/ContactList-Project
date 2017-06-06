package FinalProject;

import java.util.ArrayList;
import java.util.List;

/**
 * One object of class ContactList stores the entire contact list, retrieves a
 * contact via a user-inputted last name, save, and exit the file on disk.
 * 
 * @author Chunlei Li
 */

public class ContactList {
    // Initialize an empty list to store contacts.
    private List<Contact> contacts = new ArrayList<>();

    /**
     * add a user
     */
    public void addContact(Contact user) {
        contacts.add(user);
    }

    /**
     * Print the contact list, sorted by name. If contacts have identical last
     * names, then those contacts are alphabetized by first name
     */
    public void printContactList() {
        return;
    }

    /**
     * Retrieve a person's information by last name If no match name then will
     * print "no result" If more than one match the last name, then show all of
     * the information.
     */
    public Contact getContact(String lastName) {
        return null;
    }

    /**
     * Quit the program and save to disk.
     */
    public void saveToDisk() {
        return;
    }

    /**
     * Start the program and open existing data file on disk. If no contact list
     * data then start new one. A contact list in memory containing any contacts
     * that were entered previously.
     */
    public void openFile() {
        return;
    }
}
