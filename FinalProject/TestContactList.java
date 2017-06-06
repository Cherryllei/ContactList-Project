package FinalProject;

import FinalProject.Contact;
import FinalProject.ContactList;

/**
 * Creates an object of ContactList and an object of Contact, and 
 * calls all methods on them.
 * 
 * @author Chunlei Li
 */
public class TestContactList {
    public static void main(String[] args) {
        ContactList allContacts = new ContactList();
        Contact contact1 = new Contact();
        
        contact1.setLastName("Smith");
        contact1.setFirstName("John");
        contact1.setStreetAddress("235 Fake Rd., Palo Alto");
        contact1.setEmailAddress("johnsmith@gmail.com");
        contact1.setPhoneNumber("1234567890");
        contact1.setNotes("Fake notes.");
        System.out.println(contact1);
        
        allContacts.addContact(contact1);
        allContacts.getAllContacts();
        allContacts.searchContacts("Smith");
        allContacts.saveToDisk();
        System.exit(0);
    }
}

/*
Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 1234567890
Notes: Fake notes.
*/