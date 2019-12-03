package templateMethod;

/**
 *
 * @author lucas
 */
public class ConversorInverso extends ConversorString {
    @Override
    public void converter() {
        setPalavra(new StringBuilder(getPalavra()).reverse().toString());
    }
}
