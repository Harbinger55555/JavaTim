package com.kaleshsingh;

public class Main {

    public static void main (String[] args) {

        Account account1 = new Account("12345", 0.00, "Bob Brown", "bob.brown@gmail.com", "27895678");

        account1.deposit(1000);
        account1.withdraw(500);
        account1.deposit(67.43);
        account1.withdraw(1000.789);

        Account account2 = new Account("Kalesh", "kaleshsingh@gmail.com", "12345");
        System.out.println("Number: " + account2.getAccountNum());
        System.out.println("Name: " + account2.getCustomerName());

    }
}