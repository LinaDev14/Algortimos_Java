package BloqueTres;

/*
* switch(dato){
*   case 1 -> Instrucciones1;
*              break;
*   case 2 -> Instrucciones2;
 *              break;
 *  case 3 -> Instrucciones3;
 *              break;
* }
* */

import javax.swing.*;

public class SwitchCase {

    public static void main(String[] args) {

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 5"));

        switch (dato) {

            case 1:
                JOptionPane.showMessageDialog(null, "Es el numero uno");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Es el numero dos");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Es el numero tres");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Es el numero cuatro");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Es el numero cinco");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Numero no valido");
        }
    }
}
