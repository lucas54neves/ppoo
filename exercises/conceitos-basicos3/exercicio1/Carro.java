package Exercicio1;

import java.util.ArrayList;

public class Carro {
    private String modelo;
    private ArrayList<Integer> acessorios;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.acessorios = new ArrayList<Integer>();
    }
    
    public String retorna_modelo() {
        return modelo;
    }
    
    public int retorna_quantidade_acessorios() {
        return acessorios.size();
    }
    
    public int retorna_codigo(int posicao) {
        return acessorios.get(posicao);
    }
    
    public void insere_acessorio(int acessorio) {
        this.acessorios.add(acessorio);
    }
}
