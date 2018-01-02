package com.kaleshsingh;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> phonebook = new ArrayList<Contact> ();

    public void printContacts() {
        for (int i = 0; i < phonebook.size(); i++) {
            Contact contact = phonebook.get(i);
            System.out.println(contact.getName() + "\t\t" + contact.getNumber());
        }
    }    

    private int indexOf(String query) {
        for (int i = 0; i < phonebook.size(); i++) {
            if ( (phonebook.get(i).getName().toLowerCase().equals(query.toLowerCase())) 
                 || (phonebook.get(i).getNumber().equals(query)) ) {
                return i;
            }
        }
        return -1;
    }

    public boolean findContact(String query) {
        int position = this.indexOf(query);
        if (position >= 0) {
            Contact contact = phonebook.get(position);
            System.out.println(contact.getName() + "\t\t" + contact.getNumber());
            return true;
        } else {
            System.out.println("No matches found.");
            return false;
        }
    }

    public void addContact(String name, String number) {
        int position = this.indexOf(name);
        if (position < 0) {
            Contact contact = new Contact(name, number);
            phonebook.add(contact);
            System.out.println("New contact added.");
        } else {
            Contact contact = phonebook.get(position);
            System.out.println("New contact not created.");
            System.out.println("Existing contact found: "+ contact.getName() + "\t\t" + contact.getNumber());
        }
    }

    private void updateName(Contact contact, String newName) {
        contact.setName(newName);
        System.out.println("Contact name updated.");
    }

    private void updateNumber(Contact contact, String newNumber) {
        contact.setNumber(newNumber);
       System.out.println("Contact number updated.");
        
    }

    public void modifyContactName(String query, String newName) {
        int position = this.indexOf(query);

        if (position < 0) {
            System.out.println("No matches found.");
            return;
        }

        Contact contact = phonebook.get(position);
        System.out.println("Contact found: " + contact.getName() + "\t\t" + contact.getNumber());
        this.updateName(contact, newName);
    }

    public void modifyContactNumber(String query, String newNumber) {
        int position = this.indexOf(query);

        if (position < 0) {
            System.out.println("No matches found.");
            return;
        }

        Contact contact = phonebook.get(position);
        this.updateNumber(contact, newNumber);
    }
    
    public void removeContact(String query) {
        int position = this.indexOf(query);

        if (position < 0) {
            System.out.println("No such contact found");
            return;
        }
        Contact contact = phonebook.get(position);
        System.out.println("Contact removed: " + contact.getName() + "\t\t" + contact.getNumber());
        phonebook.remove(position);
      
    }
}
            
    
