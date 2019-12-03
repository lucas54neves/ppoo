package templateMethod;

/**
 *
 * @author lucas
 */
public class TesteConversorString {

    public static void main(String[] args) {
        ConversorString teste1 = new ConversorInverso();
        ConversorString teste2 = new ConversorMaiusculo();
        
        teste1.ler();
        teste2.ler();
        
        teste1.converter();
        teste2.converter();
        
        teste1.exibir();
        teste2.exibir();
    }
    
}
