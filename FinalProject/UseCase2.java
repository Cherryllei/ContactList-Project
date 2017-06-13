package FinalProject;

import java.util.Scanner;

/**
 * Creates an object of ContactList and four objects of Contact. After each
 * Contact is created, the ContactList is printed, sorted alphabetically by
 * last name. If two Contacts have the same last name, they Contacts are 
 * then sorted by first name.
 * 
 * @author Erin Liao
 */
public class UseCase2 {
    public static void main(String[] args) {
        ContactList allContacts = new ContactList();
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
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
