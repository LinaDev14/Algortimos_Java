package EjerciciosBloqueCinco;

import java.util.Scanner;

/* Leer 5 números, guardalos en un arreglo y mostrarlo en el mismo orden introducido*/
public class EjercicioUno {
    public static void main(String[] args) {

        float numeros[] = new float[5];
        Scanner data = new Scanner(System.in);

        System.out.println("Guardando numeros en el arreglo ...");
        for(int i = 0; i < 5; i++){
            System.out.println((i + 1) + ". Ingresa un numero");

            numeros[i] = data.nextFloat();
        }

        System.out.println("elementos del arreglo: ");
        for(float numero : numeros){
            System.out.println(numero);
        }


    }
}
