import java.util.List;
import java.util.ArrayList;

public class Frota {
    private List<Veiculo> veiculos;
    
    public Frota() {
        veiculos = new ArrayList<Veiculo>();
    }
    
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
    
    public void exibirVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
            System.out.println();
        }
    }
}
