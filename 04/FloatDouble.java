public class FloatDouble {
    public static void main (String[] args) {
        // The width of an integer is 32
        int myIntVal = 5 / 3;

        // The width of a float is also 32
        float myFloatVal = 5f / 3f;

        // The width of a float is 64
        double myDoubleVal = 5d / 3d;
        
        // NOTE: Double is the default decimal type
        double myNewDouble = 5.4;
        // float myNewFloat = (float) 5.4;
        float myNewFloat = 5.4f;

        System.out.println("myIntValue = " + myIntVal);
        System.out.println("myFloatValue = " + myFloatVal);
        System.out.println("myDoubleValue = " + myDoubleVal);


        /*
        Convert a given number of pounds to kilograms.
        1. Create a variable to store the number of pounds.
        2. Calculate the number of kilograms and store it in another variable.
        3. Print out the result.
        NOTE: 1 pound = 0.45359237 kilograms
        */

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        // NOTE: We can also add underscores to make float and doubles morr readable
        double pi = 3.141_592_7;
    }
}