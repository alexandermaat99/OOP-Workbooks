import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    /************************** Hashcode ************************/
    Contact contact = new Contact("Alice", 30);
    Contact contactCopy = contact;
    //these share the same hashcode as they both reference the same object

    Contact contactCopy2 = new Contact(contact);
    //this will create a contact that is an exact copy of contact, but will not share the same hashcode
    //as it's a completely new contact that happens to have the same information as the contact it is copying

    System.out.println("First Hashcode: " + contact.hashCode());
    System.out.println("Second Hashcode: " + contactCopy.hashCode());
    //same hashcode

    System.out.println(("Third hashcode " + contactCopy2.hashCode()));

    /************************** Equals ************************/

    System.out.println("Equality: " + contact.equals(contactCopy));
    System.out.println("Equality with contactCopy2: " + contact.equals(contactCopy2));
    //because they share the samehashcode, the default .equality method will return true

    /************************** HashCode and Equals ************************/

    Map<Contact, String> peopleMap = new HashMap<>();

    peopleMap.put(new Contact("Alice", 30), "1806 Farm Meadow Drive");
    peopleMap.put(new Contact("Bob", 35), "4046 Weekley Street");
    peopleMap.put(new Contact("Charles", 36), "1110 Cerullo Road");
    peopleMap.put(new Contact("Todd", 35), "3300 Ross Street");
    peopleMap.put(new Contact("Leah", 43), "3392 Clarksburg Park Road");
    peopleMap.put(new Contact("Brad", 40), "499 Diane Street");
    peopleMap.put(new Contact("Stephen", 36), "4 Meadowview Drive");
    peopleMap.put(new Contact("Lauren", 37), "514 Summit Park Avenue");
    peopleMap.put(new Contact("Adam", 42), "146 Devils Hill Road");
    peopleMap.put(new Contact("Hilary", 34), "397 Winifred Way");
    peopleMap.put(new Contact("Noah", 41), "1833 Maloy Court");

    System.out.println(
      "\nAlice's address is: " + peopleMap.get(new Contact("Alice", 30))
    );

    System.out.println(
      "\nAdam's address is: " + peopleMap.get(new Contact("Adam", 42))
    );

    System.out.print("\nIs Noah, 41 years of age, in my contacts? ");
    String response = peopleMap.containsKey(new Contact("Noah", 41))
      ? "Yes!"
      : "No, sorry";
    System.out.println(response);
  }
}
