package Loops;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        
        //I will Set up the game.
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generates a random number from 1 to 100.
        int attempts = 10;
        int guessesMade = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("I've picked a number between 1 and 100. You have 10 attempts to guess it or you die!.");
        
        //Here I'm going to start the guessing loop.
        Scanner scanner = new Scanner(System.in);

        while (guessesMade < attempts && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            guessesMade++;

            if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations, You are alive! You guessed the number in " + guessesMade + " attempts.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your number is too high. You have " + (attempts - guessesMade) + " attempts left.");
            } else {
                System.out.println("Your number is too low. You have " + (attempts - guessesMade) + " attempts left.");
            }
        }
        
        // This will check if the user ran out of attempts.
        if (!hasGuessedCorrectly) {
            System.out.println("You Died! Sorry, you've run out of attempts. The number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}
