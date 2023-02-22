package Lab05_FamilyMember;

//Exercise 1: Write a FamilyMember class of which its details (2 points)
public class FamilyMember {
	// Exercise 1: add properties
	static String familyName = "Hilton";
	String firstName;
	static double commonFund = 100000.00;
	double privateFund;

	// Exercise 1: add constructor
	FamilyMember(String firstName, double privateFund) {
		this.firstName = firstName;
		this.privateFund = privateFund;
	}

	// Exercise 1: add method
	void printPrivateFund() {
		System.out.println(firstName + " " + familyName + " has $" + privateFund);
	}

	// Exercise 3-a: add two additional methods
	void contributeToCommonFund(double amount) {
		commonFund += amount;
		privateFund -=amount;
	}
	
	static void payFromCommonFund(double amount) {
		commonFund -= amount;
	}
	// Exercise 3-c: print the common fund of the family.
	static void printFamilyFund() {
		System.out.println("The " + familyName + " family has $" + commonFund);
	}
}