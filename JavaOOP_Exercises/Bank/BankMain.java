package Bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account("123", "Alice", 1000.0);
        Account a2 = new Account("456", "Bob", 500.0);
        
        bank.addAccount(a1);
        bank.addAccount(a2);
        
        System.out.println("Initial balances:");
        System.out.println(a1.getHolderName() + "'s balance: " + a1.getBalance());
        System.out.println(a2.getHolderName() + "'s balance: " + a2.getBalance());
        
        bank.deposit("123", 500.0);
        bank.withdraw("456", 200.0);
        
        System.out.println("After transactions:");
        System.out.println(a1.getHolderName() + "'s balance: " + a1.getBalance());
        System.out.println(a2.getHolderName() + "'s balance: " + a2.getBalance());
        
        // Demonstrate setters
        a1.setHolderName("Alice Johnson");
        System.out.println("Updated holder name: " + a1.getHolderName());
        
        bank.removeAccount(a2);
        System.out.println("Accounts in bank after removal: " + bank.getAccounts().size());
    }
}
