package Loops;
import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the base (a real number) from the user.
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Get the exponent (a positive integer) from the user.
        System.out.print("Enter a positive integer exponent: ");
        int exponent = scanner.nextInt();

        // Validate the exponent.
        if (exponent < 0) {
            System.out.println("Error: The exponent must be a positive integer.");
        } else {
            // Calculate the power using a loop.
            double result = 1.0;
            for (int i = 0; i < exponent; i++) {
                result *= base; // This is a shortcut for: result = result * base;
            }

            // Print the final result.
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }

        scanner.close(); 
    }
}