package Exercicio2;

import java.util.Scanner;

public class TesteAgenda {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = -1;
        
        while (opcao != 0) {
            System.out.println("=== Sistema de Gerenciamento de Contatos ===");
            System.out.println("Entre com a opcao desejada:");
            System.out.println("[1] - Cadastrar contato");
            System.out.println("[2] - Remover contato");
            System.out.println("[3] - Exibir todos os contatos");
            System.out.println("[0] - Para sair");
            System.out.println("============================================");
            
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    int opcao_cadastro = -1;
                    Contato pessoa;
                    String nome, endereco, email, cpf_cnpj;
                    
                    while (opcao_cadastro != 0) {
                        System.out.println("=== Cadastro de contatos ===");
                        System.out.println("Entre com a opcao desejada:");
                        System.out.println("[1] - Pessoa Fisica");
                        System.out.println("[2] - Pessoa Juridica");
                        System.out.println("[0] - Para sair");
                        System.out.println("============================");
                        
                        opcao_cadastro = ler.nextInt();
                        
                        switch (opcao_cadastro) {
                            case 1:
                                String estado_civil;
                                
                                // O seguinte nextLine e usado para consumir o \n
                                // Isso e feito por causa que antes e usado um nextInt
                                ler.nextLine();
                                
                                System.out.print("Entre com o nome: ");
                                nome = ler.nextLine();
                                
                                System.out.print("Entre com o endereco: ");
                                endereco = ler.nextLine();
                                
                                System.out.print("Entre com o email: ");
                                email = ler.next();
                                
                                System.out.print("Entre com o CPF: ");
                                cpf_cnpj = ler.next();
                                
                                System.out.print("Entre com o estado civil: ");
                                estado_civil = ler.next();
                                
                                pessoa = new PessoaFisica(nome, endereco, email, cpf_cnpj, estado_civil);
                                
                                agenda.adicionar_contato(pessoa);
                                break;
                            case 2:
                                int inscricao_estadual;
                                
                                // O seguinte nextLine e usado para consumir o \n
                                // Isso e feito por causa que antes e usado um nextInt
                                ler.nextLine();
                                
                                System.out.print("Entre com o nome: ");
                                nome = ler.nextLine();
                                
                                System.out.print("Entre com o endereco: ");
                                endereco = ler.nextLine();
                                
                                System.out.print("Entre com o email: ");
                                email = ler.next();
                                
                                System.out.print("Entre com o CNPJ: ");
                                cpf_cnpj = ler.next();
                                
                                System.out.print("Entre com a inscricao estadual: ");
                                inscricao_estadual = ler.nextInt();
                                
                                pessoa = new PessoaJuridica(nome, endereco, email, cpf_cnpj, inscricao_estadual);
                                
                                agenda.adicionar_contato(pessoa);
                                break;
                            case 0:
                                System.out.println("Cadastro de contatos finalizado.");
                                break;
                            default:
                                System.out.println("Opcao nao cadastrada. Tente novamente.");
                        }
                    }
                    break;
                case 2:
                    String removido;
                    
                    System.out.println("=== Remocao de contatos ===");
                    System.out.print("Entre com o CPF ou CNPJ que deseja remover: ");
                    
                    removido = ler.next();
                    
                    agenda.remover_contato(removido);
                    break;
                case 3:
                    agenda.exibir_contatos();
                    break;
                case 0:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("Opção não cadastrada. Tente novamente.");
            }
        }
    }
}
