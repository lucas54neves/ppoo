public class Conta{
    private int numero;
    private double saldo;

    public Conta(int numero){
        this.numero = numero;
        saldo = 0.0;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        }
        else{
            throw new SaldoInsuficienteException(numero);
        }
    }

    public void transferir(Conta contaDestino, double valor){
        double saldoAnterior = saldo;
        try
        {
            sacar(valor);
            contaDestino.depositar(valor);
        }
        catch (Exception e)
        {
            if (saldo == saldoAnterior-valor){
                depositar(valor);
            }
            System.out.println(e.getMessage());
        }
    }
}
