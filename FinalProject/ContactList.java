package FinalProject;

import java.util.ArrayList;
import java.util.Comparator;
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
	 * Creates a new ArrayList with the search results and orders the list
	 * 
	 * @author CL
	 */
	/* public List<Contact> searchContacts(String lastName) {
		List<Contact> searchResults = new ArrayList<Contact>();
		for (Contact temp : contacts) {
			String compareContact = temp.getLastName();
			if (compareContact.equalsIgnoreCase(lastName)){
				searchResults.add(temp);
		return searchResults;
			}
		} */
	
	/**
	 * Sorts Contact objects by lastName. If the lastNames are the same,
	 * sorts Contact objects by firstName. Uses method compare() within
	 * Interface Comparator to compare two Contact objects at once;
	 * returns either an int less than zero, zero, or an int greater than
	 * zero and uses Collections.sort() to sort the Contact objects in
	 * ascending order. 
	 * 
	 * @author EL
	 */
	public List<Contact> orderedContactList = new ArrayList<Contact>();
	
	public void sortContacts() {
		Collections.sort(contacts, new Comparator<Contact>() {
			public int compare(Contact c1, Contact c2) {
				int result = c1.getLastName().compareToIgnoreCase(c2.getLastName());
				if (result != 0)
					return result;
				return c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
			}
		});
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