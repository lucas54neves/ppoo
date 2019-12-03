package decorator;

/**
 *
 * @author lucas
 */
public class Chocolate extends Sabor {
    public Chocolate(Sorvete sorvete) {
        super(sorvete);
    }
    
    @Override
    public double getPreco() {
        return 2.5 + getSorvete().getPreco();
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + getQuantidadeBolas();
    }
}
