package Lab03_CompanyHierarchy;

public class Executive extends Employee {
    double bonus;

    Executive(String firstName, String lastName, int day, int month, int year, String workplace, String position, double salary, double bonus) {
        super(firstName, lastName, day, month, year, workplace, position, salary);
        this.bonus = bonus;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("Bonus: " + bonus);
    }

    void announceRule(String rule) {
        System.out.println(super.position + ": " + super.name.firstName + " " + super.name.lastName);
        System.out.println("Announces rule: " + rule);
    }
}
