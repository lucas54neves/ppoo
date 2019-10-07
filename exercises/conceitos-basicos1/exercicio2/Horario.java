package Exercicio2;

public class Horario {
    // Atributos
    private int hora;
    private int minuto;
    private int segundo;
    
    // Construtor do horario passando por parametro as horas, os minutos e os segundos
    public Horario (int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    // Exibe o horario com a formatacao exigida na questao
    public void exibir() {
        System.out.printf("%dh:%dm:%ds%n", hora, minuto, segundo);
    }
    
    // Formata o novo horario passado por parametro
    // O parametro esta em segundos
    // O metodo converte para hora, minuto e segundo
    public void formatarTempo(int segundo) {
        this.hora = segundo / 3600;
        segundo = segundo % 3600;
        this.minuto = segundo / 60;
        segundo = segundo % 60;
        this.segundo = segundo;
        
        exibir();
    }
}
