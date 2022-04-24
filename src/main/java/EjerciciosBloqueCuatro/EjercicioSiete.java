package EjerciciosBloqueCuatro;

import javax.swing.*;

public class EjercicioSiete {

    /*
    * Pedir números hasta que se introduzca uno negativo, y calcular la media
    * */

    public static void main(String[] args) {

        int num, suma = 0, elementos = 0;
        float media;


        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));

        while(num >= 0){

            suma += num; //suma iterativa
            elementos ++; // aumentamos 1 a elementos

            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        }

        if(elementos == 0){
            System.out.println("Error, la división entre cero no existe");
        }else{
            media = (float) suma / elementos;
            System.out.println("La media es igual a: " + media);
        }
    }
}
