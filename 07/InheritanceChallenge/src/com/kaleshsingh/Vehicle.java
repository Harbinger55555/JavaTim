package com.kaleshsingh;

public class Vehicle {

    private String name;
    private String model;
    private String color;
    private int capacity;
    private int speed;

    public Vehicle (String name, String model, String color, int capacity, int speed) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.speed = speed;
    }

    public Vehicle (String name, String model, String color) {
        this(name, model, color, 1, 0);
    }

    public Vehicle () {
        this("Name unknown", "Model unknown", "Color unknown", 1, 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
   
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        System.out.println("Vehicle started moving");
    }

    public void stop() {
        System.out.println("Vehicle stopped moving");
    }

    public void turnLeft() {
        System.out.println("Vehicle turning left");
    }

    public void turnRight() {
        System.out.println("Vehicle turning right");
    }
}