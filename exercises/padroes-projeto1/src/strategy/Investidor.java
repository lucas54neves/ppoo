package strategy;

/**
 *
 * @author lucas
 */
public class Investidor {
    private TipoInvestidor tipoInvestidor;
    private int tempoInvestimento;
    private double valorInvestimento;

    public Investidor(TipoInvestidor tipoInvestidor, int tempoInvestimento, double valorInvestimento) {
        this.tipoInvestidor = tipoInvestidor;
        this.tempoInvestimento = tempoInvestimento;
        this.valorInvestimento = valorInvestimento;
    }

    public double calcularRendimento() {
        return tipoInvestidor.calcularRendimento(tempoInvestimento, valorInvestimento);
    }
}
