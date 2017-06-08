package FinalProject;

/**
 * One object of class Contact stores the first and last name, street address,
 * email address, phone number, and any notes for one contact.
 * 
 * @author Chunlei Li
 */

public class Contact {
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
	 * Sets the value of lastName to "newLastName"
	 * 
	 * @author CL
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
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
}
