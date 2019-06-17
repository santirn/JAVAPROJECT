/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class Boleto extends Primitiva {

    private int reintegro;
    private int numSerie;

    public Boleto(int reintegro) {
        this.reintegro = reintegro;
        numSerie = Administraciones.getNumSerieBoleto();
    }

    public String getNumeros() {
        return super.toString() + "(" + reintegro + ")";
    }

    @Override
    public String toString() {
        return getNumeros() + " serie: " + numSerie;
    }

}
