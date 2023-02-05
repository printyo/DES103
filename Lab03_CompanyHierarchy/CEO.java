package Lab03_CompanyHierarchy;

public class CEO extends Executive {
    String positionVehicle;

    CEO(String firstName, String lastName, int day, int month, int year, String workplace, String position, double salary, double bonus, String positionVehicle) {
        super(firstName, lastName, day, month, year, workplace, position, salary, bonus);
        this.positionVehicle = positionVehicle;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("PositionVehicle: " + positionVehicle);
    }

    void showVision(String vision) {
        System.out.println(super.name.firstName + " " + super.name.lastName + " shows " + vision);
    }
}
