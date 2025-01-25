public class Contact {

  private String name;
  private String phoneNumber;
  private String birthDate;
  private int age;

  //constructor
  public Contact(String name, String phoneNumber, String birthDate, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.birthDate = birthDate;
    this.age = age;
  }

  //copy constructor
  public Contact(Contact source) {
    this.name = source.name;
    this.phoneNumber = source.phoneNumber;
    this.birthDate = source.birthDate;
    this.age = source.age;
  }

  //Getters and Setters
  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public int getAge() {
    return age;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setPhoneNumber(String newPhoneNumber) {
    this.phoneNumber = newPhoneNumber;
  }

  public void setBirthDate(String newBirthDate) {
    this.birthDate = newBirthDate;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  //toString
  public String toString() {
    return (name + " " + phoneNumber + " " + birthDate + " " + age);
  }
}
