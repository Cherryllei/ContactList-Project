package FinalProject;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * One object of class ContactList represents a whole list of Contacts
 *  
 * @author Chunlei Li
 */

public class ContactList {
	private List<Contact> contacts = new ArrayList<Contact>();

	/**
	 * Load contact list from disk If there's no contact list file, create a new
	 * one
	 * 
	 * @author CL
	 */
	public void loadContactList() {

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
	 * Creates a new ArrayList of Contacts. Sorts Contact objects 
	 * by using the compareTo() defined within the Contact class.
	 * 
	 * @author EL
	 */
	public void sortContacts() {
		List<Contact> orderedContactList = new ArrayList<Contact>();
		for (int i = 0; i < contacts.size(); i++)
			orderedContactList.add(contacts.get(i));
		Collections.sort(orderedContactList); 
	}
		
	/**
	 * Save contact list to disk
	 * 
	 * @author CL
	 */
	public void saveContactList() {
		return;
	}
	
	/**
	 * Returns a string with all the contacts from the contact list
	 * 
	 * @author JD
	 */
	public String toString() {
		return contacts.toString();
	}
}