package EjerciciosPractica;

/*
* Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, más una
* comisión de $150 por cada vendido, mas el 5% del valor de la venta por carro. Cada mes el capturista de la empresa
* ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un
* vendedor dado.
* */

import java.util.Scanner;

public class EjercicoCuatro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int salario = 1000;
        int numeroCarrosVendidos;
        float costoCarro, salarioTotal;

        System.out.println("Total carros vendidos: ");
        numeroCarrosVendidos = entrada.nextInt();

        System.out.println("Costo del carro: ");
        costoCarro = entrada.nextFloat();

        salarioTotal = salario + (numeroCarrosVendidos * 150) + (0.05f * numeroCarrosVendidos * numeroCarrosVendidos);

        System.out.println("\n El salario total del empleado es: " + salarioTotal);



    }
}
