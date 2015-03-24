package cel_latino.dos;
import cel_latino.uno.Funciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Ing Diego Romero
 */
public class Main {

    public static void main(String[] args) {
        Funciones fun = new Funciones();
        //f.mayorMenorEdad();
        try {
            float p = Float.parseFloat(JOptionPane.showInputDialog("Ingrese promedio entre 0 y 10"));
            if (fun.validaPromedio(p)) {
//            if (fun.validaPromedio(p)==true) {
                JOptionPane.showMessageDialog(null, fun.procesPromedio(p));
            } else {
                JOptionPane.showMessageDialog(null, "Promedio ingresado no esta en el rango permitido");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar prmedio e fomato de número ejemplo 9.7");
        }
    }
}
