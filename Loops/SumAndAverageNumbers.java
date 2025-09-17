package Loops;
import java.util.Scanner;

public class SumAndAverageNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        
        System.out.println("Enter numbers. Enter 0 to finish.");
        
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            
            if (number != 0) {
                sum = sum + number; // Add the number to the total sum
                count++; // Count how many numbers were entered
            }
            
        } while (number != 0); // Keep asking until the user enters 0
        
        // After the loop, calculate and print the results
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The sum of the numbers is: " + sum);
            System.out.println("The average of the numbers is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
        
        scanner.close(); 
    }
}
