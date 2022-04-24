package EjerciciosPractica;


import java.util.Scanner;

/*
* Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones
* */
public class EjercicioUno {

    public static void main(String[] args) {

        // forma 1
        // Datos por consola usando Scanner

        System.out.println("Ingresa Calificacion uno: ");
        Scanner dato1 = new Scanner(System.in);
        float cal1 = dato1.nextFloat();

        System.out.println("Ingresa Calificacion dos: ");
        Scanner dato2 = new Scanner(System.in);
        float cal2 = dato2.nextFloat();

        System.out.println("Ingresa Calificacion tres: ");
        Scanner dato3 = new Scanner(System.in);
        float cal3 = dato3.nextFloat();
        
        float resultado = (cal1 + cal2 + cal3);
        System.out.println("resultado total = " + resultado);
        
        
    }
}
