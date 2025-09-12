import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class PracticeWorkshop {

    public void arrays (){
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i*2);
        }
    }

    public void arraylist(){
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Emmanuel");
        namesList.add("Andres");
        namesList.add("Carlos");
        namesList.add("Diego");


        for (String name : namesList) {
            System.out.println("Hola " + name);
        }
    }
    // Hashmap es desordenado
    public void hashmaps(){
        HashMap<Integer, String> ccList = new HashMap<>();
        ccList.put(1004507553, "Emmanuel");
        ccList.put(1007845265, "Andres");
        ccList.put(1484543215, "Carlos");
        ccList.put(1021564855, "Diego");

        for (int key : ccList.keySet()){
            System.out.println(key+": --> "+ccList.get(key));
        }
    }

    //Crea una aplicación que pida un número y calcule su factorial (El factorial de un número es el producto de todos los enteros entre
    // 1 y el propio número y se representa por el número seguido de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5=120),

    public void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        long initFactorial = 1;
        for (int i = 1; i < number+1; i++) {
            initFactorial = initFactorial * i;
        }
        System.out.println("The factorial of "+number+" is: "+initFactorial);
    }

    //Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo números y
    // va respondiendo si el número a adivinar es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes 10 intentos para acertarlo).
    // El programa termina cuando se acierta el número
    // (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.

    public void randomNumber(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println(number);

        int attempts = 10;
        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter a number: ");
            int input = sc.nextInt();

            int range = number - input;

            if(range < 0){
                range = range*-1;
            }

            if (range == 0){
                System.out.println("You win!");
                break;
            }

            if (range > 24){
                System.out.println("You are cold");
            }else if (range >=15 && range < 24 ){
                System.out.println("You are little cold");
            }else if(range >=10 && range < 15){
                System.out.println("You are lukewarm");
            }else if (range >=5 && range < 10){
                System.out.println("You are warm");
            }else if (range < 5){
                System.out.println("You are hot");
            }

            System.out.println("You have "+(attempts-i-1)+" attempts left");
        }
    }
    // Algoritmo que pida números hasta que se introduzca un cero.
    // Debe imprimir la suma y la media de todos los números introducidos.

    public void sumAndAverage(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();

        boolean flag = true;

        while (flag){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number == 0){

                int numbersListLong = numbersList.size();
                int sumNumbers = 0;

                for (int numberL : numbersList){
                    sumNumbers+=numberL;
                }

                System.out.println("The sum of all numbers is: "+sumNumbers);
                System.out.println("The average is: "+sumNumbers/numbersListLong);

                flag = false;
                continue;
            }

            numbersList.add(number);
        }
    }
    // Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
    // El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

    public void greaterMinusEqual(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        int quantity = 10;
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < quantity ; i++) {
            System.out.println((i+1)+". Enter a number: ");
            int number = sc.nextInt();
            numbersList.add(number);
        }
        int greater = 0;
        int minus = 0;
        int equals = 0;
        for (int numberList: numbersList){
            if (numberList > 0){
                greater+=1;
            }else if (numberList < 0){
                minus+=1;
            }else{
                equals +=1;
            }
        }

        System.out.println("Quantity of numbers greater than 0:  "+greater);
        System.out.println("Quantity of numbers minus than 0:  "+minus);
        System.out.println("Quantity of numbers equals than 0:  "+ equals);
    }

    // Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario,
    // el programa termina cuando se introduce un espacio.

    public void vowels(){
        Scanner sc = new Scanner(System.in);
        char c;
        boolean flag = true;

        while (flag){
            System.out.print("Enter a character (space to stop): ");
            c = sc.nextLine().charAt(0);

            if ("aeiouAEIOU".indexOf(c) != -1) {
                System.out.println(c+" is a vowel");
            } else if (c != ' ') {
                System.out.println(c+" is not a vowel");
            }else{
                flag = false;
            }
        }
    }


    // Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.

    public void evenNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        if (number1 > number2){
            for (int i = number2+1; i < number1; i++) {
                if (i % 2 == 0){
                    System.out.println("Even number: "+i);
                }
            }
        }else if (number2 > number1){
            for (int i = number1+1; i < number2; i++) {
                if (i % 2 == 0){
                    System.out.println("Even number: "+i);
                }
            }
        }
    }

    // Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por teclado.

    public void multiplicationTables(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Multiplication table of number: "+number);
        for (int i = 1; i < 11; i++) {
            System.out.println(i +" x "+ number +" = "+ (i*number));
        }
    }

    //Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir.
    // A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:
    // La suma de los números que están dentro del intervalo (intervalo abierto). Cuantos números están fuera del intervalo.
    // He informa si hemos introducido algún número igual a los límites del intervalo.

    public void intervalNumbers(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int superiorLimit = 0;
        int inferiorLimit = 0;
        int numbersOut = 0;
        ArrayList<Integer> numbersIn = new ArrayList<>();

        while (flag){
            System.out.print("Enter the superior limit: ");
            superiorLimit = sc.nextInt();
            System.out.print("Enter the inferior limit: ");
            inferiorLimit = sc.nextInt();

            if (inferiorLimit > superiorLimit){
                System.out.println("Inferior limit cannot be greater than superior limit");
            }else{
                flag = false;
            }
        }

        int number = 1;
        System.out.println("Enter numbers, if you want to quit, just enter zero number.");
        while (number != 0){
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number > inferiorLimit && number < superiorLimit){
                numbersIn.add(number);
            }else if (number == inferiorLimit || number == superiorLimit){
                System.out.println("You entered a number equal to an interval limits!");
            }else{
                if (number == 0){
                    continue;
                }
                numbersOut+=1;
            }
        }

        int sumNumbers = 0;
        for (int numberList : numbersIn ){
            sumNumbers +=numberList;
        }

        System.out.println("The sum of all numbers in the interval is: "+sumNumbers);
        System.out.println("The quantity of all numbers out of the interval is: "+numbersOut);
    }

    //Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
    // saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

    public void exponent(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double realNumber = sc.nextDouble(); //2
        System.out.print("Enter an exponent positive number: ");
        int exponentNumber = sc.nextInt(); // 5

        double multiplication = realNumber;
        for (int i = 1; i < exponentNumber; i++) {
            multiplication *=  realNumber;
        }

        System.out.println("The result is: "+multiplication);
    }

    public void multiplicationTableUntil5(){
        for (int i = 1; i < 6; i++) {
            System.out.println("\nMultiplication table of number: "+i+"\n");
            for (int j = 1; j < 11; j++) {
                System.out.println(i +" x "+ j +" = "+ (i*j));
            }
        }
    }
}
