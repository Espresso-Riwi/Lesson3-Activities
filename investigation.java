import java.util.ArrayList;
import java.util.HashMap;

public class DataExplorers {
    public static void main(String[] args) {
        
   
        int[] numbers = {7, 14, 21, 28, 35};
        System.out.println("First: " + numbers[0]);
        System.out.println("Last: " + numbers[numbers.length - 1]);
        numbers[2] = 99;
        System.out.println("Changed: " + numbers[2]);
        ArrayList<String> backpack = new ArrayList<String>();
        backpack.add("Sword");
        backpack.add("Map");
        backpack.add("Potion");
        System.out.println("Second item: " + backpack.get(1));
        backpack.remove("Map");
        System.out.println("Backpack: " + backpack);
        HashMap<String, Integer> treasures = new HashMap<String, Integer>();
        treasures.put("Gold", 100);
        treasures.put("Silver", 50);
        treasures.put("Diamonds", 5);
        System.out.println("Diamonds: " + treasures.get("Diamonds"));
        treasures.put("Gold", 200);
        System.out.println("Gold: " + treasures.get("Gold"));
        int[] codes = {123, 456, 789};
        ArrayList<String> explorers = new ArrayList<String>();
        explorers.add("Alice");
        explorers.add("Bob");
        explorers.add("Charlie");
        
        HashMap<String, Integer> goldFound = new HashMap<String, Integer>();
        goldFound.put("Alice", 150);
        goldFound.put("Bob", 300);
        goldFound.put("Charlie", 200);
        
        String richest = "";
        int maxGold = 0;
        for (String name : explorers) {
            int gold = goldFound.get(name);
            if (gold > maxGold) {
                maxGold = gold;
                richest = name;
            }
        }
        System.out.println("Richest explorer: " + richest + " with " + maxGold);
    }
}
