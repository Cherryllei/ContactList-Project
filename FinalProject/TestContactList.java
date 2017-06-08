package FinalProject;

import FinalProject.Contact;
import FinalProject.ContactList;

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

		Contact contact1 = new Contact();
		contact1.setLastName("Smith");
		contact1.setFirstName("John");
		contact1.setStreetAddress("235 Fake Rd., Palo Alto");
		contact1.setEmailAddress("johnsmith@gmail.com");
		contact1.setPhoneNumber("1234567890");
		contact1.setNotes("Fake notes.");
		System.out.println(contact1);
		allContacts.addContact(contact1);

		Contact contact2 = new Contact();
		contact2.setLastName("Taylor");
		contact2.setFirstName("Anna");
		contact2.setStreetAddress("");
		contact2.setEmailAddress("");
		contact2.setPhoneNumber("");
		contact2.setNotes("");
		System.out.println(contact2);
		allContacts.addContact(contact2);

		System.out.println("Search last name Smith:" + allContacts.searchContacts("Smith"));
		System.out.println("Search last name Taylor:" + allContacts.searchContacts("Taylor") + "\n");
		System.out.println(allContacts);
		allContacts.saveContactList();
		System.exit(0);
	}
}

/*
 Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 1234567890
Notes: Fake notes.

Last name: Taylor
First name: Anna
Street address: 
Email: 
Phone: 
Notes: 

Search last name Smith:[]
Search last name Taylor:[]

[Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 1234567890
Notes: Fake notes.
, Last name: Taylor
First name: Anna
Street address: 
Email: 
Phone: 
Notes: 
]

 */