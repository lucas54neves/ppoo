package templateMethod;

/**
 *
 * @author lucas
 */
public class ConversorMaiusculo extends ConversorString {
    @Override
    public void converter() {
        setPalavra(getPalavra().toUpperCase());
    }
}
