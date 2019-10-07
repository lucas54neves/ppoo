import java.util.*;
public class Frota{
    private List<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void inserirVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void gerarRelatorio(){
        for(Veiculo v: veiculos){
            System.out.println(v);
            System.out.println("-----------------");
        }
    }
}
