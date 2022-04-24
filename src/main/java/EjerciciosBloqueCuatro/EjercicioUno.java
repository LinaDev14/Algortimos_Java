package EjerciciosBloqueCuatro;

import javax.swing.*;
import java.util.Scanner;

public class EjercicioUno {
    /* Leer un numero y mostrar su cuatrado, repetir el proceso hasta que se introduzca un número negativo*/

    public static void main(String[] args) {

        System.out.println("Introduzca un numero para confirmar su cuadrado: ");

        int num, cuadrado;
        //Scanner data = new Scanner(System.in);
        //num = data.nextInt();

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (num >= 0) { //mientras el numero sea mayor a 0

            // de double a int
            cuadrado = (int) Math.pow(num, 2);

            JOptionPane.showMessageDialog(null, "El cuadrado de: " + num + " Es: " + cuadrado);

            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }


    }
}
