package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioCinco {
    // TODO: 3/02/2022 Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
    // TODO: 3/02/2022 Si trabaja 40 horas o menos se le paga $16 por hora
    // TODO: 3/02/2022 Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra

    public static void main(String[] args) {

        int horasTrabajadas;
        float salarioTotal;

        System.out.println("Ingrese numero de horas trabajadas: ");
        Scanner data = new Scanner(System.in);
        horasTrabajadas = data.nextInt();

        if(horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
        }else{
            salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);
        }

        System.out.println("Salario total es = " + salarioTotal + "$");
    }
}
