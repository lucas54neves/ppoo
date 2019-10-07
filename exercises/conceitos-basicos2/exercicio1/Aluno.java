package exercicio1;

public class Aluno {
    private String nome;
    private String categoria;
    private int[] notas;
    private int quantidade;
    private int contador;

    public Aluno(String nome, String categoria, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        notas = new int[quantidade];
        this.quantidade = quantidade;
        contador = 0;
    }

    public String getNome() {
        return nome;
    }
    
    public int retorna_nota_disciplina(int i) {
        // Como o vetor comeca na posicao 0, deve-se subtrair por 1 o codigo da disciplina
        return notas[i-1];
    }
    
    public double retorna_coeficiente() {
        double total_notas = 0;
        for (int i = 0; i < quantidade; i++) {
            total_notas = total_notas + retorna_nota_disciplina(i+1);
        }
        return (total_notas / quantidade);
    }
    
    public String retorna_situacao() {
        if (categoria.equals("bolsista")) {
            if (retorna_coeficiente() < 75.0) {
                return "Desligado";
            } else {
                return "Regular";
            }
        } else {
            if (retorna_coeficiente() < 70.0) {
                return "Desligado";
            } else {
                return "Regular";
            }
        }
    }
    
    
    public void inserir_nota (int nota) {
        notas[contador] = nota;
        contador++;
    }
}
