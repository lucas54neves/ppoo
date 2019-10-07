package exercicio2;

import java.util.Scanner;

public class Prova {
    private Questao questao;

    public Prova() {
        questao = new Questao();
    }
    
    public void aplicar() {
        Scanner ler = new Scanner(System.in);
        int resposta;
        
        System.out.println(questao.consultar_enunciado());
        resposta = ler.nextInt();
        if (questao.resposta_aluno(resposta)) {
            System.out.println("Muito bem, você acertou!");
        } else {
            System.out.println("Infelizmente você errou!");
        }
    }
}
