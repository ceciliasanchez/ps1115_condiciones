package cel_latino.uno;

import javax.swing.JOptionPane;

/**
 *
 * @author Ing. Diego Romero
 */
public class Funciones {

    public void mayorMenorEdad() {
        try {
            String x = JOptionPane.showInputDialog("Ingrese edad");
            int edad = Integer.parseInt(x);
            if (edad >= 18) {
                JOptionPane.showMessageDialog(null, "Mayor");
            } else {
                JOptionPane.showMessageDialog(null, "Menor");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debee ingresar su edad en años cumplidos");
        }
    }

    public boolean validaPromedio(float p) {
        if (p >= 0 && p <= 10) {
            return true;
        } else {
            return false;
        }
        // return p >= 0 && p <= 10;
    }

    public String procesPromedio(float p) {
        if (p >= 7) {
            return "Aprobado";
        }
        return "Reprobado";
    }
}
