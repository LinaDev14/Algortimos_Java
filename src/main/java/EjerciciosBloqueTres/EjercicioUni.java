package EjerciciosBloqueTres;

import javax.swing.*;

public class EjercicioUni {

    // TODO: 3/02/2022 Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
    public static void main(String[] args) {

        int numero1 = 10, numero2;
        String residuo;

        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));

        residuo = (numero2 % numero1 == 0) ? "Es multiplo de 10" : "No es multiplo de 10";

        JOptionPane.showMessageDialog(null, residuo);

    }

}
