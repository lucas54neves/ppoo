public class Carro extends Veiculo {
    private int capacidadePortaMalas;
    private int numeroPortas;
    
    public Carro(String marca, int ano, String cor, int capacidadePortaMalas, int numeroPortas) {
        super(marca, ano, cor);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.numeroPortas = numeroPortas;
    }
    
    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }
    
    public int getNumeroPortas() {
        return numeroPortas;
    }
    
    @Override
    public String toString() {
        return
            "Marca: " + getMarca() +
            "\nAno: " + getAno() +
            "\nCor: " + getCor() +
            "\nCapacidade do porta malas: " + getCapacidadePortaMalas() +
            "\nNúmero de portas: " + getNumeroPortas();
    }
}
