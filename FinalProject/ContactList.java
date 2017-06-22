package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * One object of class ContactList represents a whole list of Contacts
 * 
 * @author Chunlei Li
 */

public class ContactList {
	private List<Contact> contacts = new ArrayList<Contact>();

	/**
	 * Load contact list from disk. If there's no contact list file, create a
	 * new one
	 * 
	 * @author CL
	 */
	public void loadContactList() {
		FileInputStream inFile;
		ObjectInputStream inObject;
		try {
			inFile = new FileInputStream("data");
			inObject = new ObjectInputStream(inFile);
			contacts = (List<Contact>) inObject.readObject();
			inFile.close();
			inObject.close();
		} catch (FileNotFoundException fnfe) {
			saveContactList();
		} catch (IOException ioe) {
			System.out.println(
					"Error reading from the file: " + ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to Contact: " + cnfe);
		}
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
	public String searchContacts(String lastName) {
		String searchResults = "";
		for (Contact contact : contacts) {
			String compareContact = contact.getLastName();
			if (compareContact.equalsIgnoreCase(lastName)) {
				searchResults += contact + "\n";
			}
		}
		return searchResults;
	}

	/**
	 * Creates a new ArrayList of Contacts. Sorts Contact objects by using the
	 * compareTo() defined within the Contact class.
	 * 
	 * @author EL
	 */
	public void sortContacts() {
		List<Contact> orderedContactList = new ArrayList<Contact>();
		for (int i = 0; i < contacts.size(); i++)
			orderedContactList.add(contacts.get(i));
		Collections.sort(contacts);
	}

	/**
	 * Save contact list to disk
	 * 
	 * @author CL
	 */
	public void saveContactList() {
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream("data");
			outObject = new ObjectOutputStream(outFile);
			outObject.writeObject(contacts);
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println(
					"Error writing objects to the file: " + ioe.getMessage());
		}
	}

	/**
	 * Returns a string with all the contacts from the contact list
	 * 
	 * @author JD
	 */
	public String toString() {
		sortContacts();
		String contactList = "";
		for (Contact contact : contacts) {
			contactList += contact.toString() + "\n";
		}
		return contactList;
	}
}
