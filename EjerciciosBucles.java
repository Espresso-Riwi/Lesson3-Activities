
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
    
        //Ejercicio 4
        System.out.println("¿Cuantos numeros desea ingresar ?:");
        int cantidadNumeros = input.nextInt();
        int numeroIngresado;
        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el numero: ");
            numeroIngresado = input.nextInt();
                if (numeroIngresado == 0) {
                    igualesCero += 1;
                }else if (numeroIngresado > 0) {
                    mayoresCero += 1;
                }else if (numeroIngresado < 0 ){
                    menoresCero += 1;
                }
        }
        System.out.println("La cantidad de numeros iguales a cero ingresados es de: "+igualesCero+ ", la cantidad de numeros menores a cero ingresados es de: " +menoresCero+", la cantidad de numeros mayores a cero ingresados es de: "+mayoresCero);
        // Ejercicio 5
        // Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
        char letter;
        System.out.println("El sistema acabara cuando ingrese un espacio en blanco");
        do {
        System.out.println("Ingrese su letra: ");
        letter = input.next();
        if (letter == "a" || letter == "A" || letter == "e" || letter == "E" || letter == "i" || letter == "I" || letter == "o" || letter == "O" || letter == "u" || letter == "U" ) {
            System.out.println("VOCAL");    
        }else{
            System.out.println("NO VOCAL");
        }
        }
        while(letter != " " || letter != "");   

        // ejercicio 6
        // Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
            
        // Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por teclado.

        // Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir. A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:

        // La suma de los números que están dentro del intervalo (intervalo abierto). Cuantos números están fuera del intervalo. He informa si hemos introducido algún número igual a los límites del intervalo.

        // Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

        // Algoritmo que muestre la tabla de multiplicar de los números 1,2,3,4 y 5.
    }
}
