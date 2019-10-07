public class Caminhao extends Veiculo implements Tributavel {
    private int numEixos;

    public Caminhao(String marca, String modelo, int anoFabricacao, int numEixos) {
        super(marca, modelo, anoFabricacao);
        this.numEixos = numEixos;
    }

    public int getNumEixos() {
        return numEixos;
    }

    @Override
    public String toString() {
        return
            "Marca: " + getMarca() + '\n' +
            "Modelo: " + getModelo() + '\n' +
            "Ano de Fabricação: " + getAnoFabricacao() + '\n' +
            "Número de Eixos: " + numEixos + '\n' +
            "IPVA: " + calcularIPVA();
    }

    @Override
    public double calcularIPVA() {
        return 200 * numEixos / (2019 - getAnoFabricacao());
    }
}
