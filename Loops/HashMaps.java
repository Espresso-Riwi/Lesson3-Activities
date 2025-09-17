package Loops;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        //I will create a Hashmap with integers and strings
        Map<Integer, String> Documents = new HashMap<>();
        
        //I will add the required information (Document - Name)
        Documents.put(101, "Samuel");
        Documents.put(102, "Ana");
        Documents.put(103, "Jaime");
        
        // iterating by key, value
        for (var entry : Documents.entrySet()) {
        System.out.println("Document: " + entry.getKey() + " --> Name: " + entry.getValue());
        }
    }
}