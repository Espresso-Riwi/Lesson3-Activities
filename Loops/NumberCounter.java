package Loops;
import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {

        //I will set up counters and scanner
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        //I will ask the user how many numbers they want to enter
        System.out.print("How many numbers do you want to enter? ");
        int totalNumbers = scanner.nextInt();

        //Then I'm going to start a loop to get numbers from the user
        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            int number = scanner.nextInt();

            // This checks the number and update the counters
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zero's: " + zeroCount);

        scanner.close(); 
    }
}