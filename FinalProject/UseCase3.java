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
		
		addContact(allContacts, "Smith|John|235 Fake Rd., Palo Alto|johnsmith@gmail.com|6508889999|Some fake notes");
		System.out.println(allContacts + "\n");
		
		addContact(allContacts, "Taylor|Anna| | | | ");
		System.out.println(allContacts + "\n");
		
		addContact(allContacts, "Smith|Sophia| | | | ");
		System.out.println(allContacts + "\n");

		searchContacts(allContacts, "Smith");
		searchContacts(allContacts, "smith");
		searchContacts(allContacts, "ssmith");
		searchContacts(allContacts, "Taylor");
		searchContacts(allContacts, "TaYlOr");
	}
	
	/**
	 * Gets a contact list and a String with contact information
	 * Splits the string to get the information for the contact
	 * Adds the contact to the contact list
	 * 
	 * @author JD
	 */
	
	public static void addContact(ContactList contactList, String contactInformation){
		Contact contact = new Contact();
		String[] contactInformationArray = contactInformation.split("\\|");
		contact.setLastName(contactInformationArray[0]);
		contact.setFirstName(contactInformationArray[1]);
		contact.setStreetAddress(contactInformationArray[2]);
		contact.setEmailAddress(contactInformationArray[3]);
		contact.setPhoneNumber(contactInformationArray[4]);
		contact.setNotes(contactInformationArray[5]);
		System.out.println(contact);
		contactList.addContact(contact);
	}
	
	/**
	 * Gets contact list and a String with a last name
	 * Searchs contact list by last name and returns the results
	 * 
	 * @author JD
	 */
	
	public static void searchContacts(ContactList contactList, String lastName){
		System.out.print("Search last name "+lastName+": \n");
		List<Contact> search = contactList.searchContacts(lastName);
		if (search.size() > 0) {
			System.out.println(search + "\n");
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