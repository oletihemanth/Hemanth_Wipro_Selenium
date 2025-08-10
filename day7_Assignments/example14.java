package day7_Assignments;

//13  Implement a BankAccount class accessed by multiple threads to deposit and withdraw money. Use synchronization.


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " new balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw: " + amount);

        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrawal successful. New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient funds. Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class example14 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);

        Thread t1 = new DepositThread(account, 500);
        Thread t2 = new WithdrawThread(account, 200);
        Thread t3 = new WithdrawThread(account, 1500);
        Thread t4 = new DepositThread(account, 300);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t4.setName("Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//Thread-2 attempting to withdraw: 200.0
//Thread-2 withdrawal successful. New balance: 800.0
//Thread-4 depositing: 300.0
//Thread-4 new balance: 1100.0
//Thread-3 attempting to withdraw: 1500.0
//Thread-3 insufficient funds. Balance: 1100.0
//Thread-1 depositing: 500.0
//Thread-1 new balance: 1600.0