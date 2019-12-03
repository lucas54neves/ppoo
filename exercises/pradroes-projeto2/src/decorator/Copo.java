package decorator;

/**
 *
 * @author lucas
 */
public class Copo extends Sorvete {
    public Copo(String nome) {
        setNome(nome);
    }
    
    @Override
    public double getPreco() {
        return 1;
    }

    @Override
    public int getQuantidadeBolas() {
        return 0;
    }
}
