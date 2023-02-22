package Developer;

public class BankAccount1_Testing {
	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("Paris Hilton", "127-983-3847", 1000000.00);

		//System.out.println("The balance of account1 is $" + account1.balance);
		//5-a-1 : The reason why this code is unable to run is because the property balance is private so it can only be accessed in its own class.

		// deposit $300 for account1
		account1.deposit(300);
		// print out the The balance of account1
		System.out.println("The balance of account1 is $" + account1.getBalance());
	}
}