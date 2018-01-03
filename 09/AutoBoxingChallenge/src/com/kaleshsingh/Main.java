package com.kaleshsingh;

public class Main {

    public static void main (String[] args) {

        Bank bank = new Bank("Bank of Guyana");

        if (bank.addBranch("Georgetown")) {
            System.out.println("Georgetown branch created.");
        }

        bank.addCustomer("Georgetown", "Kalesh", 50.05);
        bank.addCustomer("Georgetown", "Khalid", 175.85);
        bank.addCustomer("Georgetown", "Dane", 220.12);

        bank.addBranch("Vreed-en-hoop");
 
        bank.addCustomer("Vreed-en-hoop", "Delaney", 1003.78);
        bank.addCustomer("Vreed-en-hoop", "Andy", 500.65);
        bank.addCustomer("Vreed-en-hoop", "Joe", 0.05);  

        bank.addCustomerTransaction("Georgetown", "Kalesh", 44.22);
        bank.addCustomerTransaction("Georgetown", "Kalesh", 12.25);
        bank.addCustomerTransaction("Georgetown", "Khalid", 1.65);

        bank.listCustomers("Georgetown", true);
        bank.listCustomers("Vreed-en-hoop", true);

        // bank.addBranch("Ogle");

        if (!bank.addCustomer("Ogle", "Raefer", 5.53)) {
            System.out.println("Error Ogle branch does not exits!");
        }

        if (!bank.addBranch("Georgetown")) {
            System.out.println("Georgetown branch already exists");
        }

        if (!bank.addCustomerTransaction("Georgetown", "Bob", 520.45)) {
            System.out.println("Customer does not exists at branch");
        }

        if (!bank.addCustomer("Georgetown", "Kalesh", 12.12)) {
            System.out.println("Customer Kalesh already exists");
        }

    }

}