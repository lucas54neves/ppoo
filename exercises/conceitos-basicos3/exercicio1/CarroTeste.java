package Exercicio1;

import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro carro;
        String modelo;
        int quantidade, acessorio;
        float[] precoAcessorio;
        float precoTotal = 0;
        
        precoAcessorio = new float[3];
        precoAcessorio[0] = 1500;
        precoAcessorio[1] = 850;
        precoAcessorio[2] = 200;
        
        System.out.printf("Digite o modelo do carro (Up/Voyage/Virtus): ");
        modelo = ler.next();
        
        carro = new Carro(modelo);
        
        System.out.printf("Entre com a quantidade de acessórios desejados: ");
        quantidade = ler.nextInt();
        
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Insira o código do %do acessório desejado (0: banco de courso, 1: som, 2: insulfilm): ", i+1);
            acessorio = ler.nextInt();
            
            carro.insere_acessorio(acessorio);
        }
        
        for (int i = 0; i < carro.retorna_quantidade_acessorios(); i++) {
            precoTotal = precoTotal + precoAcessorio[carro.retorna_codigo(i)];
        }
        
        System.out.println("############### NOTA FISCAL ###############");
        System.out.printf("Carro: %s%n", carro.retorna_modelo());
        System.out.printf("Preço dos Acessórios = %.2f%n", precoTotal);
    }
}
