package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioSeis {
    /*
    * Hacer un programa que tome dos números y diga si ambos son pares o impares
    * */
    public static void main(String[] args) {

        int numero1, numero2;

        System.out.println("Ingresa un numero: ");
        Scanner data = new Scanner(System.in);
        numero1 = data.nextInt();

        System.out.println("Ingresa otro numero: ");
        Scanner data2 = new Scanner(System.in);
        numero2 = data2.nextInt();

        if(numero1 % 2 == 0 &&  numero2 % 2 == 0){
            System.out.println("Ambos numeros son pares");
        }else if(numero1 % 2 != 0 &&  numero2 % 2 != 0){
            System.out.println("Los numeros son impares");
        }else{
            System.out.println("Un numero es par y el otro es impar");
        }
    }
}
