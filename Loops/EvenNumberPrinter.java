package Loops;
import java.util.Scanner;

public class EvenNumberPrinter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Get the two numbers from the user.
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();
        
        //Make sure the start is less than the end.
        //If not, we swap them.
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Even numbers between " + start + " and " + end + " are:");
        
        //Loop through the numbers and check for even ones.
        for (int i = start; i <= end; i++) {
            //An even number has a remainder of 0 when divided by 2.
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}