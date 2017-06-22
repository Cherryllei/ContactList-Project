package FinalProject;

import java.io.Serializable;
/**
 * One object of class Contact stores the first and last name, street address,
 * email address, phone number, and any notes for one contact.
 * 
 * @author Chunlei Li
 */

public class Contact implements Comparable<Contact>, Serializable {
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	/**
	 * Sets the value of firstName to "newFirstName"
	 * 
	 * @author CL
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Gets the value of firstName
	 * 
	 * @author JD
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of lastName to "newLastName"
	 * 
	 * @author CL
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	/**
	 * Gets the value of lastName
	 * 
	 * @author JD
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of streetAddress to "newStreetAddress"
	 * 
	 * @author CL
	 */
	public void setStreetAddress(String newStreetAddress) {
		streetAddress = newStreetAddress;
	}

	/**
	 * Sets the value of emailAddress to "newEmailAddress"
	 * 
	 * @author CL
	 */
	public void setEmailAddress(String newEmailAddress) {
		emailAddress = newEmailAddress;
	}

	/**
	 * Sets the value of phoneNumber to "newPhoneNumber"
	 * 
	 * @author CL
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}

	/**
	 * Sets the value notes to "newNotes"
	 * 
	 * @author CL
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}

	/**
	 * Returns a string containing the last name, first name, street address,
	 * email, phone number and notes of the Contact.
	 * 
	 * @author JD
	 */
	public String toString() {
		String returnString;
		returnString = "Last name: " + lastName + "\n";
		returnString += "First name: " + firstName + "\n";
		returnString += "Street address: " + streetAddress + "\n";
		returnString += "Email: " + emailAddress + "\n";
		returnString += "Phone: " + phoneNumber + "\n";
		returnString += "Notes: " + notes + "\n";
		return returnString;
	}
	
	/**
	 * Compares one Contact to another Contact object (passed as parameter)
	 * using lastName. Returns a negative int if the Contact object's lastName
	 * is less than the parameter Contact's lastName, a positive int if the
	 * Contact object's lastName is greater than the parameter Contact's lastName,
	 * and a zero if the lastNames are the same.
	 * 
	 * @author EL
	 */
	public int compareTo(Contact c) {
		String newLastName = c.getLastName();
		int compareResult = lastName.compareTo(newLastName);
		if (compareResult == 0) {
			String newFirstName = c.getFirstName();
			compareResult = firstName.compareTo(newFirstName);
		}
		return compareResult; 
	}
}
