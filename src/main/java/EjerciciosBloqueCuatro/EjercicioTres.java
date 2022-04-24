package EjerciciosBloqueCuatro;

import javax.swing.*;

public class EjercicioTres {

    /* Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar*/

    public static void main(String[] args) {

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        while (num != 0){

            if(num % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero " + num + " Es par");
                num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            }else{
                JOptionPane.showMessageDialog(null, "El numero " + num + " Es impar");
                num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
            }
        }
    }
}
