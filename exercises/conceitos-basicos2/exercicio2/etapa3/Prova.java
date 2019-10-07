package questao;

import java.util.Scanner;

public class Prova {
    private Questao[] questao;

    public Prova() {
        questao = new Questao[5];
        for (int i = 0; i < 5; i++) {
            questao[i] = new Questao();
        }
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
            } else {
                System.out.printf("Você tentou %d vez(es) e errou a questão.%n", contador);
            }
        }
    }
}
