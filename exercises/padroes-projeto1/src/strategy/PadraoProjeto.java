package strategy;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class PadraoProjeto {
    
    public Investidor criarInvestidor(int opcao, int tempoInvestimento, double valorInvestimento) {
        if (opcao == 1) {
            return new Investidor(new Conservador(), tempoInvestimento, valorInvestimento);
        } else if (opcao == 2) {
            return new Investidor(new Moderado(), tempoInvestimento, valorInvestimento);
        } else {
            return new Investidor(new Arrojado(), tempoInvestimento, valorInvestimento);
        }
    }
    
    public static void main(String[] args) {
        String opcao = "Sim";
        Scanner ler = new Scanner(System.in);
        double valorInvestimento;
        int tempoInvestimento, tipoOpcao;
        
        do {
            System.out.print("Entre com o valor inicial do investimento: ");
            valorInvestimento = ler.nextDouble();
            System.out.print("Entre com o tempo (meses) da aplicação: ");
            tempoInvestimento = ler.nextInt();
            System.out.println("Escolha o tipo do investidor:\n" +
                "1 - Conservador\n" +
                "2 - Moderado\n" +
                "3 - Arrojado");
            System.out.print("Digite sua opção: ");
            tipoOpcao = ler.nextInt();
            ler.nextLine();
            Investidor investidor = null;
            
            switch (tipoOpcao) {
                case 1:
                    investidor = new Investidor(new Conservador(), tempoInvestimento, valorInvestimento);
                    break;
                case 2:
                    investidor = new Investidor(new Moderado(), tempoInvestimento, valorInvestimento);
                    break;
                default:
                    investidor = new Investidor(new Arrojado(), tempoInvestimento, valorInvestimento);
                    break;
            }
            
            System.out.printf("Valor final esperado: %.2f\n", investidor.calcularRendimento());
            System.out.print("Deseja realizar nova simulação?(Sim/Nao): ");
            opcao = ler.next();
        } while (opcao.equals("Sim"));
    }
}
