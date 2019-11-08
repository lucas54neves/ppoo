package serializacao;

import java.io.Serializable;

public class Aluno implements Comparable<Aluno>, Serializable {
    private String matricula;
    private String nome;
    private int nota;

    public Aluno(String matricula, String nome, int nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }
    
    public String situacao() {
        String retorno;
        if (nota >= 60) {
            retorno = "Aprovado";
        } else {
            retorno = "Reprovado";
        }
        return retorno;
    }
    
    @Override
    public String toString() {
        return matricula + " " + nome + " " + nota + " " + situacao();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }
    
    @Override
    public int compareTo(Aluno aluno) {
        if (this.nota > aluno.getNota()) {
            return 1;
        } else if(this.nota == aluno.getNota()) {
            return 0;
        } else {
            return -1;
        }
        
    }
}
