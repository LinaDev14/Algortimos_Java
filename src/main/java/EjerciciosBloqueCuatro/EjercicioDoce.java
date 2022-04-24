package EjerciciosBloqueCuatro;

import java.util.Scanner;

public class EjercicioDoce {
    /*
    * Pedir un número y calcular su factorial
    * */

    public static void main(String[] args) {

        int numero;
        double factorial = 1;

        System.out.println("Ingrese un número: ");
        Scanner data = new Scanner(System.in);
        numero = data.nextInt();

        /*
        while(numero != 0){

            factorial = factorial * numero;
            numero --;
        }
        */

        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }

        System.out.println("Factorial de: "+ numero+ " es: " + factorial);



    }
}
