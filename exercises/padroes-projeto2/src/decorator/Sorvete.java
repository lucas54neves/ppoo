package decorator;

/**
 *
 * @author lucas
 */
public abstract class Sorvete {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract int getQuantidadeBolas();
    
    public abstract double getPreco();
}
