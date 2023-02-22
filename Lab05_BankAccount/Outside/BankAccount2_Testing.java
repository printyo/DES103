package Outside;

import Developer.BankAccount;

public class BankAccount2_Testing {
	public static void main(String[] args) {
		BankAccount account2 = new BankAccount("Paris Hilton", "127-983-3847", 1000000.00);

		//account2.printInfo();
		//5-b-1 : The reason why this code is unable to run is the method printInfo() has a default visibility so it cannot be accessed outside the package
		
		//account2.withdraw(300.00);
		//5-b-2 : The reason why this code is unable to run is the method withdraw() has a protected visibility so it can only be access in its package or a subclass outside the package
		
		System.out.println("The balance of account2 is $" + account2.getBalance());
		//5-b-3 : I made a method getBalance() with a public modifier in the BankAccount class so it can be used anywhere
	}
}