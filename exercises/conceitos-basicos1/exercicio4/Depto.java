package Exercicio4;

public class Depto {
    private String nome;
    private String[] docente;
    private int numeroCursos;
    private int numeroAlunos;
    private int contador;
    
    public Depto(String nome, int qtdadeDocentes) {
        this.nome = nome;
        docente = new String[qtdadeDocentes];
        contador = 0;
    }
    
    public Depto(String nome, String[] docente, int numeroCursos, int numeroAlunos, int contador) {
        this.nome = nome;
        this.docente = docente;
        this.numeroCursos = numeroCursos;
        this.numeroAlunos = numeroAlunos;
        this.contador = contador;
    }
    
    public void cadastrarDocente(String nomeDocente) {
        docente[contador] = nomeDocente;
        contador++;
    }
    
    public void setNumeroCursos(int numeroCursos) {
        this.numeroCursos = numeroCursos;
    }
    
    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }
    
    public void mostrarDetalhes() {
        System.out.printf("Nome do departamento: %s%n", nome);
        System.out.printf("Professores:%n");
        String retorno = "";
            for (int i = 0; i < contador; i++) {
                retorno = retorno + "   " + docente[i] + "\n";    
        }
        System.out.print(retorno);
        System.out.printf("Numero de Cursos: %d%n", numeroCursos);
        System.out.printf("Numero de Alunos: %d%n", numeroAlunos);
    }
}
