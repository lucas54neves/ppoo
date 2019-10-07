/* Entradas:
    O gênero da pessoa, que será o valor inteiro 1 se for homem ou 0 se for mulher.
    Idade da pessoa (valor inteiro).
    Quantidade de tempo (anos) já trabalhados pela pessoa (número real).
Saídas:
    Idade que a pessoa terá a se aposentar (número real).
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int genero, idade;
        double tempo_trabalhado, idade_aposentadoria;

        genero = ler.nextInt();
        idade = ler.nextInt();
        tempo_trabalhado = ler.nextDouble();

        if (genero == 0) {
            if (tempo_trabalhado < 30.0 && tempo_trabalhado > 15.0) {
                idade_aposentadoria = idade + (30 - tempo_trabalhado) * 1.3;
            } else {
                idade_aposentadoria = 62;
            }
        } else {
            if (tempo_trabalhado < 35.0 && tempo_trabalhado > 20.0) {
                idade_aposentadoria = idade + (30 - tempo_trabalhado) * 1.3;
            } else {
                idade_aposentadoria = 65;
            }
        }

        System.out.println(idade_aposentadoria);
    }
}
