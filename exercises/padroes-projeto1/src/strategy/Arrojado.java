package strategy;

/**
 *
 * @author lucas
 */
public class Arrojado implements TipoInvestidor {
    @Override
    public double calcularRendimento(int tempoInvestimento, double valorInvestimento) {
        // a cada mês, existe 65% de chance de a rentabilidade ser igual a
        // 0,3%, 25% de chance de ser igual a 2% e 10% de chance de ser igual a 5%.
        double resultado = valorInvestimento;
        for (int i = 0; i < tempoInvestimento; i++) {
            double estatistica = Math.random();
            if (estatistica <= 0.65) {
                resultado *= 1.003;
            } else if (estatistica > 0.65 && estatistica <= 0.9) {
                resultado *= 1.02;
            } else {
                resultado *= 1.05;
            }
        }
        return resultado;
    }
}
