package BloqueTres;

import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {
        
        int numero;
        String mensaje;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        mensaje = (numero % 2 == 0) ? "El numero es par" : "El numero no es par";

        //JOptionPane.showMessageDialog(null, (numero % 2 == 0) ? "El numero es par" : "El numero no es par");
        JOptionPane.showMessageDialog(null,mensaje);
        
    }
}
