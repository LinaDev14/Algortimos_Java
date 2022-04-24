package EjerciciosPractica;

/* Contruir un programa que calcule y muestre por pantalla las raíces de la ecuación de segndo grado de coeficientes
reales
    ax2 + bx + c = 0
*/

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {

        // variables
        double a, b, c, x1, x2;

        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese dato a: ");
        a = datos.nextDouble();
        System.out.println("Ingrese dato b: ");
        b = datos.nextDouble();
        System.out.println("Ingrese dato c: ");
        c = datos.nextDouble();

        x1 = Math.floor((-b + Math.sqrt(Math.pow(b,2) - (4*a*c))) /(2*a));
        x2 = Math.floor((-b - Math.sqrt(Math.pow(b,2) - (4*a*c))) /(2*a));

        System.out.println("Calculo x1 = " + x1);
        System.out.println("Calculo x2 = " + x2);
    }
}
