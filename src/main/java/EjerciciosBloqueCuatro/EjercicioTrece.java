package EjerciciosBloqueCuatro;

import java.util.Scanner;

public class EjercicioTrece {
    /*
    * Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de
    *  ceros
    * */

    public static void main(String[] args) {

        int numero, suma_pos = 0, conteo_pos = 0, suma_neg = 0, conteo_neg = 0, conteo_cero = 0;
        float media_pos, media_neg;

        for(int i = 1; i <= 10; i++){

            System.out.println("Ingresa un numero");
            Scanner data = new Scanner(System.in);
            numero = data.nextInt();

            if(numero == 0){ // si el numero es cero
                conteo_cero++; // aumentamos en 1 el conteo de 0
            }else if(numero > 0){ // si el numero es positivo
                suma_pos += numero; // suma iterativa de positivos
                conteo_pos ++;
            }else{ // si el numero es negativo
                suma_neg += numero;
                conteo_neg ++;
            }

        }

        // tratamos con los numeros positivos
        if(conteo_pos == 0){
            System.out.println("No se puede sacar la media de los positivos");
        }else{
            media_pos = (float) suma_pos/conteo_pos;
            System.out.println("la media de los positivos es igual a " + media_pos);
        }

        // tratamos con los numeros negativos
        if(conteo_neg == 0){
            System.out.println("No se puede sacar la media de los positivos");
        }else{
            media_neg = (float) suma_neg/conteo_neg;
            System.out.println("La media de los negativos es igual a " + media_neg);
        }

        System.out.println("la cantidad de ceros es " + conteo_cero);
    }
}
