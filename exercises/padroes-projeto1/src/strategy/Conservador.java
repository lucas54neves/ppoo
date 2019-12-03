package strategy;

/**
 *
 * @author lucas
 */
public class Conservador implements TipoInvestidor {
    @Override
    public double calcularRendimento(int tempoInvestimento, double valorInvestimento) {
        return valorInvestimento * (Math.pow(1.008, tempoInvestimento));
    }
}