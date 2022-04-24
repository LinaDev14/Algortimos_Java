package EjerciciosBloqueCuatro;

import javax.swing.*;

public class EjercicioCuatro {

    /*
    * Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
    * */

    public static void main(String[] args) {

        int numero, contador = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0){
            contador ++; // aumentamos en uno el contador

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        }

        System.out.println("Ha introducido " + contador + " numeros no negativos");
    }
}
