/*
Entradas:
    Quantidade de km em que houve medição.
    Nome do primeiro piloto.
    Tempos do primeiro piloto em cada km (números reais).
    Nome do segundo piloto.
    Tempos do segundo piloto em cada km (números reais).
Saídas:
    Nome do piloto na liderança a cada km.
    Nome do piloto com o melhor tempo no último km.
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade_km;
        String nome_primeiro_piloto, nome_segundo_piloto;
        
        quantidade_km = ler.nextInt();
        nome_primeiro_piloto = ler.next();

        double[] tempos_primeiro_piloto = new double[quantidade_km+1];

        tempos_primeiro_piloto[0] = 0;
        for (int i = 1; i <= quantidade_km; i++) {
            tempos_primeiro_piloto[i] = ler.nextDouble();
        }

        double[] tempos_segundo_piloto = new double[quantidade_km+1];

        nome_segundo_piloto = ler.next();

        tempos_segundo_piloto[0] = 0;
        for (int i = 1; i <= quantidade_km; i++) {
            tempos_segundo_piloto[i] = ler.nextDouble();
        }

        String[] lideranca = new String[quantidade_km];
        String[] melhor_tempo = new String[quantidade_km];
        double tempo_percurso_primeiro, tempo_percurso_segundo;

        for (int i = 1; i <= quantidade_km; i++) {
            if (tempos_primeiro_piloto[i] < tempos_segundo_piloto[i]) {
                lideranca[i-1] = nome_primeiro_piloto;
            } else {
                lideranca[i-1] = nome_segundo_piloto;
            }

            tempo_percurso_primeiro = tempos_primeiro_piloto[i] - tempos_primeiro_piloto[i-1];
            tempo_percurso_segundo = tempos_segundo_piloto[i] - tempos_segundo_piloto[i-1];

            if (tempo_percurso_primeiro < tempo_percurso_segundo) {
                melhor_tempo[i-1] = nome_primeiro_piloto;
            } else {
                melhor_tempo[i-1] = nome_segundo_piloto;
            }
        }

        for (int i = 0; i < quantidade_km; i++) {
            System.out.print(lideranca[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < quantidade_km; i++) {
            System.out.print(melhor_tempo[i] + " ");
        }
        System.out.println();
    }
}
