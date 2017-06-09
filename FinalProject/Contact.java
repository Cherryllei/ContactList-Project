package FinalProject;

import java.util.Scanner;

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
	 * get info of the user
	 */
	public void read() {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		firstName = console.nextLine();
		System.out.println("Please enter your last name: ");

		boolean invalidLastName = true;
		while (invalidLastName) {
			lastName = console.nextLine();
			if (lastName.trim().length() <= 0) {
				System.out.println(
						"Last name can not be empty, please enter again.");
			} else {
				invalidLastName = false;
			}
		}
		System.out.println("Please enter your street address: ");
		streetAddress = console.nextLine();
		System.out.println("Please enter your email address: ");
		emailAddress = console.nextLine();
		System.out.println("Please enter your phone number: ");
		phoneNumber = console.nextLine();
		System.out.println("Please enter your notes: ");
		notes = console.nextLine();
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
