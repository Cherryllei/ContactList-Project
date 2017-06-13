package FinalProject;

import java.util.Scanner;

/**
 * Creates an object of ContactList and two objects of Contact. After each
 * Contact is created, the ContactList is printed.
 * 
 * @author Chunlei Li
 */
public class UseCase1 {
	public static void main(String[] args) {
		ContactList allContacts = new ContactList();
		Scanner console = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			Contact contact = new Contact();
			String lastName;
			System.out.print("Please type last name (required): \n" + "> ");
			lastName = console.nextLine();
			if (lastName.trim().length() <= 0) {
				System.out.println("\n" + "Last name is required. \n");
			} else {
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

				allContacts.addContact(contact);

				System.out.println("\n" + "Contact saved!" + "\n");
				System.out.println(allContacts + "\n");
			}
		}
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