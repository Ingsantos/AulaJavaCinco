package br.com.ExerciciosLista;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E03 {
    public static void main(String[] args) {

        Prova teste = new Prova();

        Set<Integer> lista = new HashSet<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        teste.somaTotal(lista);
    }
}
