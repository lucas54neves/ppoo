package decorator;

/**
 *
 * @author lucas
 */
public class Cone extends Sorvete {
    public Cone(String nome) {
        setNome(nome);
    }
    
    @Override
    public double getPreco() {
        return 2;
    }

    @Override
    public int getQuantidadeBolas() {
        return 0;
    }
}
