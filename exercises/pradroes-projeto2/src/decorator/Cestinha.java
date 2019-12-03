package decorator;

/**
 *
 * @author lucas
 */
public class Cestinha extends Sorvete {
    public Cestinha(String nome) {
        setNome(nome);
    }
    
    @Override
    public double getPreco() {
        return 3;
    }

    @Override
    public int getQuantidadeBolas() {
        return 0 + getQuantidadeBolas();
    }
}
