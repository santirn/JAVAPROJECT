/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Ganadora extends Primitiva {

    private int complementario;
    private int reintegro;

    public Ganadora() {
        reintegro = (int) (Math.random() * 10);
        do {
            complementario = (int) (1 + Math.random() * 49);
        } while (contiene(complementario));
    }

    public Ganadora(ArrayList<Integer> los6numeros, int complementario, int reintegro) {
        super(los6numeros);
        if (reintegro < 0 || reintegro > 9) {
            throw new IllegalArgumentException("el reintegro está entre 0 y 9");
        }
        if (complementario < 1 || complementario > 49) {
            throw new IllegalArgumentException("el complementario está entre 1 y 49");
        }
        if (contiene(complementario)) {
            throw new IllegalArgumentException("el complementario no debe repetirse");
        }
        this.complementario = complementario;
        this.reintegro = reintegro;
    }

}
