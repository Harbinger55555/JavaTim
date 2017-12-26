public class While {
 
    public static void main (String[] args) {

        int count = 0;

        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;

        while (true) {
            if (count == 5)
                break;
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;

        do {
            System.out.println("Count value was " + count);
            count++;

        } while (count != 6);

        int number = 5;
        int finishNum = 20;
        int numEvens = 0;
 
        while (number <= finishNum) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            
            System.out.println("Even number: " + number);
            numEvens++;
            number++;
            if (numEvens == 5)
                break;
 
        }

        System.out.println("Total number of even numbers found = " + numEvens);

    }


    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }

}