package FinalProject;
 
import java.util.Scanner;
 
/**
 * Creates an object of ContactList and an object of Contact, and calls all
 * methods on them.
 * 
 * @author Chunlei Li
 */
public class UseCase1 {
    public static void main(String[] args) {
        ContactList allContacts = new ContactList();
        Scanner console = new Scanner(System.in);
        
        Contact contact1 = new Contact();
        boolean invalidLastName = true;
        while (invalidLastName) {
            lastName = console.nextLine();
             System.out.println("Please type last name (required): \n > ");
             if (lastName.trim().length() <= 0) {
                System.out.println("Last name is required. ");
            } else {
                contact1.setLastName(lastName);
                invalidLastName = false;
            }
        }
        System.out.println("Please enter your first name: \n > ");
        contact1.setFirstName(console.nextLine());
        
        System.out.println("Please enter your street address: \n > ");
        contact1.setStreetAddress(console.nextLine());
        
        System.out.println("Please enter your email address: \n > ");
        contact1.setEmailAddress(console.nextLine());
        
        System.out.println("Please enter your phone number: \n > ");
        contact1.setPhoneNumber(console.nextLine());
        
        System.out.println("Please enter your notes: \n > ");
        contact1.setNotes(console.nextLine());
        
        
        allContacts.addContact(contact1);
        
        System.out.println("Contact saved!" + "\n");
        System.out.println(allContacts);
        
        Contact contact2 = new Contact();
        invalidLastName = true;
        while (invalidLastName) {
            lastName = console.nextLine();
             System.out.println("Please type last name (required): \n > ");
             if (lastName.trim().length() <= 0) {
                System.out.println("Last name is required. ");
            } else {
                contact2.setLastName(lastName);
                invalidLastName = false;
            }
        }
        System.out.println("Please enter your first name: \n > ");
        contact2.setFirstName(console.nextLine());
        
        System.out.println("Please enter your street address: \n > ");
        contact22.setStreetAddress(console.nextLine());
        
        System.out.println("Please enter your email address: \n > ");
        contact2.setEmailAddress(console.nextLine());
        
        System.out.println("Please enter your phone number: \n > ");
        contact2.setPhoneNumber(console.nextLine());
        
        System.out.println("Please enter your notes: \n > ");
        contact2.setNotes(console.nextLine());
        
        
        allContacts.addContact(contact2);
        
        System.out.println("Contact saved!" + "\n");
        System.out.println(allContacts);
 
    }
}
