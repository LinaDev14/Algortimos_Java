package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioNueve {

    /*
    * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. suponiendo que todos los meses son de
    * 30 días
    * */
    public static void main(String[] args) {

        int dia, mes, anio;

        System.out.println("Ingresa un día: ");
        Scanner data1 = new Scanner(System.in);
        dia = data1.nextInt();

        System.out.println("Ingresa un mes: ");
        Scanner data2 = new Scanner(System.in);
        mes = data2.nextInt();

        System.out.println("Ingresa un año: ");
        Scanner data3 = new Scanner(System.in);
        anio = data3.nextInt();


        if((dia  >=  1) && (dia <= 30)){ // Sí el día es correcto
            if((mes >= 1) && (mes <= 12)){ // Sí el mes es correcto
                if((anio != 0)){ // Sí el año es correcto
                    System.out.println("La Fecha: " + dia + "/" + mes + "/" + anio +  " es correcta");
                }else{
                    System.out.println("Fecha incorrecta, año incorrecto");
                }

            }else{
                System.out.println("Fecha incorrecta, Mes incorrecto");
            }

        }else{
            System.out.println("La fecha es incorrecta, día incorrecto");
        }


    }
}
