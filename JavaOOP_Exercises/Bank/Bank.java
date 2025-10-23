package Bank;
import java.util.*;
public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void removeAccount(Account acc) {
        accounts.remove(acc);
    }

    public void deposit(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Getter for accounts (optional, for demonstration)
    public List<Account> getAccounts() {
        return accounts;
    }
}
