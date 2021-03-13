package com.example.masterclass.challenge;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public static void main(String args[]) {
        BankAccount newAccount = new BankAccount();
        //  BankAccount newAccount = new BankAccount("", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        newAccount.setAccountNumber("14650");
        newAccount.setBalance(200);
        newAccount.setCustomerName("Fooman");
        System.out.println("Your customer name is " + newAccount.getCustomerName() + "Your account number is " + newAccount.getAccountNumber() + ".Your Balance is "
                + newAccount.getBalance());
        newAccount.makeDeposit(800);
        System.out.println("You have make a deposit and your current balance is " + newAccount.getBalance());
        newAccount.makeWithdraw(1200);
        System.out.println("You have make a withdraw and your current balance is " + newAccount.getBalance());
    }

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "default phone"); // call a constructor inside of another constructor. In this case if we want to add some default values when the empty constructor is called
        System.out.println("Empty Constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void makeDeposit(int fund) {
        this.balance += fund;
    }

    public void makeWithdraw(int fund) {
        if (balance >= fund && fund >= 1) {
            balance -= fund;
        } else {
            System.out.println("insufficient fund");
        }
    }
}
