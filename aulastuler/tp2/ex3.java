/*Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char executarNovamente;

        do {
            // Variáveis para armazenar o maior valor, o menor valor, a soma, a contagem e os contadores de valores positivos e negativos
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int soma = 0;
            int count = 0;
            int countPositivos = 0;
            int countNegativos = 0;

            // Solicitar a quantidade de valores "N"
            int N;
            do {
                System.out.print("Digite a quantidade de valores (positivo, menor que 20): ");
                N = scanner.nextInt();
            } while (N <= 0 || N >= 20);

            // Loop para entrar com os valores
            for (int i = 0; i < N; i++) {
                System.out.print("Digite o valor #" + (i + 1) + ": ");
                int valor = scanner.nextInt();

                // Atualizar o maior valor, o menor valor, a soma e a contagem
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
                soma += valor;
                count++;

                // Contar valores positivos e negativos
                if (valor > 0) {
                    countPositivos++;
                } else if (valor < 0) {
                    countNegativos++;
                }
            }

            // Calcular a média
            double media = (double) soma / count;

            // Calcular porcentagens
            double porcentagemPositivos = (double) countPositivos / N * 100;
            double porcentagemNegativos = (double) countNegativos / N * 100;

            // Exibir os resultados
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média aritmética dos valores: " + media);
            System.out.println("Porcentagem de valores positivos: " + porcentagemPositivos + "%");
            System.out.println("Porcentagem de valores negativos: " + porcentagemNegativos + "%");

            // Perguntar se deseja executar novamente
            System.out.print("Deseja executar novamente? (S/N): ");
            executarNovamente = scanner.next().toLowerCase().charAt(0); // Converte a entrada para minúsculas

        } while (executarNovamente == 's');

        scanner.close();
    }
}
