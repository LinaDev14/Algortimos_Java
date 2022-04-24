package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioOnce {
    /*
    * Construir un programa que simule el funcionamiento de una calculadora qe puede realizar las cuatro operaciones
    * aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros. El usuario debe
    * especificar la operación con el primer carácter del primer parámetro de la línea de comandos: S o s para la
    * suma, R o r para la resta, P, p, M o m para el producto y D o d para la división.
    * */

    public static void main(String[] args) {
        // TODO: 5/02/2022: suma(S o s), resta(R o r), division (D o d), multiplicación (M o m), modulo(P o p)

        // operaciones
        int num1, num2;
        char operacion;

        System.out.println("Menú calculadora: ");
        System.out.println("S o s -> Suma \n" + "R o r -> Resta \n" + "D o d -> División \n" + "M o " +
                "m -> Multiplicación \n" + "P o p -> Modulo");

        System.out.println("Presione operación que desea realizar: ");
        Scanner op = new Scanner(System.in);
        operacion = op.nextLine().charAt(0);

        System.out.println("Ingrese el primer valor: ");
        Scanner data1 = new Scanner(System.in);
        num1 = data1.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        Scanner data2 = new Scanner(System.in);
        num2 = data2.nextInt();


        switch(operacion){

            case 's':
            case 'S':
                System.out.println("Suma es igual = " + (num1 + num2));
                break;
            case 'R':
            case 'r':
                System.out.println("Resta igual a = " + (num1 - num2));
                break;
            case 'D':
            case 'd':
                System.out.println("División igual a = " + (num1 / num2));
                break;
            case 'M':
            case 'm':
                System.out.println("Multiplicación igual a = " + (num1 * num2));
                break;
            case 'P':
            case 'p':
                System.out.println("Modulo de la division = " + (num1 % num2));
                break;

                default:
                    System.out.println("Ingrese un caracter valido");
                    break;
        }




    }
}
