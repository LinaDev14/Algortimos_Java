package BloqueUno;

public class VariablesYTipos {
    
    // Una variable es un espacio en memoria en el cual almacenamos un valor

    // VARIABLES PRIMITIVAS
    
    /*
    * Variables más conocidas en Java
    * byte -> Tamaño (8 bits)
    * */

    public static void main(String[] args) {

        // ENTEROS 
        // Tipo byte
        byte entero = 12;
        System.out.println("entero = " + entero);
        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Byte.MIN_VALUE); // -128

        // Tipo short
        short entero1 = 13;
        System.out.println("entero1 = " + entero1);
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768

        // Tipo int
        int numero = 1245;
        System.out.println("numero = " + numero);
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        // Tipo long
        long numero1 = 13567;
        System.out.println("numero1 = " + numero1);
        System.out.println(Long.MAX_VALUE); // 9223372036854775807
        System.out.println(Long.MIN_VALUE); // -9223372036854775808

        // FLOTANTES

        // Debemos poner f (float) a los números con punto decimal
        float decimal = 3.166f;
        System.out.println("decimal = " + decimal);

        // variable de tipo caracter (char)

        char caracter = 'a';
        System.out.println("caracter = " + caracter);

        // BOOLEAN
        
        boolean decision = false;
        System.out.println("decision = " + decision);
        
    }
    }



