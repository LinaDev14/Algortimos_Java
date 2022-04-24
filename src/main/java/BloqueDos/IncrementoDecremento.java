package BloqueDos;

public class IncrementoDecremento {
    public static void main(String[] args) {
        
        // Incremento
        int x = 5;

        // operador post incremento
        x++;

        // operador post decremento
        x--;
        System.out.println("x = " + x);

        int y = 5;
        int w;

        w = y++; // primero lo asigna y después lo aumenta
        // w = ++y primero lo aumenta y después lo asigna
        /*
        * sufijo x++
        * prefijo --x
        * */
        System.out.println("w = " + w);
        System.out.println("y = " + y);

    }
}
