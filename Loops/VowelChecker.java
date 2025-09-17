package Loops;
import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter a character. The program will stop when you enter a space.");
        
        do {
            System.out.print("Enter a character: ");
            input = scanner.next(); // Reads the next word (in this case, a single character).
            
            // Check if the input is a space to exit the loop.
            if (input.equals(" ")) {
                System.out.println("Program terminated.");
                break; // Exit the do-while loop.
            }

            // Convert the input to lowercase to simplify the check.
            char character = input.toLowerCase().charAt(0);

            // Check if the character is a vowel.
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
            
        } while (true); // Loop runs forever until a 'break' statement is hit.
        
        scanner.close(); // Close the scanner.
    }
}