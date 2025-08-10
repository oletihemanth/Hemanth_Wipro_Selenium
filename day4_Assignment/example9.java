//Design an interface Bank with methods deposit(), withdraw(), and getBalance().
//Implement this in SavingsAccount and CurrentAccount classes.
//•	Use inheritance to create a base Account class.
//•	Demonstrate method overriding with customized logic for withdrawal (e.g., minimum balance in SavingsAccount).

package day4_Assignment;

interface Bank1 {
 void deposit(double amount);
 void withdraw(double amount);
 double getBalance();
}

abstract class Account implements Bank1 {
 protected String accountNumber;
 protected String holderName;
 protected double balance;

 public Account(String accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println(amount + " deposited. New Balance: " + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}

class SavingsAccount extends Account {
 private static final double MIN_BALANCE = 500;

 public SavingsAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
         balance -= amount;
         System.out.println(amount + " withdrawn from Savings. New Balance: " + balance);
     } else {
         System.out.println("Withdrawal failed! Minimum balance of " + MIN_BALANCE + " must be maintained.");
     }
 }
}

class CurrentAccount extends Account {
 private static final double OVERDRAFT_LIMIT = 1000;

 public CurrentAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= -OVERDRAFT_LIMIT) {
         balance -= amount;
         System.out.println(amount + " withdrawn from Current Account. New Balance: " + balance);
     } else {
         System.out.println("Withdrawal failed! Overdraft limit exceeded.");
     }
 }
}

//Main class to demonstrate
public class example9 {
 public static void main(String[] args) {
     Bank1 savings = new SavingsAccount("SA001", "Alice", 2000);
     Bank1 current = new CurrentAccount("CA001", "Bob", 500);

     System.out.println("--- Savings Account ---");
     savings.deposit(1000);
     savings.withdraw(2200); 
     savings.withdraw(1000); 

     System.out.println("\n--- Current Account ---");
     current.deposit(500);
     current.withdraw(1500); 
     current.withdraw(2000); 
 }
}

//--- Savings Account ---
//1000.0 deposited. New Balance: 3000.0
//2200.0 withdrawn from Savings. New Balance: 800.0
//Withdrawal failed! Minimum balance of 500.0 must be maintained.
//
//--- Current Account ---
//500.0 deposited. New Balance: 1000.0
//1500.0 withdrawn from Current Account. New Balance: -500.0
//Withdrawal failed! Overdraft limit exceeded.

