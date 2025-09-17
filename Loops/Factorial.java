package Loops;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
        
        //I will ask the user to enter a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        scanner.close(); 

        //This will calculate the factorial using a loop
        long factorial = 1;

        //The factorial of a negative number doesn't exist
        if (number < 0) {
            System.out.println("Error: Factorial does not exist for negative numbers.");
        } 
        //This will calculate the factorial for positive numbers and zero
        else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            //I will show the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}

