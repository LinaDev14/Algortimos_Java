package EjerciciosPractica;

/*
* La calificación final de un estudiante de informática se calcula con base a las calificaciones de cuatro aspectos
* de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final. Sabiendo
* que las calificaciones entran a la calificación final con ponderaciones del 10%, 25%, 25%, y 40%, hacer un programa
* que calcule e imprima la calificación final obtenida por un estudiante
* */

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {

        float primerExa, participacion, segundoExa, examenFinal, notaFinal;

        Scanner notas = new Scanner(System.in);

        // Pedir los datos necesarios
        System.out.println("Ingrese nota primer Examen: ");
        primerExa = notas.nextFloat();

        System.out.println("Ingrese nota segundo Examen: ");
        segundoExa = notas.nextFloat();

        System.out.println("Ingrese nota por participacion: ");
        participacion = notas.nextFloat();

        System.out.println("Ingrese nota examen final: ");
        examenFinal = notas.nextFloat();

        System.out.println("\n Notas registradas: ");
        System.out.println("\n examen 1 = " + primerExa + "\n examen 2 = " + segundoExa + "\n paticipacion = " + participacion + "\n examen final = " + examenFinal  );

        notaFinal = (participacion * 0.1f) + (primerExa * 0.25f) + (segundoExa * 0.25f) + (examenFinal * 0.4f);

        System.out.println("Nota final = " + notaFinal);
    }


}
