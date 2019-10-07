public class Caminhao extends Veiculo {
    private int numeroEixos;
    private int capacidadeCarga;
    
    public Caminhao(String marca, int ano, String cor, int numeroEixos, int capacidadeCarga) {
        super(marca, ano, cor);
        this.numeroEixos = numeroEixos;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public int getNumeroEixos() {
        return numeroEixos;
    }
    
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    @Override
    public String toString() {
        return
            "Marca: " + getMarca() +
            "\nAno: " + getAno() +
            "\nCor: " + getCor() +
            "\nNúmero de Eixos: " + getNumeroEixos() +
            "\nCapacidade de carga: " + getCapacidadeCarga();
    }
}
