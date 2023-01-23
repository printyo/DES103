package Lab01_BankAccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Wang", "TaLu", "Male", "Actor", "SIIT", "000-000-000", 10.0f);
        bank.printInfo();
        
        bank.person.name = "Krittanut";
        bank.person.surname = "Yongsuphamongkol";
        bank.person.occupation = "Student";
        
        bank.printInfo();
        
        bank.deposit(15);
        bank.printBalance();
        
        bank.withdraw(5);
        bank.printBalance();
        double thb = bank.convertBalanceToTHB();
        System.out.println("THB : " + thb + " million baht");
    }
    }
