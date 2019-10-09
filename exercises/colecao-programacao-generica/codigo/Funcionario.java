public abstract class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return
            "Nome: " + nome + '\n' +
            "CPF: " + cpf + '\n' +
            "Salário: " +  calcularSalario();
    }

    @Override
    public int compareTo(Funcionario f) {
        if (this.calcularSalario() > f.calcularSalario()) {
            return 1;
        } else if (this.calcularSalario() < f.calcularSalario()) {
            return -1;
        } else {
            return 0;
        }
    }

    public abstract double calcularSalario();
}
