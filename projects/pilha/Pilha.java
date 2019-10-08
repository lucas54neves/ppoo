public class Pilha <T> {
    private Noh<T> primeiroNoh;
    private Noh<T> ultimoNoh;
    private int tamanho;

    public Pilha() {
        primeiroNoh = null;
        tamanho = 0;
    }

    public void adicionar(T objeto) {
        Noh<T> novoNoh = new Noh<T>(objeto);
        if (tamanho == 0) {
            primeiroNoh = novoNoh;
            ultimoNoh = novoNoh;
        } else {
            ultimoNoh.setProximo(novoNoh);
            ultimoNoh = novoNoh;
        }
        tamanho = tamanho + 1;
    }

    public void remover() {
        if (tamanho == 1) {
            primeiroNoh = null;
            ultimoNoh = null;
        } else {
            Noh<T> iterador = primeiroNoh;

            while (iterador.getProximo() != ultimoNoh) {
                iterador = iterador.getProximo();
            }

            iterador.setProximo(null);
            ultimoNoh = iterador;

            tamanho = tamanho - 1;
        }
    }

    public T getObjeto(int indice) {
        Noh<T> iterador = primeiroNoh;
        int posicao = 0;

        while (posicao != indice) {
            iterador = iterador.getProximo();
            posicao = posicao + 1;
        }

        return iterador.getObjeto();
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String retorno = "";
        Noh<T> iterador = primeiroNoh;

        while (iterador != null) {
            retorno = retorno + iterador.getObjeto() + " -> ";
            iterador = iterador.getProximo();
        }

        retorno = retorno + "null";

        return retorno;
    }
}
