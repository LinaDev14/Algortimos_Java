package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioOcho {
    /*
    * Pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
    * */
    public static void main(String[] args) {

        int num;
        System.out.println("Ingresa un numero entre 0 y 99 999: ");
        Scanner data = new Scanner(System.in);
        num = data.nextInt();

        //System.out.println(Integer.MAX_VALUE);

        if(num < 10){
            System.out.println("El numero " + num + " Tiene 1 cifra");
        }else if(num < 100){
            System.out.println("El numero " + num + " Tiene 2 cifras");
        }else if(num < 1000){
            System.out.println("El numero " + num + " Tiene 3 cifras");
        }else if(num < 10000){
            System.out.println("El numero " + num + " Tiene 4 cifras");
        }else if(num < 100000){
            System.out.println("El numero " + num + " Tiene 5 cifras");
        }

    }
}
