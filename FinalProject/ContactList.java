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
 * One object of class ContactList represents a whole list of Contacts.
 * 
 * @author Chunlei Li
 */

public class ContactList {
	private List<Contact> contacts = new ArrayList<Contact>();

	/**
	 * Load ContactList from disk. If there's no contact list file, create a new
	 * Contact.
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
			System.out.println("Error reading from the file: " + ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to Contact: " + cnfe);
		}
	}

	/**
	 * Add a new Contact to the ContactList.
	 * 
	 * @author CL
	 */
	public void addContact(Contact newContact) {
		contacts.add(newContact);
	}

	/**
	 * Creates a new ArrayList with the search results and alphabetizes the list
	 * by lastName (and firstName, if necessary).
	 * 
	 * @author CL
	 */
	public String searchContacts(String lastName) {
		Collections.sort(contacts);
		String resultString = "";
		for (Contact contact : contacts) {
			String compareContact = contact.getLastName();
			if (compareContact.equalsIgnoreCase(lastName)) {
				resultString += contact + "\n";
			}
		}
		if (resultString.length() == 0) {
			resultString = "There’s no contact with that last name.\n\n";
		}
		return resultString;
	}

	/**
	 * Saves ContactList to disk.
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
			System.out.println("Error writing objects to the file: " + ioe.getMessage());
		}
	}

	/**
	 * Returns a string with all the Contacts, alphabetized by
	 * lastName (and firstName, if necessary), from the ContactList.
	 * 
	 * @author JD
	 */
	public String toString() {
		String returnString = "";
		if (contacts.size() > 0) {
			Collections.sort(contacts);
			for (Contact contact : contacts) {
				returnString += contact.toString() + "\n";
			}
		} else {
			returnString = "There are no contacts in the contact list\n\n";
		}
		return returnString;
	}
}
