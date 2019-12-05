package br.com.ExerciciosLista;

import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;

        System.out.print("O conjunto possui os seguintes valores: ");
        for (Integer deInteiro : conjuntoDeInteiros) {
            soma += deInteiro;
            System.out.print(deInteiro+", ");
        }


        System.out.println("\nA soma total dos valores passados é: " + soma);
    }
}
