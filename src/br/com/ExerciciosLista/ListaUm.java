package br.com.ExerciciosLista;

import java.util.ArrayList;
import java.util.List;

public class ListaUm {

    public static void main(String[] args) {

        List<String> listaList = new ArrayList<>();

        listaList.add("Inghridy");
        listaList.add("Santos");
        listaList.add("Bittencourt");

        System.out.println("---- Sem remoção ----");

        for (String valores : listaList) {
            System.out.println(valores);

        }

        listaList.remove(0);

        System.out.println("---- Com remoção ----");

        for (String valores : listaList) {
            System.out.println(valores);

        }
    }


}
