package decorator;

/**
 *
 * @author lucas
 */
public class Creme extends Sabor{
    public Creme(Sorvete sorvete) {
        super(sorvete);
    }
    
    @Override
    public double getPreco() {
        return 3.5 + getSorvete().getPreco();
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + getQuantidadeBolas();
    }
}
