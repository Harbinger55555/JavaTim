package com.kaleshsingh;

public class Main {

    public static void main (String[] args) {
    
        Printer printer = new Printer(0.10, 0, true);

        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.refillToner();
        printer.printPage();

    }

}