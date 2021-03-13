package com.example.masterclass.challenge;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public static void main(String args[]) {
        BankAccount newAccount = new BankAccount();
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
