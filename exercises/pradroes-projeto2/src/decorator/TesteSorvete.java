package decorator;

/**
 *
 * @author lucas
 */
public class TesteSorvete {

    public static void main(String[] args) {
        Sorvete sorvete = new Cestinha("Napolitano");
        sorvete = new Chocolate(sorvete);
        sorvete = new Chocolate(sorvete);
        sorvete = new Creme(sorvete);
        sorvete = new Morango(sorvete);
        gerarRelatorio(sorvete);
    }
    
    public static void gerarRelatorio(Sorvete sorvete) {
        System.out.println("Nome: " + sorvete.getNome());
        System.out.println("Preço: " + sorvete.getPreco());
    }
}
