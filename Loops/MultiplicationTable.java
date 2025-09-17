package Loops;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //I will ask the user for a number.
        System.out.print("Enter a number to see its multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table for " + number + ":");

        //Loop to calculate and print the table from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            // This calculates  the product.
            int product = number * i;
            // Then I will print the equation.
            System.out.println(number + " x " + i + " = " + product);
        }

        scanner.close(); 
    }
}