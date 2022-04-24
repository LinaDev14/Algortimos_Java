package EjerciciosPractica;

import java.util.Scanner;

public class EjercicioTres {

    /*
    * Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen
    * Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
    * */

    public static void main(String[] args) {

        float dineroGuillermo, dineroLuis, dineroJuan, dineroTotal;

        System.out.println("Ingrese la cantidad de dinero de Guillermo: ");
        Scanner scanner = new Scanner(System.in);
        dineroGuillermo = scanner.nextFloat();

        System.out.println("Dinero Guillermo = " + dineroGuillermo + "$");

        //calculo dinero Luis
        dineroLuis = dineroGuillermo/2;
        System.out.println("Dinero Luis = " + dineroLuis + "$");

        //calculo dinero Juan
        dineroJuan = (dineroGuillermo + dineroLuis)/2;
        System.out.println("Dinero Juan = " + dineroJuan + "$");

        //Total dinero
        dineroTotal = (dineroGuillermo + dineroLuis + dineroJuan);
        System.out.println("Total dinero = " + dineroTotal + "$");


    }
}
