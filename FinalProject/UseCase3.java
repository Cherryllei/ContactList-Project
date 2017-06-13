package FinalProject;

import java.util.List;

/**
 * Creates an object of ContactList and three objects of Contact, shows all
 * the contacts and performs searches by last name
 * 
 * @author JD
 */

public class UseCase3 {
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
		System.out.println(allContacts + "\n");

		Contact contact2 = new Contact();
		contact2.setLastName("Taylor");
		contact2.setFirstName("Anna");
		contact2.setStreetAddress("");
		contact2.setEmailAddress("");
		contact2.setPhoneNumber("");
		contact2.setNotes("");
		System.out.println(contact2);
		allContacts.addContact(contact2);
		System.out.println(allContacts + "\n");

		Contact contact3 = new Contact();
		contact3.setLastName("Smith");
		contact3.setFirstName("Sophia");
		contact3.setStreetAddress("");
		contact3.setEmailAddress("");
		contact3.setPhoneNumber("");
		contact3.setNotes("");
		System.out.println(contact3);
		allContacts.addContact(contact3);
		System.out.println(allContacts + "\n");
		
		System.out.print("Search last name Smith: \n");
		List<Contact> search1 = allContacts.searchContacts("Smith");
		if (search1.size() > 0) {
			System.out.println(search1 + "\n");
		} else {
			System.out.println("There’s no contact with that last name.\n");
		}
		
		System.out.print("Search last name smith: \n");
		List<Contact> search2 = allContacts.searchContacts("smith");
		if (search2.size() > 0) {
			System.out.println(search2 + "\n");
		} else {
			System.out.println("There’s no contact with that last name.\n");
		}
		
		System.out.print("Search last name ssmith: \n");
		List<Contact> search3 = allContacts.searchContacts("ssmith");
		if (search3.size() > 0) {
			System.out.println(search3 + "\n");
		} else {
			System.out.println("There’s no contact with that last name.\n");
		}
		
		System.out.print("Search last name Taylor: \n");
		List<Contact> search4 = allContacts.searchContacts("Taylor");
		if (search4.size() > 0) {
			System.out.println(search4 + "\n");
		} else {
			System.out.println("There’s no contact with that last name.\n");
		}
		
		System.out.print("Search last name TaYlOr: \n");
		List<Contact> search5 = allContacts.searchContacts("TaYlOr");
		if (search5.size() > 0) {
			System.out.println(search5 + "\n");
		} else {
			System.out.println("There’s no contact with that last name.\n");
		}
	}
}

/*
Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 1234567890
Notes: Fake notes.

[Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 1234567890
Notes: Fake notes.
]

Last name: Taylor
First name: Anna
Street address: 
Email: 
Phone: 
Notes: 

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

Last name: Smith
First name: Sophia
Street address: 
Email: 
Phone: 
Notes: 

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
, Last name: Smith
First name: Sophia
Street address: 
Email: 
Phone: 
Notes: 
]

Search last name Smith: 
[Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 1234567890
Notes: Fake notes.
, Last name: Smith
First name: Sophia
Street address: 
Email: 
Phone: 
Notes: 
]

Search last name smith: 
[Last name: Smith
First name: John
Street address: 235 Fake Rd., Palo Alto
Email: johnsmith@gmail.com
Phone: 1234567890
Notes: Fake notes.
, Last name: Smith
First name: Sophia
Street address: 
Email: 
Phone: 
Notes: 
]

Search last name ssmith: 
There’s no contact with that last name.

Search last name Taylor: 
[Last name: Taylor
First name: Anna
Street address: 
Email: 
Phone: 
Notes: 
]

Search last name TaYlOr: 
[Last name: Taylor
First name: Anna
Street address: 
Email: 
Phone: 
Notes: 
]
*/