//3. Advanced: Bank Account with Deposit/Withdraw Logic
//Transaction validation and encapsulation protection.
//•	Create a BankAccount class with private accountNumber, accountHolder, balance.
//•	Provide:
//o	deposit(double amount) — ignores or rejects negative.
//o	withdraw(double amount) — prevents overdraft and returns a boolean success.
//o	Getter for balance but no setter.
//•	Optionally override toString() to display masked account number and details.
//•	Track transaction history internally using a private list (or inner class for transaction object).
//•	Expose a method getLastTransaction() but do not expose the full internal list.

package day5_assignment;

import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    
    private List<Transaction> transactionHistory;

    private class Transaction {
        String type;
        double amount;
        double resultingBalance;

        Transaction(String type, double amount, double resultingBalance) {
            this.type = type;
            this.amount = amount;
            this.resultingBalance = resultingBalance;
        }

        @Override
        public String toString() {
            return type + ": " + amount + " | Balance after: " + resultingBalance;
        }
    }

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(0, initialBalance); // Prevent negative initial balance
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add(new Transaction("Account Created", this.balance, this.balance));
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed: Amount must be positive.");
            return;
        }
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount, balance));
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal failed: Insufficient funds.");
            return false;
        }
        balance -= amount;
        transactionHistory.add(new Transaction("Withdraw", amount, balance));
        System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        return true;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to get only the last transaction
    public String getLastTransaction() {
        if (transactionHistory.isEmpty()) {
            return "No transactions yet.";
        }
        return transactionHistory.get(transactionHistory.size() - 1).toString();
    }

    // Masked account number
    private String getMaskedAccountNumber() {
        if (accountNumber.length() > 4) {
            return "****" + accountNumber.substring(accountNumber.length() - 4);
        }
        return accountNumber;
    }

    // toString method
    @Override
    public String toString() {
        return "Account Holder: " + accountHolder +
               " | Account Number: " + getMaskedAccountNumber() +
               " | Balance: " + balance;
    }
}

// Main class to test
public class Bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890", "Alice Johnson", 5000);

        System.out.println(acc); // Initial account details
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.withdraw(7000); // should fail
        acc.deposit(-500);  // should fail

        System.out.println("Current Balance: " + acc.getBalance());
        System.out.println("Last Transaction: " + acc.getLastTransaction());
    }
}

//Account Holder: Alice Johnson | Account Number: ****7890 | Balance: 5000.0
//Deposited: 2000.0 | New Balance: 7000.0
//Withdrawn: 1000.0 | New Balance: 6000.0
//Withdrawal failed: Insufficient funds.
//Deposit failed: Amount must be positive.
//Current Balance: 6000.0
//Last Transaction: Withdraw: 1000.0 | Balance after: 6000.0