/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.List;

/**
 *
 * @author Administrador
 */
public class Administraciones {

    private List<Administracion> lasAdministraciones;
    private static int serieBoleto;
    private int idAdministracion;


    public Administraciones(List<Administracion> lasAdministraciones) {
        this.lasAdministraciones = lasAdministraciones;
        idAdministracion = lasAdministraciones.size()+1;
        serieBoleto = 1;
    }

    
    
    public static int getNumSerieBoleto() {
        int num = serieBoleto;
        serieBoleto++;
        return num;
    }

    public Administracion contiene(int idAdmin) {
        for (Administracion unaAdministracion : lasAdministraciones) {
            if (unaAdministracion.getId() == idAdmin) {
                return unaAdministracion;
            }
        }
        return null;
    }

    public String listaBoletos() {
        String lista = "Lista de los boletos\n---------------------------\n";
        for (Administracion unaAdministracion : lasAdministraciones) {
            lista += unaAdministracion.listaBoletos();
        }
        
        return lista;
    }

    
    
    
    
    
    
    
}
