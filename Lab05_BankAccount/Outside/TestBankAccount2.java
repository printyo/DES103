package Outside;

import Developer.BankAccount;

public class TestBankAccount2 {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Paris Hilton", "127-983-3847", 1000000.00);
		acc.getBalance(); // ignore this line
		//System.out.println(acc.accountNumber);
		//accountNumber has default visibility so it can only be access in its class or within its package. this class is in a dif package
	}
}