package FinalProject;

import java.util.ArrayList;
import java.util.List;

/**
 * One object of class ContactList represents a whole list of Contacts
 * 
 * @author Chunlei Li
 */

public class ContactList {
    // Initialize an empty list to store contacts.
    private List<Contact> contacts = new ArrayList<>();

    /**
     * Constructor that loads the contact list from disk
     * 
     * @author CL
     */
    public ContactList() {

    }

    /**
     * Add a new contact to the contact list
     * 
     * @author CL
     */
    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    /**
     * Returns all contacts in the contact list
     * 
     * @author CL
     */
    public Contact getAllContacts() {
        return null;
    }

    /**
     * Returns any contact whose last name matches lastName
     * 
     * @author CL
     */
    public Contact searchContacts(String lastName) {
        return null;
    }

    /**
     * Save to disk
     * 
     * @author CL
     */
    public void saveToDisk() {
        return;
    }
}