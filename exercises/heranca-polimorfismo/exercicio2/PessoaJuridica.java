package Exercicio2;

public class PessoaJuridica extends Contato {
    private String cnpj;
    private int inscricao_estadual;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj, int inscricao_estadual) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getCnpj() {
        return cnpj;
    }
}
