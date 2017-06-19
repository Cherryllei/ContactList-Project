package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;

/**
 * One object of class ContactList represents a whole list of Contacts
 * 
 * @author Chunlei Li
 */

public class ContactList {
	// Initialize an empty list to store contacts.
	private List<Contact> contacts = new ArrayList<Contact>();

	/**
	 * Load contact list from disk If there's no contact list file, create a new
	 * one
	 * 
	 * @author Chunlei
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
		} catch (IOException ioe) {
			System.out.println(
					"Error reading from the file: " + ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to Rectangle: " + cnfe);
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
	 * Returns any contact whose last name matches lastName
	 * 
	 * @author CL
	 */
	public List<Contact> searchContacts(String lastName) {
		return Collections.emptyList();
	}

	/**
	 * Save contact list to disk
	 * 
	 * @author Chunlei
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
		return contacts.toString();
	}
}
