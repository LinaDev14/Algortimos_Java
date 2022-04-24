package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioCatorce {

    // TODO: 5/02/2022 Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles

    public static void main(String[] args) {

        /*
        * Unidades disponibles
        * 1 kg ->> 1000 g
        * 1 kg ->> 2.20462 lbm
        * 1 kg ->> 0.001 toneladas
        * 1 kg ->> 35.27 oz
        * */

        System.out.println("Bienvenid/a a la tabla de conversiones de kg a ...");
        System.out.println("Menú de opciones: " );
        System.out.println("\n 1. De Kg a g" + "\n 2. De kg a lbm" + "\n 3. De kg a Ton" + "\n 4. De kg a oz" + "\n 5" +
                ". Salir");

        // plantear variables
        float num1, conversion;
        int opcion;

        //Pedir datos
        System.out.println("Ingresa opción: ");
        Scanner data = new Scanner(System.in);
        opcion = data.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("Ingresa valor a convertir: ");
                num1 = data.nextFloat();

                if(num1 != 0){
                    conversion = (num1 * 1000);
                    System.out.println(num1 +"kg" + " es igual a = " + conversion + "g");
                }else{
                    System.out.println("El valor es cero");
                }
                break;

            case 2:
                System.out.println("Ingresa valor a convertir: ");
                num1 = data.nextFloat();

                if(num1 != 0){
                    conversion = (num1 * 2.20462f);
                    System.out.println(num1 +"kg" + " es igual a = " + conversion + "lbm");
                }else{
                    System.out.println("El valor es cero");
                }
                break;

            case 3:
                System.out.println("Ingresa valor a convertir: ");
                num1 = data.nextFloat();

                if(num1 != 0){
                    conversion = (num1 * 0.001f);
                    System.out.println(num1 +"kg" + " es igual a = " + conversion + "lbm");
                }else{
                    System.out.println("El valor es cero");
                }
                break;
            case 4:
                System.out.println("Ingresa valor a convertir: ");
                num1 = data.nextFloat();

                if(num1 != 0){
                    conversion = (num1 * 35.274f);
                    System.out.println(num1 +"kg" + " es igual a = " + conversion + "oz");
                }else{
                    System.out.println("El valor es cero");
                }
                break;

            case 5:
                break;

            default:
                System.out.println("Ingrese una opción valida");
                break;


        }

    }
}
