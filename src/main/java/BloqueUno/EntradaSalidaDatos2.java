package BloqueUno;


import javax.swing.*;

public class EntradaSalidaDatos2 {
    public static void main(String[] args) {

        //Entrada y salida de Datos con JoptionPane
        // JOptionPane -> Ventanas emergentes

        String cadena;
        int entero;
        char letra;
        double decimal;

        // Pide los datos mediante pantallas emergentes
        cadena = JOptionPane.showInputDialog("Ingresa una cadena de texto: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu numero fav: "));
        letra = JOptionPane.showInputDialog("Ingresa un caracter: ").charAt(0);
        //Con el JOptionPane si puedo poner (.) en los decimales
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un decimal"));


        /*
        System.out.println(letra);
        System.out.println(cadena);
        System.out.println(entero);
        System.out.println(decimal);
         */

        JOptionPane.showMessageDialog(null, "El numero fav es " + entero);
        JOptionPane.showMessageDialog(null, "El caracter ingresado es " + letra);
        JOptionPane.showMessageDialog(null, "El numero decimal ingresado es " + decimal);


    }
}
