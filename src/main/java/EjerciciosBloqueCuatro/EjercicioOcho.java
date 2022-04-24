package EjerciciosBloqueCuatro;

import java.util.Scanner;

public class EjercicioOcho {
    /*
    * Pedir un numero N, y mostrar todos los números del 1 al N.
    * */

    public static void main(String[] args) {

        int numero;

        System.out.println("Ingrese un numero: ");
        Scanner data = new Scanner(System.in);
        numero = data.nextInt();

        for(int i = 1; i <= numero; i++){
            System.out.println(i);
        }

    }
}
