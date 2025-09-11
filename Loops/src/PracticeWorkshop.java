import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Arrays;
import java.util.Map;

public class PracticeWorkshop {

    // Arrays
    public void arrayExample1() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int n : numbers) {
            System.out.println(n * 2);
        }
    }

    public void arrayExample2() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("You entered: " + Arrays.toString(numbers));
    }

    // ArrayList
    public void arrayListExample() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        for (String name : names) {
            System.out.println("Hello, " + name);
        }
    }

    // HashMap
    public void hashMapExample() {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(12345, "Alice");
        people.put(67890, "Bob");
        people.put(11223, "Charlie");

        for (Map.Entry<Integer, String> entry : people.entrySet()) {
            System.out.println("Document: " + entry.getKey() + " → Name: " + entry.getValue());
        }
    }

    // Factorial
    public void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + "! = " + result);
    }

    // Guess number
    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int attempts = 10;
        boolean guessed = false;

        while (attempts > 0 && !guessed) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts--;

            if (guess == number) {
                System.out.println("Correct! You guessed in " + (10 - attempts) + " attempts.");
                guessed = true;
            } else if (guess < number) {
                System.out.println("The number is higher. Attempts left: " + attempts);
            } else {
                System.out.println("The number is lower. Attempts left: " + attempts);
            }
        }

        if (!guessed) {
            System.out.println("Out of attempts! The number was " + number);
        }
    }

    // Sum and average until 0
    public void sumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, num;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
            if (num != 0) {
                sum += num;
                count++;
            }
        } while (num != 0);

        if (count > 0) {
            System.out.println("Sum = " + sum + ", Average = " + (double) sum / count);
        } else {
            System.out.println("No numbers entered.");
        }
    }

    // Count positive, negative, zero
    public void countNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        int positives = 0, negatives = 0, zeros = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num > 0) positives++;
            else if (num < 0) negatives++;
            else zeros++;
        }

        System.out.println("Positives: " + positives + ", Negatives: " + negatives + ", Zeros: " + zeros);
    }

    // Vowels
    public void vowels() {
        Scanner sc = new Scanner(System.in);
        char c;

        do {
            System.out.print("Enter a character (space to stop): ");
            c = sc.next().charAt(0);

            if ("aeiouAEIOU".indexOf(c) != -1) {
                System.out.println("VOWEL");
            } else if (c != ' ') {
                System.out.println("NOT VOWEL");
            }
        } while (c != ' ');
    }


    // Even numbers between two numbers
    public void evenNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Multiplication table
    public void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Interval
    public void intervalNumbers() {
        Scanner sc = new Scanner(System.in);
        int lower, upper;

        // ensure valid interval
        do {
            System.out.print("Enter lower limit: ");
            lower = sc.nextInt();
            System.out.print("Enter upper limit: ");
            upper = sc.nextInt();
        } while (lower >= upper);

        int num, sum = 0, out = 0;
        boolean equalToLimit = false;

        // process numbers until 0
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();

            if (num > lower && num < upper) {
                sum += num;
            } else if (num == lower || num == upper) {
                equalToLimit = true;
            } else if (num != 0) {
                out++;
            }
        } while (num != 0);

        System.out.println("Sum inside interval = " + sum);
        System.out.println("Numbers outside interval = " + out);
        if (equalToLimit) System.out.println("At least one number equal to limits was entered.");
    }


    // Power (without Math.pow)
    public void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (real): ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent (positive integer): ");
        int exp = sc.nextInt();

        double result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        System.out.println("Result = " + result);
    }

    // Multiplication tables 1 to 5
    public void tables1to5() {
        for (int n = 1; n <= 5; n++) {
            System.out.println("Table of " + n);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            System.out.println();
        }
    }
}
