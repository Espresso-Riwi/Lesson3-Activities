package Loops;
import java.util.Scanner;

public class IntervalAnalyzer {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Get a valid interval from the user.
        int lowerBound, upperBound;
        do {
            System.out.print("Enter the lower limit of the interval: ");
            lowerBound = scanner.nextInt();
            System.out.print("Enter the upper limit of the interval: ");
            upperBound = scanner.nextInt();

            if (lowerBound > upperBound) {
                System.out.println("Error: The lower limit cannot be greater than the upper limit. Please try again.");
            }
        } while (lowerBound > upperBound);
        
        // Read numbers and analyze them.
        int sumInside = 0;
        int countOutside = 0;
        boolean onBoundary = false;
        int number;

        System.out.println("Enter numbers. Enter 0 to finish.");

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break; // Exit the loop if the number is 0.
            }

            if (number > lowerBound && number < upperBound) {
                sumInside += number;
            } else if (number < lowerBound || number > upperBound) {
                countOutside++;
            } else {
                onBoundary = true; // The number is equal to one of the limits.
            }

        } while (true); // Loop runs indefinitely until the 'break' statement.
        
        // Print the final results.
        System.out.println("\n--- Results ---");
        System.out.println("Sum of numbers inside the interval (" + lowerBound + ", " + upperBound + "): " + sumInside);
        System.out.println("Count of numbers outside the interval: " + countOutside);
        
        if (onBoundary) {
            System.out.println("At least one number was equal to a limit of the interval.");
        }
        
        scanner.close();
    }
}