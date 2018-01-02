package com.kaleshsingh;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phonebook = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phonebook.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();                
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
             }
        }                                                      
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print contacts.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To modify an existing contact.");
        System.out.println("\t 4 - To remove an existing contact.");
        System.out.println("\t 5 - To search for a contact in the phonebook.");
        System.out.println("\t 6 - To search quit.");
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String number = scanner.nextLine();
        phonebook.addContact(name, number);
    }

    private static void modifyContact() {
        System.out.println("Which contact do you want to update?");
        String contactInfo = scanner.nextLine(); 

        if (phonebook.findContact(contactInfo)) {
            System.out.println("What do you want to update?");
            System.out.println("1. Name");
            System.out.println("2.Number");
 
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    phonebook.modifyContactName(contactInfo, newName);
                    break;
                case 2:
                    System.out.print("Enter new number: ");
                    String newNumber = scanner.nextLine();
                    phonebook.modifyContactNumber(contactInfo, newNumber);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
 
    private static void removeContact() {
        System.out.print("Which contact do you want to remove: "); 
        String contactInfo2 = scanner.nextLine();
        phonebook.removeContact(contactInfo2);
    }

    private static void searchForContact() {
        System.out.print("Enter search query: ");
        String query = scanner.nextLine();
        phonebook.findContact(query);
    }
}