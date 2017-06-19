package FinalProject;
import java.io.*;

/**
 * Creates two Contacts Objects and save them in a file on the disk. Then this
 * reads the Contacts back into memory and prints them to show that it worked.
 * 
 * @author Chunlei
 */
public class Case4and5 {
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

		allContacts.saveContactList();
		allContacts = new ContactList();
		System.out.println(
				"Get rid of the old contactlist: \n" + allContacts + "\n");

		allContacts.loadContactList();
		System.out.println("load from disk: \n" + allContacts);
	}
}
/*
Error reading from the file: data (No such file or directory)
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

Get rid of the old contactlist: 
[]

load from disk: 
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
