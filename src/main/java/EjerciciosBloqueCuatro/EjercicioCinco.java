package EjerciciosBloqueCuatro;

import javax.swing.*;

public class EjercicioCinco {
    /*
    * Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0 y 100, y luego ir
    * pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N. El proceso termina
    *  cuando el usuario acierta y mostrar el número de intentos.
    * */

    public static void main(String[] args) {

        int num, contador = 0, aleatorio;

        aleatorio = (int) (Math.random()*100); // genera un numero aleatorio entre 0 y 100
        System.out.println(aleatorio);

        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            if(aleatorio > num){
                JOptionPane.showMessageDialog(null, "Digite un numero mayor");
            }else{
                JOptionPane.showMessageDialog(null, "Digite un numero menor");
            }

            contador ++;
        }while(num != aleatorio);

        System.out.println("Has adivinado el numero en: " + contador + " intentos");
    }


}
