package FinalProject;

import java.util.List;
import java.util.Scanner;

/**
 * Creates an object of ContactList and three objects of Contact, shows all
 * the contacts and performs searches by last name
 * 
 * @author JD
 */

public class ContactListApp {
	public static void main(String[] args) {
		ContactList allContacts = new ContactList();
		Scanner console = new Scanner(System.in);
		allContacts.loadContactList();
		boolean runProgram = true;
		System.out.print("Welcome to The Contact List’s main menu. ");
		while (runProgram == true) {
			runProgram = displayMenu(console, allContacts);
		}
	}

	/**
	 * Display the menu and call the corresponding method
	 * 
	 * @author JD
	 */
	public static boolean displayMenu(Scanner console, ContactList allContacts) {
		System.out.println("What would you like to do?\n(Choose a number)");
		System.out.print("[1] Add contact\n[2] View all contacts\n[3] Search contacts by last name\n[4] Quit\n> ");
		boolean runProgram = true;
		switch(console.nextLine()) {
			case "1":
				System.out.println("\n[1] Add contact\n");
				addContact(console, allContacts);
				break;
			case "2":
				System.out.println("\n[2] View all contacts\n");
				System.out.print(allContacts);
				break;
			case "3":
				System.out.println("\n[3] Search contacts by last name\n");
				searchContacts(console, allContacts);
				break;
			case "4":
				System.out.println("\nThank you for using The Contact List.");
				allContacts.saveContactList();
				runProgram = false;
				break;
			default:
				System.out.println("\nChoose a valid number.\n");
				break;
		}
		return runProgram;
	}

	/**
	 * Begins to add a contact
	 * 
	 * @author JD
	 */
	public static void addContact(Scanner console, ContactList allContacts) {
		System.out.print("Please type last name (required): \n> ");
		String lastName;
		lastName = console.nextLine();
		if (lastName.trim().length() <= 0) {
			System.out.println("\nLast name is required. \n");
		} else {
			Contact contact = promptUser(console, lastName);
			allContacts.addContact(contact);
			System.out.println("\nContact saved!\n");
		}
	}

	/**
	 * Prompts the user for the information needed to create the contact
	 * 
	 * @author JD
	 */
	public static Contact promptUser(Scanner console, String lastName) {
		Contact contact = new Contact();
		contact.setLastName(lastName);
	
		System.out.print("Type a first name: \n> ");
		contact.setFirstName(console.nextLine());
	
		System.out.print("Type a street address: \n> ");
		contact.setStreetAddress(console.nextLine());
	
		System.out.print("Type an email: \n> ");
		contact.setEmailAddress(console.nextLine());
	
		System.out.print("Type a phone number: \n> ");
		contact.setPhoneNumber(console.nextLine());
	
		System.out.print("If you’d like to add some notes, type them: \n> ");
		contact.setNotes(console.nextLine());
		return contact;
	}
	
	/**
	 * Gets contact list and a String with a last name
	 * Searchs contact list by last name and returns the results
	 * 
	 * @author JD
	 */
	public static void searchContacts(Scanner console, ContactList contactList){
		System.out.print("\nEnter a last name:\n> ");
		String searchResults = contactList.searchContacts(console.nextLine());
		if (searchResults.length() > 0) {
			System.out.println("\n" + searchResults);
		} else {
			System.out.println("\nThere’s no contact with that last name.\n");
		}
	}
}