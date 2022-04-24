package BloqueDos;

public class MetodosMa {
    public static void main(String[] args) {

        /*
        No se puede poner el nombre de los métodos como el nombre de la clase, en el caso de que la clase se llame
        Math, debemos ante poner en el método, el java.lang.Math, ya que de lo contrario entrará en conflicto.
        */

        /*
        * Los métodos debes asignarse a un double
        * */
        
        // raíz cuadrada
        double raiz = Math.sqrt(9);
        System.out.println("raiz = " + raiz);
        
        //Potencia
        double base = 5, exponente = 2;
        double potencia = Math.pow(base, exponente);
        System.out.println("potencia = " + potencia);
        
        //redondear un número
        /*
        * Si se utiliza un double, el resultado debe ser long
        * Si se utiliza float, el resultado debe ser int
        */
        double numero = 4.56;
        long res =  Math.round(numero);
        System.out.println("res = " + res);

        // número aleatorio
        double ram = Math.floor(Math.random() * 10);
        System.out.println("ram = " + ram);


    }
}
