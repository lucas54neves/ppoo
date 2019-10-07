package Exercicio1;

public class Ponto {
    // Atributos
    private double x;
    private double y;
    
    // Construtor do ponto passando suas coordenadas por parametro
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Retorna as coordenadas do ponto
    public String getPonto() {
        return "As coordenadas (x,y) do ponto são: (" + x + "; " + y + ")";
    }
    
    // Calcula a distancia do ponto em questao com outro ponto
    // Passando as coordenadas do outro ponto por parametro
    public double calcularDistancia(double x, double y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
}
