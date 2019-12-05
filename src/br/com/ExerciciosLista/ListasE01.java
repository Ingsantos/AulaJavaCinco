package br.com.ExerciciosLista;

import sun.util.resources.cldr.te.LocaleNames_te;

import java.util.HashMap;
import java.util.Map;

public class ListasE01 {

    Map<Integer, String> loteriaDosSonhos = new HashMap<>();
    Map<String, String> apelidos = new HashMap<>();

    public void imprimirListas() {

        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        apelidos.put("João", "Juan, Fissura, Maromba");
        apelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        apelidos.put("Maria", "Wonder Woman, Mary, Marilene");
        apelidos.put("Lucas", "Lukinha, Jorge, George");

        System.out.println("--- Imprimindo lista 'Loteria dos Sonhos' ---");

        for (Integer chave : loteriaDosSonhos.keySet()) {
            System.out.println(chave + " " + loteriaDosSonhos.get(chave));
        }

        System.out.println("\n--- Imprimindo lista 'Apelidos' ---");

        for (String chave : apelidos.keySet()) {
            System.out.println(chave + " " + apelidos.get(chave));
        }
    }
}
