package EjerciciosBloqueTres;

import javax.swing.*;

public class EjercicioTres {
    // TODO: 3/02/2022 Programa que lea un caracter por teclado y compruebe si es una letra mayúscula

    public static void main(String[] args) {

        char letra;
        String comparar;

        letra = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);

        comparar = Character.isUpperCase(letra) ? "Mayuscula" : "Minuscula";

        JOptionPane.showMessageDialog(null, comparar);


    }
}
