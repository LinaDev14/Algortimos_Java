package BloqueCuatro;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {

        // TODO: 7/02/2022 mostrar por consola los numeros del 1 al 10 
        // TODO: 7/02/2022 Pedir al usuario que digite cuantos numeros quiere en pantalla

        System.out.println("Cuantos numeros quiere en pantalla: ");
        Scanner data = new Scanner(System.in);
        int i = 1, contador;

        contador = data.nextInt();

        while (i <= contador){
            System.out.println(i);
            i ++;
        }


    }
}
