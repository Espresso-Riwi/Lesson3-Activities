
package lesson3.activities.day.pkg2;

import java.util.Scanner;
import java.util.Random;
public class EjerciciosBucles {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //ejercicio 1
        System.out.println("Ingrese el numero a calcular su factorial: ");
        int num = input.nextInt();
        int factorial = 1;
        for (int i = 0; i < num; i++) {
            factorial *= i+1;
        }
        System.out.println(factorial);
        
        //ejercicio2
        Random numeroAleatorio = new Random();
        int adivinarnumero = numeroAleatorio.nextInt(100) + 1;
        int contador = 10;
        do {
            System.out.println("Ingrese su numero tiene "+contador+" intentos restantes");
            int numeroIngresado = input.nextInt();
            if (numeroIngresado > adivinarnumero) {
                System.out.println("el numero a adivinar es menor");
            }else if (numeroIngresado < adivinarnumero){
                System.out.println("el numero a adivinar es mayor");
            }else if (numeroIngresado == adivinarnumero){
                System.out.println("¡ADIVINASTE EL NUMERO!");
                break;
            }
           
            contador -= 1;
        }
        while(contador != 0);
       
        //ejercicio3
        int suma = 0;
        int contador2 = 0;
        int numeros;
        System.out.println("Ingrese sus numeros, Al ingresar el numero 0 se cierra el programa");
        do {
            System.out.println("Ingrese su numero: ");
            numeros = input.nextInt();
            suma += numeros;
            contador2 += 1;
        }
        while(numeros != 0);
        System.out.println(contador2);
        System.out.println("La suma de todos los numeros ingresados es de "+suma+" y la media es de "+(suma/(contador2-1)));
    }
}
