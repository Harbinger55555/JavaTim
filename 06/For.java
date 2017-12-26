public class For {

    public static void main (String[] args) {

        // for (init; termination condition; increment) { ...

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }    

        for (int i = 8; i > 1; i --) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;

        for (int i = 40; i < 60; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime.");
                count++;
            }
            if (count == 3) {
                System.out.println("Exiting for loop");
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    
    public static boolean isPrime(int n) { 
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
   }
}