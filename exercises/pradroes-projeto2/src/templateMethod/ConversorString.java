package templateMethod;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public abstract class ConversorString {
    private String palavra;
    
    public final void operacoes() {
        ler();
        converter();
        exibir();
    }
    
    public void ler() {
        System.out.print("Entre com a palavra: ");
        palavra = new Scanner(System.in).next();
    }
    
    public abstract void converter();
    
    public void exibir() {
        System.out.println(palavra);
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
}
