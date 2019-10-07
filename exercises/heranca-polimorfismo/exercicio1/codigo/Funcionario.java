package Exercicio1;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nSalário: " + calcularSalario();
    }
    
    public double calcularSalario() {
        return 0;
    }
}
