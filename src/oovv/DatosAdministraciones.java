/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class DatosAdministraciones {
    
    
   
    static String[] nombres ={"La bruja de oro",
        "Bello","La nº 13","La suerte","Taechada","Sueños",
        "el gato negro","el lagarto","La fortuna",
        "La coja","el enano","La flauta"
        
    };
    
    public static  List<Administracion> creaAdministraciones(){
        List<Administracion> lista = new ArrayList<>();
        for (int i = 0; i < nombres.length; i++) {
            lista.add(new Administracion(i+1, nombres[i]));
        }
        return lista;
    }
    
}
