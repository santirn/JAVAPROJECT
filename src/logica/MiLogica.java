/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Administracion;
import oovv.Administraciones;
import oovv.DatosAdministraciones;
import oovv.Ganadora;
import vista.CreaBoletosD;
import vista.PrincipalV;

/**
 *
 * @author Administrador
 */
public class MiLogica implements ActionListener {
    
    private Administraciones lasAdmin;
    private Ganadora ganadora;
    private PrincipalV ventana;
    
    public MiLogica() {
        lasAdmin = new Administraciones(DatosAdministraciones.creaAdministraciones());
        ventana = new PrincipalV();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "generaboletos":
                CreaBoletosLOG diag = new CreaBoletosLOG(ventana);
                int[] datos = diag.getDatos();
                if (datos != null) {
                    Administracion admin = lasAdmin.contiene(datos[0]);
                    if (admin != null) {
                        admin.generaBoletos(datos[1]);
                    } else {
                        JOptionPane.showMessageDialog(ventana, "el identificador de la administración no existe");
                    }
                }
                
                break;
            case "listaboletos":
                ventana.muestra(lasAdmin.listaBoletos());
                break;
            case "generaganadora":
                CreaGanadoraLOG diagg = new CreaGanadoraLOG(ventana);
                ganadora = diagg.getGanadora();
                break;
        }
    }
    
}
