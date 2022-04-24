package EjerciciosBloqueTres;

import javax.swing.*;

public class EjercicioDos {

    // TODO: 3/02/2022 Pedir dos números y decir cual es el mayor o si son iguales

    public static void main(String[] args) {

        int numero1, numero2;
        String comparar;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));

        if(numero1 > numero2) {
            JOptionPane.showMessageDialog(null,"El numero " + numero1 + " es mayor que el " + numero2);
        }else if(numero1 < numero2){
            JOptionPane.showMessageDialog(null,"El numero " + numero1 + " es menor que el " + numero2);
        }else if(numero1 == numero2){
            JOptionPane.showMessageDialog(null,"El numero " + numero1 + " es igual que el " + numero2);
        }else{
            JOptionPane.showMessageDialog(null,"Datos no validos");
        }
    }
}
