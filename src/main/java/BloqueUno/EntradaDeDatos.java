package BloqueUno;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {

        // Scanner
        //System.in -> entrada de datos
        System.out.println("Ingresa un número: ");
        Scanner scanner = new Scanner(System.in);

        //Integer.parseInt -> Convierte una cadena de texto en un número entero
        // Integer.parseInt()

        // nextInt() -> Números enteros
        int numero = (scanner.nextInt());
        System.out.println("numero = " + numero);

        
        // guardar un float
        // Se debe ingresar el número flotante con una coma (,)
        System.out.println("Ingresa un numero flotante: ");
        Scanner data = new Scanner(System.in);
        float num =  data.nextFloat();
        System.out.println("num = " + num);
        
        // guardar un double
        System.out.println("Ingresa un número: ");
        Scanner data2 = new Scanner(System.in);
        double num2 = data2.nextDouble();
        System.out.println("num2 = " + num2);

        // Cadenas de texto
        System.out.println("Ingrese una cadena");
        Scanner cadena = new Scanner(System.in);
        // el next() solo guarda una cadena hasta que encuentre un espacio
        String mensaje = cadena.next();
        System.out.println("mensaje = " + mensaje);

        //cadenas completas (nextLine());

        //guardar un solo caracter
        System.out.println("Ingresa un caracter");
        Scanner cadena2 = new Scanner(System.in);
        char letra = cadena2.next().charAt(0);
        System.out.println("letra = " + letra);
    }
}
