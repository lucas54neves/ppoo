public class SaldoInsuficienteException extends RuntimeException {
    private int numero_conta;

    public SaldoInsuficienteException(int numero_conta) {
        super("Saldo insuficiente na conta " + numero_conta);
        this.numero_conta = numero_conta;
    }

    public int getNumero_conta() {
        return numero_conta;
    }
}
