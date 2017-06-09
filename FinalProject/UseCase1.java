package FinalProject;

import java.util.Scanner;

/**
 * Creates an object of ContactList and two objects of Contact. After each Contact
 * is created, the ContactList is printed.
 * @author Chunlei Li
 */
public class UseCase1 {
	public static void main(String[] args) {
		ContactList allContacts = new ContactList();
		Scanner console = new Scanner(System.in);

		Contact contact1 = new Contact();
		boolean invalidLastName = true;
		String lastName;
		while (invalidLastName) {
			System.out.print("Please type last name (required): \n" + "> ");
			lastName = console.nextLine();
			if (lastName.trim().length() <= 0) {
				System.out.println("\n" + "Last name is required. ");
			} else {
				contact1.setLastName(lastName);
				invalidLastName = false;
			}
		}
		System.out.print("Please type a first name: \n" + "> ");
		contact1.setFirstName(console.nextLine());

		System.out.print("Please type a street address: \n" + "> ");
		contact1.setStreetAddress(console.nextLine());

		System.out.print("Please type an email: \n" + "> ");
		contact1.setEmailAddress(console.nextLine());

		System.out.print("Please type a phone number: \n" + "> ");
		contact1.setPhoneNumber(console.nextLine());

		System.out.print("If you’d like to add some notes, please type them: \n" + "> ");
		contact1.setNotes(console.nextLine());

		allContacts.addContact(contact1);

		System.out.println("\n" + "Contact saved!" + "\n");
		System.out.println(allContacts + "\n");

		Contact contact2 = new Contact();
		invalidLastName = true;
		lastName = "";
		while (invalidLastName) {
			System.out.print("Please type last name (required): \n" + "> ");
			lastName = console.nextLine();
			if (lastName.trim().length() <= 0) {
				System.out.println("Last name is required. ");
			} else {
				contact2.setLastName(lastName);
				invalidLastName = false;
			}
		}
		System.out.print("Please type a first name: \n" + "> ");
		contact2.setFirstName(console.nextLine());

		System.out.print("Please type a street address: \n" + "> ");
		contact2.setStreetAddress(console.nextLine());

		System.out.print("Please type an email: \n" + "> ");
		contact2.setEmailAddress(console.nextLine());

		System.out.print("Please type a phone number: \n" + "> ");
		contact2.setPhoneNumber(console.nextLine());

		System.out.print("If you’d like to add some notes, please type them: \n" + "> ");
		contact2.setNotes(console.nextLine());

		allContacts.addContact(contact2);

		System.out.println("\n" + "Contact saved!" + "\n");
		System.out.println(allContacts + "\n");

	}
}
/*
Please type last name (required): 
> 

Last name is required. 
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