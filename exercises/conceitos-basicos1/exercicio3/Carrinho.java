package Exercicio3;

public class Carrinho {
    private String cliente;
    private String[] carrinho;
    private int dia;
    private int mes;
    private int ano;
    private int contadorItens;
    
    public Carrinho(String cliente, int dia, int mes, int ano) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[5];
        contadorItens = 0;
    }
    
    public Carrinho(String cliente, int dia, int mes, int ano, int limite) {
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[limite];
        contadorItens = 0;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public void inserirItem(String produto) {
        carrinho[contadorItens] = produto;
        contadorItens++;
    }
    
    public void exibir() {
        System.out.printf("Cliente: %s%n", getCliente());
        System.out.printf("Data da compra: %d/%d/%d%n", dia, mes, ano);
        String retorno = "";
        for (int i = 0; i < contadorItens; i++) {
            retorno = retorno + " " + carrinho[i];
        }
        System.out.printf("Itens do carrinho:%s%n", retorno);
    }
}