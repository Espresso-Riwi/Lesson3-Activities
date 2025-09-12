
package lesson3.activities.day.pkg2;

import java.util.Scanner;
import java.util.Random;

public class EjerciciosBucles {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // //ejercicio 1
        System.out.println("Ingrese el numero a calcular su factorial: ");
        int num = input.nextInt();
        int factorial = 1;
        for (int i = 0; i < num; i++) {
        factorial *= i+1;
        }
        System.out.println(factorial);

        // //ejercicio2
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

        // //ejercicio3
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

        // //Ejercicio 4
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
        System.out.println("La cantidad de numeros iguales a cero ingresados es de: "+igualesCero+ ", la cantidad de numeros menores a cero ingresados es de: "+menoresCero+", la cantidad de numeros mayores a cero ingresados es de: "+mayoresCero);

        // Ejercicio 5

        // Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’
        // en caso contrario, el programa termina cuando se introduce un espacio.
        input.nextLine();
        
        String letter;

        System.out.println("El sistema acabara cuando ingrese un espacio en blanco");
        do {
        System.out.println("Ingrese su letra: ");
        letter = input.nextLine();

        if ((letter.equals(" ") || letter.equalsIgnoreCase(""))) {
        break;
        }

        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
        letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
        letter.equalsIgnoreCase("u")){
        System.out.println("VOCAL");
        }else{
        System.out.println("NO VOCAL");
        }
        }
        while(true);

        // ejercicio 6

        // Escribir un programa que imprima todos los números pares entre dos números
        // que se le pidan al usuario.

        int num1,num2;

        System.out.println("Ingrese su primer numero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        num2 = input.nextInt();

        if (num1 > num2) {
        int aux = num1;
        num1 = num2;
        num2 = aux;
        }
        System.out.print("Los numeros pares que hay entre "+num1+" y "+num2+" son: ");
        for (int i = num1; i < num2; i++) {
        if (i % 2 == 0) {
        System.out.print(i+" ");
        }

        }

        // ejercicio 7
        // Realizar una algoritmo que muestre la tabla de multiplicar de un número
        // introducido por teclado.
        System.out.println("");
        int numTabla;
        System.out.println("Ingrese su numero: ");
        numTabla = input.nextInt();
        System.out.println("La tabla de multiplicar del numero es: ");
        for (int i = 1; i <= 10; i++) {
        System.out.println(i+" x "+numTabla+" = "+(i*numTabla));

        }

        // ejercicio 8

        // Escribe un programa que pida el limite inferior y superior de un intervalo.
        // Si el límite inferior es mayor que el superior lo tiene que volver a pedir. A
        // continuación se van introduciendo números hasta que introduzcamos el 0.
        // Cuando termine el programa dará las siguientes informaciones:

        
        // La suma de los números que están dentro del intervalo (intervalo abierto).
        // Cuantos números están fuera del intervalo. He informa si hemos introducido
        // algún número igual a los límites del intervalo.
        
        
        ejercicio8();
        

        // ejercicio 9

        // Escribe un programa que dados dos números, uno real (base) y un entero
        // positivo (exponente), saque por pantalla el resultado de la potencia. No se
        // puede utilizar el operador de potencia.

        System.out.println("Ingrese su numero real (base): ");
        Double numero1 = input.nextDouble();        
        
        System.out.println("Ingrese su numero entero (exponente): ");
        int numero2 = input.nextInt();

        Double potencia = 1.0;
        
        for (int i = 0; i < numero2; i++) {
            potencia *= numero1;
        }
        System.out.println(potencia);


        // ejercicio 10
        // Algoritmo que muestre la tabla de multiplicar de los números 1,2,3,4 y 5.
        int flag = 0;
        do {
            flag+=1;
            System.out.println("Tabla de multiplicar del numero "+flag+" : ");
            for (int i = 0; i <= 10; i++) {
                System.out.println(flag+" X "+i+" = "+flag*i);;
            }
        } while (flag != 5);

    }
        //ejercicio8

    private static void ejercicio8() {
        int inferior, superior;
        System.out.println("Ingrese su limite inferior: ");
        inferior = input.nextInt();
        System.out.println("Ingrese su limite superior: ");
        superior = input.nextInt();
        int nums, sumatoria = 0, contador = 0;
        if (inferior > superior) {
            System.out.println("El limite inferior no puede ser mayor al limite superior");
            ejercicio8();
        }
        System.out.println("Introduce tus numeros, al introducir 0 se terminara el programa");
        do {
            System.out.println("Ingrese el numero: ");
            nums = input.nextInt();
            if (nums == inferior || nums == superior) {
                System.out.println("El numero ingresado es igual a uno de los limites");
            }
            
            if (nums > inferior && nums < superior) {
                sumatoria += nums;
            }else if (nums < inferior || nums >superior){
                contador += 1;
            }
        } while (nums != 0);
        System.out.println("La suma de los numero ingresados que estaban dentro del intervalo es de : "+sumatoria+", la cantidad de numeros que no estaban dentro del intervalo es de: "+(contador-1));
    }



}
