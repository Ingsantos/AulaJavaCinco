package br.com.ExerciciosLista;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

    Map<Integer, List<Peca>> listaComLocalizador = new HashMap<>();
    Integer contador = 0;

    public Integer guardarPecas(List<Peca> listaDePeca){

        this.contador++;
        this.listaComLocalizador.put(contador, listaDePeca);

        return contador;
    }

    public void mostrarPecas(){



    }


}
