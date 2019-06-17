/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrador
 */
public class Primitiva {

    private ArrayList<Integer> los6numeros;

    public Primitiva() {
        los6numeros = new ArrayList<>();
        int cont = 0;
        while (cont < 6) {
            int num = (int) (1 + Math.random() * 49);
            if (!los6numeros.contains(num)) {
                los6numeros.add(num);
                cont++;
            }
        }
        Collections.sort(los6numeros);
    }

    public Primitiva(ArrayList<Integer> los6numeros) {
        if (los6numeros.size() != 6) {
            throw new IllegalArgumentException("el número de valores en la lista debe ser 6");
        }
        Set<Integer> tmp = new HashSet<Integer>(los6numeros);
        if (tmp.size() != 6) {
            throw new IllegalArgumentException("los valores no deben repetirse");
        }
        for (Integer num : los6numeros) {
            if (num < 1 || num > 49) {
                throw new IllegalArgumentException("los valores están entre 1 y 49");
            }
        }
        this.los6numeros = los6numeros;
        Collections.sort(los6numeros);
    }

    public int getAciertos(Primitiva ganadora) {
        Set<Integer> tmp = new HashSet<Integer>(this.los6numeros);
        tmp.addAll(ganadora.los6numeros);
        return 12 - tmp.size();
    }
    
    public boolean contiene(int complementario){
        return los6numeros.contains(complementario);
    }

    @Override
    public String toString() {
        return los6numeros.toString();
    }

}
