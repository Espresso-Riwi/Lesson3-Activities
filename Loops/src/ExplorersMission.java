import java.util.ArrayList;
import java.util.HashMap;

public class ExplorersMission {

    public void mission() {

        // 1. Array – The Ordered Chest
        System.out.println("=== Array – The Ordered Chest ===");
        int[] numbers = {7, 14, 21, 28, 35};

        System.out.println("First number: " + numbers[0]);
        System.out.println("Last number: " + numbers[numbers.length - 1]);

        numbers[2] = 99;
        System.out.println("Updated number at position 2: " + numbers[2]);

        // 2. ArrayList – The Magic Backpack
        System.out.println("\n=== ArrayList – The Magic Backpack ===");
        ArrayList<String> backpack = new ArrayList<>();

        backpack.add("Sword");
        backpack.add("Map");
        backpack.add("Potion");

        System.out.println("Second item: " + backpack.get(1));

        backpack.remove("Map");
        System.out.println("Updated backpack: " + backpack);

        // 3. HashMap – The Treasure Map
        System.out.println("\n=== HashMap – The Treasure Map ===");
        HashMap<String, Integer> treasures = new HashMap<>();

        treasures.put("Gold", 100);
        treasures.put("Silver", 50);
        treasures.put("Diamonds", 5);

        System.out.println("You have diamonds: " + treasures.get("Diamonds"));

        treasures.put("Gold", 200); // update value
        System.out.println("Updated gold: " + treasures.get("Gold"));

        // 4. Final Challenge
        System.out.println("\n=== Final Challenge ===");

        // Array with secret codes
        int[] codes = {123, 456, 789};
        System.out.println("Secret codes: ");
        for (int code : codes) {
            System.out.println(code);
        }

        // ArrayList with explorers
        ArrayList<String> explorers = new ArrayList<>();
        explorers.add("Lara");
        explorers.add("Indiana");
        explorers.add("Dora");

        System.out.println("Explorers: " + explorers);

        // HashMap with gold found
        HashMap<String, Integer> goldFound = new HashMap<>();
        goldFound.put("Lara", 120);
        goldFound.put("Indiana", 300);
        goldFound.put("Dora", 180);

        // Find explorer with the most gold
        String richestExplorer = "";
        int maxGold = 0;
        for (String explorer : goldFound.keySet()) {
            int gold = goldFound.get(explorer);
            if (gold > maxGold) {
                maxGold = gold;
                richestExplorer = explorer;
            }
        }

        System.out.println("The richest explorer is " + richestExplorer + " with " + maxGold + " gold.");
    }
}