package Loops;
public class MultiplicationTables {

    public static void main(String[] args) {

        // The outer loop handles the numbers we want to multiply (from 1 to 5).
        for (int number = 1; number <= 5; number++) {
            System.out.println("Multiplication Table of " + number + ":");

            // The inner loop handles the multiplication part (from 1 to 10).
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
            
            // This blank line makes the output easier to read.
            System.out.println();
        }
    }
}