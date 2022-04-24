package EjerciciosBloqueCuatro;

import java.util.Scanner;

public class EjercicioDiez {
    /* Pedir 10 números y escribir la suma total */

    public static void main(String[] args) {

        int numero, suma = 0;

        for(int i = 1; i <= 10; i++){

            System.out.println("Ingresa un numero: ");
            Scanner data = new Scanner(System.in);
            numero = data.nextInt();

            suma += numero; // suma iterativa
        }

        System.out.println("La suma es: " + suma);


    }
}
