package Lab03_CompanyHierarchy;

public class Person {
    Name name;
    Date dateOfBirth;
    static int numPerson = 0;

    Person(String firstName, String lastName, int day, int month, int year) {
        name = new Name(firstName, lastName);
        dateOfBirth = new Date(day, month, year);
        numPerson += 1;
    }

    void printInfo() {
        System.out.print("Name: ");
        name.printName();
        System.out.print("DOB: ");
        dateOfBirth.printDate();
        System.out.println("Age: " + (2023-dateOfBirth.year));
    }

    void printAgeAtYear(int year) {
        System.out.println("Age: " + (year-dateOfBirth.year));
    }

    static void printNumberOfPerson() {
        System.out.println("The total number of Persons is " + numPerson);
    }
}
