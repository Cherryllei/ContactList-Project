package FinalProject;

import java.util.Scanner;

/**
 * Creates an object of ContactList and an object of Contact, and calls all
 * methods on them.
 * 
 * @author Chunlei Li
 */
public class TestContactList {
	public static void main(String[] args) {
		ContactList allContacts = new ContactList();
		allContacts.loadContactList();

		while (true) {
			System.out.println(
					"Welcome to The Contact List's main menu. What would you like to do? ");
			System.out.println("[1]Add contact" + "\n" + "[2]View all contacts"
					+ "\n" + "[3]Search contacts by last name" + "\n"
					+ "[4]Quit");
			Scanner console = new Scanner(System.in);
			int optionNumber = console.nextInt();
			if (optionNumber == 1) {
				Contact contact1 = new Contact();
				contact1.read();
				allContacts.addContact(contact1);
				System.out.println("Contact saved!" + "\n1");
				allContacts.saveContactList();
			} else if (optionNumber == 2) {
				System.out.println(allContacts);
			} else if (optionNumber == 3) {
				System.out.println("Please enter the people's last name: ");
				allContacts.searchContacts(console.next());
			} else {
				System.exit(0);
			}
		}

	}
}
