package oop.encapsulation;

public class Example02BankAccount {
    private String accountNumber;
    private double balance;

    public Example02BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Số tiền rút không hợp lệ!");
    }

    public void display() {
        System.out.println("Số tài khoản: " + accountNumber + ", Số dư: " + balance + " VNĐ");
    }

    public static void main(String[] args) {
        Example02BankAccount acc = new Example02BankAccount("123456789", 5000000);
        acc.display();
        acc.deposit(1000000);
        acc.withdraw(2000000);
        acc.display();
    }
}
