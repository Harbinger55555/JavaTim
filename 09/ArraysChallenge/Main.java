import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many integers do you want to enter: ");
        int n = scanner.nextInt();
        int[] integers = getIntegers(n);
        printArray(integers);
        integers = sortIntegers(integers);
        printArray(integers);
      
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers:\r");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int[] sortIntegers(int[] array) {
        // Copying the array
        /* int[] sortedIntegers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sortedIntegers[i] = array[i];
        }
        */ 

        int[] sortedIntegers = Arrays.copyOf(array, array.length);

        // Sort in descending order
        for (int i = 0; i < sortedIntegers.length - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < sortedIntegers.length; j++) {
                if (sortedIntegers[j] > sortedIntegers[maxPos]) {
                    maxPos = j;
                }
            }
            int temp = sortedIntegers[i];
            sortedIntegers[i] = sortedIntegers[maxPos];
            sortedIntegers[maxPos] = temp;
        }
        
        return sortedIntegers;  
    }
}