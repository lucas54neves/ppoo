/*
Entradas:
    Valor real x entre 0 e 100%, representando o retorno mensal do investimento
    Inteiro N representando o número de meses
    N valores reais correspondendo aos depósitos em cada mês
Saídas:
    Valor total no final do último mês
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double taxa;
        int quantidade_meses;
        double deposito, valor_final = 0;
        
        taxa = ler.nextDouble();
        quantidade_meses = ler.nextInt();

        for (int i = 0; i < quantidade_meses; i++) {
            deposito = ler.nextDouble();
            valor_final = (valor_final + deposito) * (1 + (taxa/100.0));
        }

        System.out.println(valor_final);
    }
}
