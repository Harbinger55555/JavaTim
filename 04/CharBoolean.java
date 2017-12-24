public class CharBoolean {
    public static void main (String[] args) {

        // char has a width of 16 in Java
        char myChar = 'D';
        char unicodeChar = '\u00A9';	// Copyright symbol
        System.out.println("My character is " + myChar);
        System.out.println("My unicode character is " + unicodeChar);

        // boolean
        boolean myBool = false;
        boolean isMale = true;

        char registeredSymbol = '\u00AE';
        System.out.println("The registered symbol is " + registeredSymbol);       
    }
}