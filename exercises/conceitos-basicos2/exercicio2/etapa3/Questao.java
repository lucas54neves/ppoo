package questao;

import java.util.Random;

public class Questao {
    private int id;
    private String enunciado;
    private int resposta;
    private static int contador;

    public Questao() {
        Random gerador = new Random();
        int num1 = gerador.nextInt(10);
        int num2 = gerador.nextInt(10);
        enunciado = "Quanto é " + num1 + " * " + num2 + "?";
        resposta = (num1 * num2);
        contador++;
        id = contador;
    }
    
    public String consultar_enunciado() {
        return enunciado;
    }
    
    public boolean resposta_aluno(int resposta) {
        return this.resposta == resposta;
    }

    public int retorna_id() {
        return id;
    }
}
