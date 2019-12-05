package br.com.ExerciciosLista;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListasE02 {

    List<Integer> lista = new ArrayList<>();
    Set<Integer> conjunto = new HashSet<>();

    public void retornaLista (){
        this.lista.add(1);
        this.lista.add(5);
        this.lista.add(5);
        this.lista.add(6);
        this.lista.add(7);
        this.lista.add(8);
        this.lista.add(8);
        this.lista.add(8);

        System.out.println(this.lista.toString());

    }

    public void retornaConjunto(){
        this.conjunto.add(1);
        this.conjunto.add(5);
        this.conjunto.add(5);
        this.conjunto.add(6);
        this.conjunto.add(7);
        this.conjunto.add(8);
        this.conjunto.add(8);
        this.conjunto.add(8);

        System.out.println(this.conjunto.toString());
    }

}

