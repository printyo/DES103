package Developer; 
public class TestBankAccount1 { 
public static void main(String [] args){ 
	BankAccount acc = new BankAccount("Paris Hilton","127-983-3847", 1000000.00 ); 
	acc.getBalance(); //ignore this line
	//System.out.println(acc.balance);
	//balance is private so it could only be accessed in its own class
 } 
} 