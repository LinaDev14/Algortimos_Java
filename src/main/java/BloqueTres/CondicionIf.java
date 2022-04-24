package BloqueTres;

/*
* if(condicion){
*
*   instruccion
*
* }else{
*
* instruccion
* }
* */

import javax.swing.*;

public class CondicionIf {
    public static void main(String[] args) {

        int numero, dato = 5;

        //El usuario digita un numero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        // desigualdad !=
        // == igualdad
        if(numero == dato){
            JOptionPane.showMessageDialog(null,"El numero es 5");
        }else{
            JOptionPane.showMessageDialog(null,"El numero es diferente de 5");
        }
    }
}
