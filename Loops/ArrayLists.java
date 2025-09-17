package Loops;
import java.util.ArrayList;

public class ArrayLists {
    
    public static void main(String[] args) {
        //I will create an ArrayList of String
        ArrayList<String> FriendsNames = new ArrayList<>(); 
        
        //And now I will add the names required
        FriendsNames.add("Tomas");
        FriendsNames.add("Lucho");
        FriendsNames.add("Juanjo");
        FriendsNames.add("Deivi");
        
        //I'm going to go through the array list and say Wassup! to every name in that array list.
        for (String name : FriendsNames) {
        System.out.println("Wassup! " + name);
}
    }
}