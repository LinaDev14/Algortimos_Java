package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioDiez {

    /*
    * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años
    *  bisiestos
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


        if( anio == 0){
            System.out.println("El año " + anio + " es incorrecto");
        }else if((mes == 2) && (dia >= 1 && dia <=28)){
            System.out.println("La fecha es correcta");
        }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)){
            System.out.println("Fecha correcta");
        }else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)){
            System.out.println("Fecha correcta");
        }else{
            System.out.println("Fecha incorrecta");
        }
    }
}
