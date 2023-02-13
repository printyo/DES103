package Lab04_TaxPayment;

public class FullTime extends Employee implements TaxPayer {

    String workplace;
    double salary;

    FullTime(String name, String position, String workplace, double salary) {
        super(name, position);
        this.workplace = workplace;
        this.salary = salary;
    }

    void printWorkPlace() {
        System.out.println("Work at " + workplace);
    }

    double calculateMonthlyIncome() {
        return salary;
    }

    public double calculateYearlyIncome() {
        return salary*12;
    }

    public double calculateTax() {
        return super.calculateTaxRate(calculateYearlyIncome())*calculateYearlyIncome();
    }

    public void payTax() {
        System.out.println("Pay tax $" + calculateTax());
    }

    public void printInfo() {
        super.printInfo();
        printWorkPlace();
        System.out.println("Yearly income is " + calculateYearlyIncome());
        payTax();
    }
    
}
