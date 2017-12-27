package com.kaleshsingh;

public class Account {

    private String accountNum;
    private double balance = 0;
    private String customerName;
    private String email;
    private String phoneNum;

    // Constructor
    public Account () {
        // Calling a constructor from within another constructor
        // NOTE: The call must be the first statement in the constructor
        this("000000", 0.00, "No name given", "No email given", "No phone given");

        System.out.println("Empty constructor called");
    }

    public Account (String accountNum, double balance, String customerName, String email, String phoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;

        System.out.println("Account constructor with parameters called");
    }

    public Account(String customerName, String email, String phoneNum) {
        this("00000", 0.00, customerName, email, phoneNum);
    }

    public void setAccountNum (String accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAccountNum () {
        return this.accountNum;
    }

    public double getBalance () {
        return this.balance;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getEmail () {
        return this.email;
    }
 
    public String getPhoneNum () {
        return this.phoneNum;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("You have deposited $" + String.format("%.2f", amount) + ", your new balance is $" + String.format("%.2f", this.balance));
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("You have withdrawn $" + String.format("%.2f", amount) + ", your new balance is $" + String.format("%.2f", this.balance));
        } else {
            System.out.println("Sorry, transaction failed - Insufficient balance");
            System.out.println("Your current balance is $" + String.format("%.2f", this.balance));
        }
    } 

}