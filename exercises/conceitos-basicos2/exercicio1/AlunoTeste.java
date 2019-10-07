package exercicio1;

import java.util.Scanner;

public class AlunoTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, categoria;
        int quantidade, nota;
        Aluno aluno;
        
        System.out.print("Digite o nome do aluno: ");
        nome = ler.nextLine();
        
        System.out.print("Insira a categoria do aluno (bolsista/nao bolsista): ");
        categoria = ler.nextLine();
        
        System.out.print("Entre com a quantidade de disciplinas cursadas: ");
        quantidade = ler.nextInt();
        
        aluno = new Aluno(nome, categoria, quantidade);
        
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Insira a nota na disciplina %d: ", i+1);
            nota = ler.nextInt();
            
            aluno.inserir_nota(nota);
        }
        
        System.out.println("############# RELATÓRIO FINAL #############");
        System.out.printf("Coeficiente de Rendimento: %.2f%n", aluno.retorna_coeficiente());
        System.out.printf("Situação final: %s%n", aluno.retorna_situacao());
    }
    
}
