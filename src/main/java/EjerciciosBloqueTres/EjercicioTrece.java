package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioTrece {
    /*
    * Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 Dólares, con el siguiente menú
    * de opciones:
    *
    * 1. Ingresar dinero a la cuenta
    * 2. Retirar dinero de la cuenta
    * 3. Salir
    * */

    public static void main(String[] args) {

        final int montoTotal = 1000;
        float ingresarDinero, retirarDinero;
        int opcion;


        System.out.println("Saldo: " + montoTotal + "\n");

        System.out.println("Menú de opciones: " + "\n 1. Consultar saldo" + "\n 2. Ingresar dinero" + "\n 3. Retirar " +
                "dinero" + "\n 4. Salir");

        System.out.println("Ingrese opción: ");
        Scanner data = new Scanner(System.in);
        opcion = data.nextInt();


        switch(opcion){

            case 1:
                System.out.println("Saldo disponible: " + montoTotal);
                break;
            case 2:
                System.out.println("Monto a ingresar: ");
                Scanner data2 = new Scanner(System.in);
                ingresarDinero = data.nextFloat();

                System.out.println("Monto ingresado");
                System.out.println("Saldo total: " + (montoTotal + ingresarDinero));
                break;
            case 3:
                System.out.println("Monto a retirar: ");
                Scanner data3 = new Scanner(System.in);
                retirarDinero = data3.nextFloat();

                if(retirarDinero > montoTotal){
                    System.out.println("Saldo no disponible");
                }else{
                    System.out.println("Retiro exitoso");
                    System.out.println("Saldo disponible: " + (montoTotal - retirarDinero));
                }
                break;

            case 4:
                System.out.println("Sesión finalizada");
                break;

            default:
                System.out.println("Opción incorrecta");
                break;

        }

    }
}
