package com.kaleshsingh;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer () {
        this("No name given", 0.00, "No email given");
        System.out.println("Constructor 1 called");
    }

    public VipCustomer (String name, String email) {
        this(name, 0.00, email);
        System.out.println("Constructor 2 called");
    }

    public VipCustomer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor 3 called");
    }



    public String getName () {
        return this.name;
    } 

    public double getCreditLimit () {
        return this.creditLimit;
    }
 
    public String getEmail () { 
        return this.email;
    }

}