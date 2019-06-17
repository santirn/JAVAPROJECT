/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.CreaBoletosD;
import vista.PrincipalV;

/**
 *
 * @author Administrador
 */
public class CreaBoletosLOG implements ActionListener {

    private CreaBoletosD ventana;
    private int[] datos;

    public CreaBoletosLOG(PrincipalV parent) {
        ventana = new CreaBoletosD(parent, true);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(parent);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "valida":
                    datos = new int[2];
                    datos[0] = ventana.getIdAdminitracion();
                    datos[1] = ventana.getNumboletos();
                    if (datos[1] < 1) {
                        JOptionPane.showMessageDialog(ventana, "el número de boletos debe ser 1 o mayor");
                    } else {
                        ventana.dispose();
                    }
                    break;
                case "cancela":
                    datos = null;
                    ventana.dispose();
                    break;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ventana, "los valores deben ser enteros");
        }
    }

    public int[] getDatos() {
        return datos;
    }

}
