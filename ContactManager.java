import java.util.Arrays;

public class ContactManager {

  private Contact[] contacts;

  public ContactManager(Contact[] contacts) {
    this.contacts = new Contact[contacts.length];

    for (int i = 0; i < contacts.length; i++) {
      this.contacts[i] = new Contact(contacts[i]);
    }
  }

  //get contact method
  public Contact getContact(int index) {
    return new Contact(this.contacts[index]);
  }

  public void setContact(Contact newContact, int index) {
    this.contacts[index] = new Contact(newContact);
  }

  public int arrayLength() {
    return contacts.length;
  }

  public String toString() {
    return Arrays.toString(this.contacts);
  }
}
