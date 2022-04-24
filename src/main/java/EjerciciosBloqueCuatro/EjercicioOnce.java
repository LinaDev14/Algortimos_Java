package EjerciciosBloqueCuatro;

import java.util.Scanner;

public class EjercicioOnce {
    /* Diseñar un programa que muestre el producto de los 10 primeros números impares*/

    public static void main(String[] args) {

        int numero;
        long producto = 1;

        //System.out.println("Ingrese un numero");
        //Scanner data = new Scanner(System.in);
        //numero = data.nextInt();

        for(int i = 1; i <= 20; i+=2){
            producto *=i;
        }

        System.out.println("El producto es: " + producto);
    }
}
