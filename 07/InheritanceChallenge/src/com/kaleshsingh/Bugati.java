package com.kaleshsingh;

public class Bugati extends Car {

    private int turbo;
    private int pedalShifters;
    private int spyder;
    
 
    public Bugati (String name, String model, String color, int capacity, int speed, 
                   int wheels, int doors, int transmission, int turbo, int pedalShifters, 
                   int spyder) {
        super(name, model, color, capacity, speed, wheels, doors, transmission);
        this.turbo = turbo;
        this.pedalShifters = pedalShifters;
        this.spyder = spyder;
    }

    public Bugati (String name, String model, String color) {
        this(name, model, color, 2, 200, 4, 2, 7, 1, 2, 1);
    }

    public Bugati () {
        this("Bugati", "Veyron", "Blue", 2, 200, 4, 2, 7, 1, 2, 1);
    }

    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }

    public void setPedalShifters(int pedalShifters) {
        this.pedalShifters = pedalShifters;
    }

    public void setSpyder(int spyder) {
        this.spyder = spyder;
    }

    public int getTurbo() {
        return turbo;
    }

    public int getPedalShifters() {
        return pedalShifters;
    }

    public int getSpyder() {
        return spyder;
    }

    public void activateNitro() {
        System.out.println("No2 activated !");
        drive(350);
    }
}
