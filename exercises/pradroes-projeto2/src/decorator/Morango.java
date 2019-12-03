package decorator;

/**
 *
 * @author lucas
 */
public class Morango extends Sabor {
    public Morango(Sorvete sorvete) {
        super(sorvete);
    }
    
    @Override
    public double getPreco() {
        return 1.5 + getSorvete().getPreco();
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + getQuantidadeBolas();
    }
}
