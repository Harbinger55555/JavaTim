public class Switch {

    public static void main (String[] args) {

        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4: case 5: case 6:				// notice how to test for multiple cases at once
                System.out.println("Value was a 4, 5 or 6");
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4, 5, or 6");
                break;
        }

        
        char letter = 'C';

        switch (letter) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value was " + letter);
                break;
            default:
                System.out.println("Value was not A, B, C, D, or E");
                break;
        }

        // Java 8 has the capability to use strings for switch statements

        String month = "January";
 
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }

}