package EjerciciosPractica;

/* Hacer un programa que calcule el cuadrado de una suma
* (a + b)^2 = a^2 + b^2 + 2ab
* */

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {

        float datoUno, datoDos, calculo;

        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        datoUno = datos.nextFloat();

        System.out.println("Ingrese el segundo valor: ");
        datoDos = datos.nextFloat();

        System.out.println("Datos ingresados: " + "\n dato Uno = " + datoUno + "\n dato Dos = " + datoDos );

        calculo = (float) (Math.pow(datoUno,2) + Math.pow(datoDos,2)) + (2* (datoUno) *(datoDos));

        System.out.println("Calculo total " + calculo);



    }
}
