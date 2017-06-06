package FinalProject;

/**
 * One object of class Contact stores the first and last name, street address,
 * email address, phone number, and any memos for each contact.
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
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets firstName to "firstname" of the contact
     */
    public void setFirstName(String firstname) {
        firstName = firstname;
    }

    /**
     * Gets last name of the contact
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets lastName to "lastname" of the contact
     */
    public void setLastName(String lastname) {
        lastName = lastname;
    }

    /**
     * Gets street address of the contact
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets streetAddress to "streetaddress" of the contact
     */
    public void setStreetAddress(String streetaddress) {
        streetAddress = streetaddress;
    }

    /**
     * Gets email address of the contact
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets emailAddress to "emailaddress" of the contact
     */
    public void setEmailAddress(String emailaddress) {
        emailAddress = emailaddress;
    }

    /**
     * Gets phone number of the contact
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber to "phonenumber" of the contact
     */
    public void setPhoneNumber(String phonenumber) {
        phoneNumber = phonenumber;
    }

    /**
     * Gets notes of the contact
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets notes to "Notes" of the contact
     */
    public void setNotes(String Notes) {
        notes = Notes;
    }
}
