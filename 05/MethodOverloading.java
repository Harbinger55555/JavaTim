public class MethodOverloading {

    public static void main (String[] args) {
        
        int newScore = calculateScore("Kalesh", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double cm = calcFeetAndInchesToCentimeters(3, 5.678);
        double cm1 = calcFeetAndInchesToCentimeters(14);

    }

    public static int calculateScore (String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unknown player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >= 0 && (inches <= 12 && inches >= 0)) {
            double cm = ((feet * 12) + inches) * 2.54;
            // System.out.println(feet "'" + inches + "\" = " + cm + " cm"); 
            System.out.printf("%.0f'%.2f\" = %.2f cm\n", feet, inches, cm);
            return cm;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            inches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
        return -1;
    } 

}