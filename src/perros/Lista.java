
package perros;

import javax.swing.JOptionPane;

public class Lista {
    int suma;
    int resta;
    int multiplicacion;
    int division;
   
    public void suma(int numero1, int numero2){
        suma =numero1+numero2;
    }
    
    public void resta(int numero1, int numero2){
        resta =numero1-numero2;
    }
    
    public void multiplicacion(int numero1, int numero2){
        multiplicacion =numero1*numero2;
    }
    
    public void division(int numero1, int numero2){
        division =numero2/numero2;
    }
    public void mostrarResultado(){
        System.out.println("la suma es :"+suma);
        System.out.println("la resta es : "+resta);
        System.out.println("la multiplicacion es :"+multiplicacion);
        System.out.println("la divison es : "+division);
    }
}
