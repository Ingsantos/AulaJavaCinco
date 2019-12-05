package br.com.ExerciciosLista;

import java.util.HashMap;
import java.util.Map;

public class ListaTres {

    public static void main(String[] args) {

        Map<Integer, String> listaMap = new HashMap<>();

        listaMap.put(4, "Inghridy");
        listaMap.put(2, "Santos");
        listaMap.put(3, "Bittencourt");

        System.out.println("---- Sem remoção ----");

        for(Integer chave: listaMap.keySet()){
            System.out.println(listaMap.get(chave));
        }

        listaMap.remove(3);

        System.out.println("---- Com remoção ----");

        for(Integer chave: listaMap.keySet()){
            System.out.println(listaMap.get(chave));
        }
    }
}
