package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ing. Diego Romero
 */
public class TestMain {

    public static void main(String[] args) {
        TestMain T = new TestMain();
        try {
            Date fechaActual = new Date();
            String fechaActualFor = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fechaActual);
            String fechaHoraIng = JOptionPane.showInputDialog("<html><h1>Ingrese fecha en el formato(yyyy-MM-dd HH:mm:ss):</h1></html>", fechaActualFor);
            Date fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(fechaHoraIng);
//            System.out.println(fechaHora.getTime());
            fechaActual = new Date();
            fechaActualFor = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fechaActual);
            long milSec = T.sumarHoras(fechaActual, fechaHora);
            JOptionPane.showMessageDialog(null, "Actual: " + fechaActualFor + "\nIngresada: " + fechaHoraIng + "\nHan pasado:"
                    + milSec + " milisegundos\n" + "Tiempo: " + T.formatoHoras(milSec));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Fecha erronea");
        }
    }

    public String saludar() {
        Date d = new Date();
        int horas = d.getHours();
        if (horas < 12) {
            return "Buenos días";
        } else if (horas >= 18) {
            return "Buenos noches";
        }
        return "Buenas tardes";
    }

    public String fechaHoraActual() {
        return formatoFechaHora(new Date());
    }

    public long sumarHoras(Date d1, Date d2) {
        return d1.getTime() - d2.getTime();
    }

    public String formatoFechaHora(Date d) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
    }

    public String formatoHoras(long t) {
        long h = t / 3600000;
        t = t % 3600000;
        long m = t / 60000;
        t %= 60000;
        long s = t / 1000;
        t %= 1000;
        return h + ":" + m + ":" + s + ":" + t;
    }
}
