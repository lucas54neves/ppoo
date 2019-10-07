package questao2;

import java.util.Scanner;

public class Prova {
    private Questao[] questao;
    private Correcao[] correcoes;

    public Prova() {
        questao = new Questao[5];
        for (int i = 0; i < 5; i++) {
            questao[i] = new Questao();
        }
        correcoes = new Correcao[5];
    }
    
    public void aplicar() {
        System.out.println("Entra no aplicar");
        Scanner ler = new Scanner(System.in);
        int resposta, contador;
        
        for (int i = 0; i < 5; i++) {
            contador = 1;
            
            System.out.printf("Questão %d%n", questao[i].retorna_id());
            System.out.println(questao[i].consultar_enunciado());
            resposta = ler.nextInt();
            if (questao[i].resposta_aluno(resposta)) {
                System.out.println("Muito bem, você acertou!");
            } else {
                while ((!questao[i].resposta_aluno(resposta)) && contador < 4) {                
                    System.out.println("Infelizmente você errou!");
                    System.out.println( "Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                    resposta = ler.nextInt();
                    contador++;
                }
            }

            if (questao[i].resposta_aluno(resposta)) {
                System.out.printf("Você tentou %d vez(es) e acertou a questão.%n", contador);
                correcoes[i] = new Correcao("acertou", contador);
            } else {
                System.out.printf("Você tentou %d vez(es) e errou a questão.%n", contador);
                correcoes[i] = new Correcao("errou", contador);
            }
        }
    }
    
    public void gerar_relatorio() {
        System.out.println("Questão Situação    Quantidade tentativas");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d   %s  %d%n", i+1, correcoes[i].getSituacao(), correcoes[i].getQuantidade());
        }
    }
}
