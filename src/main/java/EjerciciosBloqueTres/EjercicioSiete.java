package EjerciciosBloqueTres;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioSiete {
    /*
    * Pedir tres números y mostrarlos ordenados de mayor a menor
    * */

    public static void main(String[] args) {


        int num1, num2, num3;

        System.out.println("Ingresa un numero: ");
        Scanner data1 = new Scanner(System.in);
        num1 = data1.nextInt();

        System.out.println("Ingresa un segundo numero: ");
        Scanner data2 = new Scanner(System.in);
        num2 = data2.nextInt();

        System.out.println("Ingresa un tercer numero: ");
        Scanner data3 = new Scanner(System.in);
        num3 = data3.nextInt();



        if((num1 > num2) && (num2>num3)){
            System.out.println("Orden: " + num1 + " " + num2 + " " +  num3);
        }else if((num1> num3) && (num3>num2)){
            System.out.println("Orden: " + num1 + " " + num3 + " " + num2);
        }else if((num2 > num3) && (num3 > num1)){
            System.out.println("Orden: " + num2 + " " + num3 + " " + num1);
        }else if((num2 > num1) && (num1 > num3)){
            System.out.println("Orden: " + num2 + " " + num1 + " " + num3);
        }else if((num3 > num1) && (num1 > num2)){
            System.out.println("Orden: " + num3 + " " + num1 + " " + num2);
        }else{
            System.out.println("Orden: " + num3 + " " + num2 + " " + num1);
        }



    }
}
