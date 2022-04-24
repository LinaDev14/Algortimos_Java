package EjerciciosPractica;

import java.util.Scanner;

public class EjercicioDos {

    /*
    * Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales
    * trabajadas y de su salario por hora.
    * */

    public static void main(String[] args) {
        // horas trabajadas
        System.out.println("Ingrese numero de horas de trabajo diario ");
        Scanner data = new Scanner(System.in);
        int trabajoHoras = data.nextInt();

        // pago por hora
        System.out.println("Ingrese el valor de su salario por hora: ");
        Scanner data2 = new Scanner(System.in);
        float salarioHora = data2.nextFloat();

        //Operación
        float salarioSemanal = ((trabajoHoras * 5) * salarioHora);

        System.out.println("salarioSemanal = " + "$" + salarioSemanal);

    }


}
