package EjerciciosPractica;

/*
* Construir un programa que, dado un número total de horas, devuelva el numero de semanas, dias y horas equivaletes.
* por ejemplo: dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
* */

import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int horasTotales, semanas, dias, horas;
        System.out.println("Ingresa el numero de horas");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168;
        dias = horasTotales % 168 / 24;
        horas = horasTotales % 24;

        System.out.println("Equivalente es: \n ");
        System.out.println("Semanas: " + semanas);
        System.out.println("dias: " + dias);
        System.out.println("horas: " + horas);

    }

}
