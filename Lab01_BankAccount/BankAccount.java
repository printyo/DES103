package Lab01_BankAccount;

public class BankAccount {
    Person person;
	String accountNumber;
	float balance;
	BankAccount(String name,String surname, String sex, String occupation, String organization, String accountNumber, float balance) {
		Person person = new Person(name,surname,sex,occupation,organization);
		this.person = person;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void deposit(double x) {
		balance += x;
	}
	void withdraw(double x) {
		balance -= x;
	}
	void printInfo() {
		person.printInfo();
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
	void printBalance() {
		System.out.println("Balance = " + balance + " million USD");
	}
	double convertBalanceToTHB() {
		return balance*32.83;
	}
	
}
