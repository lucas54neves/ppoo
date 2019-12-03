package strategy;

/**
 *
 * @author lucas
 */
public class Moderado implements TipoInvestidor {
    @Override
    public double calcularRendimento(int tempoInvestimento, double valorInvestimento) {
        // a cada mês, existe uma chance de 80% de a rentabilidade ser
        // igual a 0,6% e 20% de chance de ser igual a 2%.
        double resultado = valorInvestimento;
        for (int i = 0; i < tempoInvestimento; i++) {
            double estatistica = Math.random();
            if (estatistica >= 0.8) {
                resultado *= 1.006 ;
            } else {
                resultado *= 1.02;
            }
        }
        return resultado;
    }
}
