package questao;

import java.util.Scanner;

public class Prova {
    private Questao questao;

    public Prova() {
        questao = new Questao();
    }
    
    public void aplicar() {
        Scanner ler = new Scanner(System.in);
        int resposta, contador = 1;
        
        System.out.println(questao.consultar_enunciado());
        resposta = ler.nextInt();
        if (questao.resposta_aluno(resposta)) {
            System.out.println("Muito bem, você acertou!");
        } else {
            while ((!questao.resposta_aluno(resposta)) && contador < 4) {                
                System.out.println("Infelizmente você errou!");
                System.out.println( "Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resposta = ler.nextInt();
                contador++;
            }
        }
        
        if (questao.resposta_aluno(resposta)) {
            System.out.printf("Você tentou %d vez(es) e acertou a questão.%n", contador);
        } else {
            System.out.printf("Você tentou %d vez(es) e errou a questão.%n", contador);
        }
    }
}
