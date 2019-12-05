package br.com.ExerciciosLista;

import java.util.HashSet;
import java.util.Set;

public class ListaDois {
    public static void main(String[] args) {
        Set<String> listaSet = new HashSet<>();

        listaSet.add("Inghridy");
        listaSet.add("Santos");
        listaSet.add("Bittencourt");

        System.out.println("---- Sem remoção ----");
        for (String valores : listaSet) {
            System.out.println(valores);
        }

        listaSet.remove("Bittencourt");

        System.out.println("---- Com remoção ----");
        for (String valores : listaSet) {
            System.out.println(valores);
        }

    }
}
