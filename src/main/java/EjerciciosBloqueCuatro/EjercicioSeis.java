package EjerciciosBloqueCuatro;

import javax.swing.*;

public class EjercicioSeis {
    /* Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos*/

    public static void main(String[] args) {

        int num, contadorSuma = 0;

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            contadorSuma += num;


        }while(num != 0);

        System.out.println("La suma de los numeros digitados es igual a :" + contadorSuma);
    }
}
