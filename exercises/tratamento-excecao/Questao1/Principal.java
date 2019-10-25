import java.util.Scanner;

public class Principal{
    private static Agencia ag;

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ag = new Agencia("0364-6","Campus UFLA");
        int opcao;

        do{
            exibirMenu();
            opcao = entrada.nextInt();
            executarOpcao(opcao);
        } while(opcao != 6);
    }

    private static void exibirMenu(){
        System.out.println("=======MENU=======");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Gerar relatorio");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5- Transferir");
        System.out.println("6 - Sair\n");
        System.out.print("Digite sua opcao: ");
    }
  
    private static void executarOpcao(int opcao){
        switch(opcao){
            case 1:
                criarConta();
                break;
            case 2:
                gerarRelatorio();
                break;
            case 3:
                depositar();
                break;
            case 4:
                sacar();
                break;
            case 5:
                transferir();
                break;
            case 6://sair
                break;
            default: 
                System.out.println("Opção inválida!");
        }
    }
  
    private static void criarConta(){
        ag.criarConta();
    }

    private static void gerarRelatorio(){
        System.out.println(ag.getRelatorio());
    }

    private static void depositar(){
        ag.depositar(pedirContaDestino(),pedirValor());
    }

    private static void sacar(){
        ag.sacar(pedirContaDestino(),pedirValor());
    }

    private static void transferir(){
        ag.transferir(pedirContaOrigem(),pedirContaDestino(),pedirValor());
    }
  
    private static int pedirContaOrigem(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero da conta de origem: ");
        return entrada.nextInt();
    }

    private static int pedirContaDestino(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero da conta de destino: ");
        return entrada.nextInt();
    }
  
    private static double pedirValor(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        return entrada.nextDouble();
    }
}