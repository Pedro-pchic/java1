
package perros;

import javax.swing.JOptionPane;

public class operacion {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero : "));
        
        Lista op = new Lista ();
        
        op.suma(n1, n2);
        op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.division(n1, n2);
        
        op.mostrarResultado();
    }
    
}
