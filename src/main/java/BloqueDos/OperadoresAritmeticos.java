package BloqueDos;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // Operadores aritméticos

        Scanner data = new Scanner(System.in);

        System.out.println("Ingresa dos numeros: ");


        // variables
        float num1, num2,suma,resta,div,mult,resto;

        num1 = data.nextFloat();
        num2 = data.nextFloat();

        //suma
        suma = num1 + num2;
        System.out.println("La suma es = " + suma);

        //resta
        resta = num1 - num2;
        System.out.println("La resta es = " + resta);

        //div
        div = num1 / num2;
        System.out.println("La división es = " + div);

        //mult
        mult = num1 * num2;
        System.out.println("La multiplicación es = " + mult);

        //resto
        resto = num1 % num2;
        System.out.println("El esto es = " + resto);
    }
}
