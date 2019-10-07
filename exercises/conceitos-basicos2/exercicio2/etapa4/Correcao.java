package questao2;

public class Correcao {
    private String situacao;
    private int quantidade;

    public Correcao(String situacao, int quantidade) {
        this.situacao = situacao;
        this.quantidade = quantidade;
    }

    public String getSituacao() {
        return situacao;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
