
package lesson3.activities.day.pkg2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Lesson3ActivitiesDay2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //taller
        
        //Arrays
        
        //crear array de 5 numeros enteros
        int [] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]*2);
        }
        
        int [] nums = new int [6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el valor del numero "+(i+1)+" :");
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    
        //ARRAYLIST
        
        ArrayList<String> compañeros = new ArrayList<>();
        compañeros.add("samuel");
        compañeros.add("juan");
        compañeros.add("Santiago");
        compañeros.add("Luis");
        for (int i = 0; i < compañeros.size(); i++) {
            System.out.println(compañeros.get(i));
        }
        for (int i = 0; i < compañeros.size(); i++){
            System.out.println("hola");
        }
        
        //HASHMAP
        HashMap<Integer , String> personas = new HashMap<>();   
        personas.put(12345565 , "David");
        for (var entry : personas.entrySet()) {
            System.out.println("Documento: "+entry.getKey() + "→ Nombre: "+entry.getValue());
        }
            
    }
    
}
