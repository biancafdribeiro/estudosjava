/*Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário as dimensões da matriz
        System.out.print("Digite o número de linhas da matriz (até 10): ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz (até 10): ");
        int colunas = scanner.nextInt();

        // Verificar se as dimensões da matriz são válidas
        if (linhas <= 0 || linhas > 10 || colunas <= 0 || colunas > 10) {
            System.out.println("Dimensões inválidas. Por favor, escolha valores entre 1 e 10.");
            return;
        }

        // Criar matriz com as dimensões fornecidas pelo usuário
        int[][] matriz = new int[linhas][colunas];

        // Solicitar ao usuário que insira os elementos da matriz
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibir a matriz original
        System.out.println("\nMatriz original:");
        exibirMatriz(matriz);

        // Calcular e exibir a matriz transposta
        int[][] transposta = calcularTransposta(matriz);
        System.out.println("\nMatriz transposta:");
        exibirMatriz(transposta);

        scanner.close();
    }

    // Função para exibir uma matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Nova linha para a próxima linha da matriz
        }
    }

    // Função para calcular a matriz transposta
    public static int[][] calcularTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }
}
