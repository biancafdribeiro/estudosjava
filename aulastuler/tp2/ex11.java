/*Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a ordem da matriz (MxM)
        System.out.print("Digite a ordem da matriz (Máximo 10): ");
        int ordem = scanner.nextInt();

        // Verificar se a ordem da matriz é válida
        if (ordem <= 0 || ordem > 10) {
            System.out.println("Ordem inválida. Por favor, escolha um número entre 1 e 10.");
            return;
        }

        // Criar matriz com a ordem fornecida pelo usuário
        double[][] matriz = new double[ordem][ordem];

        // Solicitar ao usuário que insira os elementos da matriz
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Calcular o determinante da matriz
        double determinante = calcularDeterminante(matriz);

        // Exibir o determinante da matriz
        System.out.println("O determinante da matriz é: " + determinante);

        scanner.close();
    }

    // Função para calcular o determinante de uma matriz usando o método de Laplace
    public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;

        // Caso base: matriz 1x1
        if (ordem == 1) {
            return matriz[0][0];
        }

        double determinante = 0;

        // Iterar sobre a primeira linha para calcular o determinante
        for (int j = 0; j < ordem; j++) {
            // Calcular o cofator
            double cofator = matriz[0][j] * calcularDeterminante(submatriz(matriz, 0, j));
            // Alternar sinal do cofator com base no índice da coluna
            determinante += (j % 2 == 0) ? cofator : -cofator;
        }

        return determinante;
    }

    // Função para obter a submatriz de uma matriz excluindo a linha 'i' e a coluna 'j'
    public static double[][] submatriz(double[][] matriz, int linhaExcluir, int colunaExcluir) {
        int novaOrdem = matriz.length - 1;
        double[][] submatriz = new double[novaOrdem][novaOrdem];

        int novaI = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (i == linhaExcluir) {
                continue;
            }
            int novaJ = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (j == colunaExcluir) {
                    continue;
                }
                submatriz[novaI][novaJ] = matriz[i][j];
                novaJ++;
            }
            novaI++;
        }

        return submatriz;
    }
}
