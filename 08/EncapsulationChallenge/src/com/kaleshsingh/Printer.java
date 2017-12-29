package com.kaleshsingh;

public class Printer {

    private double tonerLevel = 100.0;
    private int pagesPrinted = 0;
    private boolean isDuplex = true;

    public Printer(double tonerLevel, int pagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void refillToner() {
        System.out.println("Toner refilled");
        this.tonerLevel = 100.0;
    }

    public void printPage() {
        if (tonerLevel >= 0.05) {
            System.out.println("Page printed");
            this.tonerLevel -= 0.05;
            this.pagesPrinted += 1;
        } else {
            System.out.println("Insufficient toner.");
        }
    } 

    public double getTonerLevel() {
        return this.tonerLevel;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public boolean getDuplex() {
        return this.isDuplex;
    }

}