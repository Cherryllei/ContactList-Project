package FinalProject;

/**
 * One object of class Contact stores the first and last name, street address,
 * email address, phone number, and any notes for each contact.
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
	 * Gets first name of the contact
	 * 
	 * @author CL
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of firstName to "newFirstName"
	 * 
	 * @author CL
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Gets last name of the contact
	 * 
	 * @author CL
	 */
	public String getLastName() {
		return lastName;
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
	 * Gets street address of the contact
	 * 
	 * @author CL
	 */
	public String getStreetAddress() {
		return streetAddress;
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
	 * Gets email address of the contact
	 * 
	 * @author CL
	 */
	public String getEmailAddress() {
		return emailAddress;
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
	 * Gets phone number of the contact
	 * 
	 * @author CL
	 */
	public String getPhoneNumber() {
		return phoneNumber;
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
	 * Gets notes of the contact
	 * 
	 * @author CL
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * Sets the value of notes to "newNotes"
	 * 
	 * @author CL
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}
}
