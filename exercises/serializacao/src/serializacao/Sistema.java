package serializacao;

import serializacao.ManipuladorArquivoBinario;
import serializacao.DiarioClasse;
import java.util.Scanner;

public class Sistema {
    private DiarioClasse dados;

    public Sistema() {
        dados = new DiarioClasse();
    }
    
    public void menu() {
        System.out.println("1 - Inserir aluno");
        System.out.println("2 - Gerar relatório na tela");
        System.out.println("3 - Gravar relatório dos dados dos alunos em arquivo de texto");
        System.out.println("4 - Ler dados dos alunos de arquivo de texto");
        System.out.println("5 - Salvar em arquivo binário");
        System.out.println("6 - Ler de arquivo binário");
        System.out.println("7 - Sair");
    }
    
    public void abrir() {
        Scanner ler = new Scanner(System.in);
        int opcao = -1;
        String nomeArquivo;
        
        while (opcao != 7) {
            menu();
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    String matricula, nome;
                    int nota;
                    
                    System.out.println("### Cadastro de aluno ###");
                    
                    System.out.println("Entre com a matrícula");
                    matricula = ler.next();
                    
                    System.out.println("Entre com o nome");
                    nome = ler.next();
                    
                    System.out.println("Entre com a nota");
                    nota = ler.nextInt();
                    ler.nextLine();
                    
                    dados.inserirAluno(matricula, nome, nota);
                    break;
                case 2:
                    dados.gerarRelatorio();
                    break;
                case 3:                    
                    System.out.println("### Gravação de dados em arquivo texto ###");
                    
                    System.out.println("Entre com o nome do arquivo");
                    nomeArquivo = ler.next();
                    
                    dados.gravacaoTexto(nomeArquivo);
                    break;
                case 4:
                    System.out.println("### Leitura de dados em arquivo texto ###");
                    
                    System.out.println("Entre com o nome do arquivo");
                    nomeArquivo = ler.next();
                    
                    dados.leituraTexto(nomeArquivo);
                    break;
                case 5:
                    System.out.println("### Gravação de dados em arquivo binário ###");
                    
                    System.out.println("Entre com o nome do arquivo");
                    nomeArquivo = ler.next();
                    
                    ManipuladorArquivoBinario.gravacaoBinario(dados, nomeArquivo);
                    break;
                case 6:
                    System.out.println("### Leitura de dados em arquivo binário ###");
                    
                    System.out.println("Entre com o nome do arquivo");
                    nomeArquivo = ler.next();
                    
                    dados = ManipuladorArquivoBinario.leituraBinario(nomeArquivo);
                    break;
                case 7:
                    System.out.println("Sistema finalizado");
                    break;
                default:
                    break;
            }
        }
    }
}
