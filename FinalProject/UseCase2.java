package FinalProject;

/**
 * Creates an object of ContactList and three objects of Contact. After each
 * Contact is created, the ContactList is printed, sorted alphabetically by
 * last name. If two Contacts have the same last name, they Contacts are 
 * then sorted by first name.
 * 
 * @author Erin Liao (test hello)
 */

public class UseCase2 {
	public static void main(String[] args) {
		ContactList allContacts = new ContactList();

		Contact contact1 = new Contact();
		contact1.setLastName("Smith");
		contact1.setFirstName("John");
		contact1.setStreetAddress("235 Fake Rd., Palo Alto");
		contact1.setEmailAddress("johnsmith@gmail.com");
		contact1.setPhoneNumber("6508889999");
		contact1.setNotes("Some fake notes.");
		allContacts.addContact(contact1);
		System.out.println(contact1);
		// System.out.println(allContacts + "\n");

		Contact contact2 = new Contact();
		contact2.setLastName("Taylor");
		contact2.setFirstName("Anna");
		contact2.setStreetAddress("");
		contact2.setEmailAddress("");
		contact2.setPhoneNumber("");
		contact2.setNotes("");
		allContacts.addContact(contact2);
		System.out.println(contact2);
		// System.out.println(allContacts + "\n");

		Contact contact3 = new Contact();
		contact3.setLastName("Smith");
		contact3.setFirstName("Sophia");
		contact3.setStreetAddress("");
		contact3.setEmailAddress("");
		contact3.setPhoneNumber("");
		contact3.setNotes("");
		allContacts.addContact(contact3);
		System.out.println(contact3);
		// System.out.println(allContacts + "\n");
		
		allContacts.sortContacts();
		System.out.println("After sort: \n");
		System.out.println(allContacts);
	}
}

/*

Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 6508889999
Notes: Some fake notes.

Last name: Taylor
First name: Anna
Street address: 
Email: 
Phone: 
Notes: 

Last name: Smith
First name: Sophia
Street address: 
Email: 
Phone: 
Notes: 

After sort: 

[Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 6508889999
Notes: Some fake notes.
, Last name: Smith
First name: Sophia
Street address: 
Email: 
Phone: 
Notes: 
, Last name: Taylor
First name: Anna
Street address: 
Email: 
Phone: 
Notes: 
]

*/