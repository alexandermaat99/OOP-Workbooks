import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ContactManager contactManager = new ContactManager(contactData());

    displayContacts(contactManager);

    String userInput = "CONTINUE";

    while (userInput.equals("CONTINUE")) {
      System.out.print("To edit a contact type 'continue': ");
      userInput = scan.nextLine().toUpperCase();
      if (userInput.equals("CONTINUE")) {
        System.out.println(
          "There are " + contactManager.arrayLength() + " contacts."
        );
        System.out.println("Which contact would you like to edit?: ");
        int indexToEdit = scan.nextInt() - 1;
        contactManager.setContact(
          editContact(contactManager.getContact(indexToEdit)),
          indexToEdit
        );
        displayContacts(contactManager);
      }
    }

    scan.close();
  }

  public static Contact[] contactData() {
    return new Contact[] {
      new Contact("John Doe", "555-123-4567", "1985-01-01"),
      new Contact("Jane Smith", "555-987-6543", "1990-02-14"),
      new Contact("Alice Johnson", "555-345-6789", "1975-03-30"),
      new Contact("Bob Brown", "555-567-8910", "2000-12-25"),
      new Contact("Charlie Davis", "555-111-2222", "1983-07-04"),
      new Contact("Diana White", "555-333-4444", "1997-11-18"),
      new Contact("Ethan Green", "555-555-6666", "1988-05-22"),
      new Contact("Fiona Black", "555-777-8888", "2002-10-31"),
    };
  }

  public static void displayContacts(ContactManager contactManager) {
    for (int i = 0; i < contactManager.arrayLength(); i++) {
      System.out.println(contactManager.getContact(i));
    }
  }

  public static Contact editContact(Contact contactToEdit) {
    Scanner scan = new Scanner(System.in);
    String currentName = contactToEdit.getName();
    String currentPhoneNumber = contactToEdit.getPhoneNumber();
    String currentBirthDate = contactToEdit.getBirthDate();

    System.out.print("Current name: " + currentName + " Change to: ");
    String newName = scan.nextLine();
    System.out.print(
      "Current phone number: " + currentPhoneNumber + " Change to: "
    );
    String newPhoneNumber = scan.nextLine();
    System.out.print("Current birthdate: " + currentBirthDate + " Change to: ");
    String newBirthdate = scan.nextLine();

    scan.close();
    return new Contact(newName, newPhoneNumber, newBirthdate);
  }
}
