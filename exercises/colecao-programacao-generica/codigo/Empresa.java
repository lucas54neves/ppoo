import java.util.*;

public class Empresa {
    private List<Funcionario> funcionarios;
    private String nome;
    private String cnpj;

    public Empresa(String nome, String cnpj) {
        funcionarios = new ArrayList<Funcionario>();
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void admitirFuncionario(Funcionario f) {
        funcionarios.add(f);
        Collections.sort(funcionarios);
    }

    public void gerarRelatorioDePrioridade() {
        for(Funcionario f: funcionarios) {
            System.out.println(f);
        }
    }
}
