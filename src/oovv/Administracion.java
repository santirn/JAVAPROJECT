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
public class Administracion {

    private int id;
    private String nombre;
    private List<Boleto> boletos;

    public Administracion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.boletos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void generaBoletos(int numBoletos) {
        while (numBoletos > 0) {
            boletos.add(new Boleto((int) (Math.random() * 10)));
            numBoletos--;
        }
    }

    public String listaBoletos() {
        if (boletos.isEmpty()) {
            return "";
        }
        String lista = "\n" + nombre + "\n";
        int cont = 1;
        for (Boleto unBoleto : boletos) {
            lista += String.format("%-30s", unBoleto.getNumeros()) + (cont++ % 3 == 0 ? "\n" : " ");
        }
        return lista;
    }

}
