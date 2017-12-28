package com.kaleshsingh;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int transmission;
    

    public Car(String name, String model, String color, int capacity, int speed, int wheels, int doors, int transmission) {
        super(name, model, color, capacity, speed);
        this.wheels = wheels;
        this.doors = doors;
        this.transmission = transmission;
    }

    public Car(String name, String model, String color) {
        this(name, model, color, 1, 0, 4, 4, 5);
    }

    public Car() {
        this("Name Unknown", "Model Unknown", "Color Unknown", 1, 0, 4, 4, 5);
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }

    public int getWheels() {
        return wheels;
    }
  
    public int getDoors() {
        return doors;
    }

    public int getTransmission() {
        return transmission;
    }

    public void drive(int speed) {
        System.out.println("Car is driving at " + speed + " speed.");
        move();
    }

    public void reverse(int speed) {
        System.out.println("Car is reversing at " + speed + " speed.");
        move();
    }

}
     