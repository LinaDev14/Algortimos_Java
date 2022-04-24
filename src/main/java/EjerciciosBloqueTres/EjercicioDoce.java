package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioDoce {
    /*
    * Pedir una nota de 0 a 10 y mostrarla de la forma:
    * Insuficiente
    * Suficiente
    * Bien
    * Notable
    * SobreSaliente
    * */

    public static void main(String[] args) {

        int nota;

        System.out.println("Ingrese su nota: (1 - 10): ");
        Scanner data = new Scanner(System.in);
        nota = data.nextInt();

        switch (nota) {
            case 1:
            case 2:
                System.out.println("Nota = Insuficiente");
                break;

            case 3:
            case 4:
                System.out.println("Nota = Suficiente");
                break;

            case 5:
            case 6:
                System.out.println("Nota = Bien");
                break;

            case 7:
            case 8:
                System.out.println("Nota = Notable");
                break;

            case 9:
            case 10:
                System.out.println("Nota = Sobresaliente");
                break;
        }
    }

}
