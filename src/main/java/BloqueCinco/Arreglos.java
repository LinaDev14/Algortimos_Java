package BloqueCinco;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {

        // definir un arreglo

        int[] numeros = {1,2,4,5};
        /*
        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 12;
         */

        //System.out.println(numeros[0]);

        //imprimir arreglos
        for(int i = 0; i < 3; i++){
            //System.out.println(numeros[i]);
        }

        // rellenar un arreglo
        int nElementos;

        System.out.println("Digite la cantidad de elementos del arreglo");
        Scanner data = new Scanner(System.in);
        nElementos = data.nextInt();


        Scanner data2 = new Scanner(System.in);
        char[] letras = new char[nElementos];

        System.out.println("digite los elementos de arreglo");

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un caracter: ");
            // guardar el primer caracter
            letras[i] = data2.next().charAt(0);
        }

        System.out.println("\n Los caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(letras[i]);
        }
    }
}
