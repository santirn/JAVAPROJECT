/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Ganadora;
import vista.CreaBoletosD;
import vista.CreaGanadoraD;
import vista.PrincipalV;

/**
 *
 * @author Administrador
 */
public class CreaGanadoraLOG implements ActionListener {

    private CreaGanadoraD ventana;
    private Ganadora ganadora;

    public CreaGanadoraLOG(PrincipalV parent) {
        ventana = new CreaGanadoraD(parent, true);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(parent);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "valida":
                    ganadora = ventana.getGanadora();
                    ventana.dispose();
                    break;
                case "cancela":
                    ganadora = null;
                    ventana.dispose();
                    break;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ventana, "los valores deben ser enteros");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(ventana, ex.getMessage());
        }
    }

    public Ganadora getGanadora() {
        return ganadora;
    }

}
