package FinalProject;

import java.util.Scanner;

/**
 * Creates an object of ContactList. Loops three times to test empty last name and the
 * creation of two Contacts. After each Contact is created, the ContactList is printed
 * 
 * @author JD
 */
public class UseCase1 {
	public static void main(String[] args) {
		ContactList allContacts = new ContactList();
		Scanner console = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("Please type last name (required): \n" + "> ");
			String lastName;
			lastName = console.nextLine();
			if (lastName.trim().length() <= 0) {
				System.out.println("\n" + "Last name is required. \n");
				System.out.println(allContacts + "\n");
			} else {
				Contact contact = promptUser(console, lastName);
				allContacts.addContact(contact);

				System.out.println("\n" + "Contact saved!" + "\n");
				System.out.println(allContacts + "\n");
			}
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
	
		System.out.print("Please type a first name: \n" + "> ");
		contact.setFirstName(console.nextLine());
	
		System.out.print("Please type a street address: \n" + "> ");
		contact.setStreetAddress(console.nextLine());
	
		System.out.print("Please type an email: \n" + "> ");
		contact.setEmailAddress(console.nextLine());
	
		System.out.print("Please type a phone number: \n" + "> ");
		contact.setPhoneNumber(console.nextLine());
	
		System.out.print("If you’d like to add some notes, please type them: \n" + "> ");
		contact.setNotes(console.nextLine());
		return contact;
	}
}

/*
Please type last name (required): 
> 

Last name is required. 

[]

Please type last name (required): 
> Smith
Please type a first name: 
> John
Please type a street address: 
> 235 Fake Rd., Palo Alto
Please type an email: 
> johnsmith@gmail.com
Please type a phone number: 
> 6508889999
If you’d like to add some notes, please type them: 
> Some fake notes

Contact saved!

[Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 6508889999
Notes: Some fake notes
]

Please type last name (required): 
> Taylor
Please type a first name: 
> Anna
Please type a street address: 
> 
Please type an email: 
> 
Please type a phone number: 
> 
If you’d like to add some notes, please type them: 
> 

Contact saved!

[Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 6508889999
Notes: Some fake notes
, Last name: Taylor
First name: Anna
Street address: 
Email: 
Phone: 
Notes: 
]

*/