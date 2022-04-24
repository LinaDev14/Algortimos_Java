package EjerciciosBloqueTres;

import java.util.Scanner;

public class EjercicioCuatro {
    // TODO: 3/02/2022 En MegaPlaza se hace 20% de descuento a los clientes cuya compra supere los $300. ¿Cual sera la cantiddd que pagará una persona por su compra?

    public static void main(String[] args) {

        float compra, descuento = 0.2f, total, rebaja;

        System.out.println("Ingrese el total a pagar: ");
        Scanner data = new Scanner(System.in);
        compra = data.nextFloat();

        if(compra >= 300){
            // calculo de descuento
            rebaja = compra * descuento;
            total = compra - rebaja;
            System.out.println("El descuento es del: " + descuento + " total a pagar = " + total);

        }else{
            System.out.println("total a pagar = " + compra);
        }
    }
}
