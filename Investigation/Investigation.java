package Investigation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Investigation {

    public static void main(String[] args) {

        // --- 1. Array - The Ordered Chest ---
        System.out.println("--- 1. Array - The Ordered Chest ---");
        
        // Challenge 1: Declare an Array of 5 integers.
        int[] favoriteNumbers = {7, 13, 22, 5, 8};
        System.out.println("My favorite numbers are: " + Arrays.toString(favoriteNumbers));
        
        // Challenge 2: Access the first and last numbers.
        System.out.println("The first number is: " + favoriteNumbers[0]); // Arrays start at index 0.
        System.out.println("The last number is: " + favoriteNumbers[favoriteNumbers.length - 1]); // The last index is length - 1.
        
        // Challenge 3: Change the value at position 2 and show it again.
        favoriteNumbers[2] = 99; // Position 2 is the third element.
        System.out.println("The number at position 2 is now: " + favoriteNumbers[2]);
        
        // --- 2. ArrayList - The Magical Backpack ---
        System.out.println("\n--- 2. ArrayList - The Magical Backpack ---");

        // Challenge 1: Create an ArrayList of Strings.
        ArrayList<String> backpack = new ArrayList<>();
        
        // Challenge 2: Add 3 items to the backpack.
        backpack.add("Sword");
        backpack.add("Map");
        backpack.add("Potion");
        System.out.println("My backpack contains: " + backpack);
        
        // Challenge 3: Show the second item using .get(1).
        System.out.println("The second item is: " + backpack.get(1)); // Remember, ArrayLists also start at index 0.
        
        // Challenge 4: Remove an object and show the updated backpack.
        backpack.remove("Map");
        System.out.println("After removing the map, my backpack has: " + backpack);

        // --- 3. HashMap - The Treasure Map ---
        System.out.println("\n--- 3. HashMap - The Treasure Map ---");

        // Challenge 1: Create a HashMap.
        HashMap<String, Integer> treasures = new HashMap<>();
        
        // Challenge 2: Add 3 key-value pairs.
        treasures.put("Gold", 100);
        treasures.put("Silver", 50);
        treasures.put("Diamonds", 5);
        System.out.println("My treasures are: " + treasures);
        
        // Challenge 3: Show how many diamonds you have using the key.
        System.out.println("I have " + treasures.get("Diamonds") + " diamonds.");
        
        // Challenge 4: Update the value for "Gold" and print it again.
        treasures.put("Gold", 200); // This replaces the old value for "Gold".
        System.out.println("My gold is now: " + treasures.get("Gold"));

        // --- 4. Final Challenge ---
        System.out.println("\n--- 4. Final Challenge ---");

        // Step 1: Use an Array to store 3 secret codes.
        int[] secretCodes = {123, 456, 789};
        System.out.println("Secret codes array: " + Arrays.toString(secretCodes));
        
        // Step 2: Use an ArrayList to store the names of 3 explorers.
        ArrayList<String> explorers = new ArrayList<>();
        explorers.add("Alex");
        explorers.add("Bella");
        explorers.add("Chris");
        System.out.println("Explorer list: " + explorers);
        
        // Step 3: Use a HashMap to assign gold to each explorer.
        HashMap<String, Integer> goldFound = new HashMap<>();
        goldFound.put("Alex", 500);
        goldFound.put("Bella", 750);
        goldFound.put("Chris", 300);
        System.out.println("Gold found per explorer: " + goldFound);
        
        // Step 4: Show the explorer with the most gold.
        String richestExplorer = "";
        int maxGold = 0;
        
        for (String explorerName : goldFound.keySet()) {
            int currentGold = goldFound.get(explorerName);
            if (currentGold > maxGold) {
                maxGold = currentGold;
                richestExplorer = explorerName;
            }
        }
        System.out.println("The explorer with the most gold is " + richestExplorer + " with " + maxGold + " gold.");

    }
}