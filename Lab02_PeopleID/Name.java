package Lab02_PeopleID;

public class Name {
    String firstName;
    String lastName;
    Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printName() {
        System.out.println(firstName + " " + lastName);
    }
}
