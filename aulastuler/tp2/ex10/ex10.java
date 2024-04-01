/*Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

package com.mycompany.mavenproject1;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import java.util.Scanner;

public class Mavenproject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordem;

        // Solicitar ao usuário a ordem da matriz (MxM)
        do {
            System.out.print("Digite a ordem da matriz (Máximo 10): ");
            ordem = scanner.nextInt();

            // Verificar se a ordem da matriz é válida
            if (ordem <= 0 || ordem > 10) {
                System.out.println("Ordem inválida. Por favor, escolha um número entre 1 e 10.");
            }
        } while (ordem <= 0 || ordem > 10);

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

        // Criar uma matriz RealMatrix a partir da matriz fornecida pelo usuário
        RealMatrix realMatrix = new Array2DRowRealMatrix(matriz);

        // Verificar se a matriz é inversível
        if (!verificarInversibilidade(realMatrix)) {
            System.out.println("A matriz não é inversível.");
            return;
        }

        // Calcular a matriz inversa
        RealMatrix inversa = calcularMatrizInversa(realMatrix);

        // Exibir a matriz original e a matriz inversa na tela
        System.out.println("\nMatriz original:");
        exibirMatriz(matriz);
        System.out.println("\nMatriz inversa:");
        exibirMatriz(inversa.getData());

        scanner.close();
    }

    // Função para verificar se a matriz é inversível
    public static boolean verificarInversibilidade(RealMatrix matriz) {
        LUDecomposition decomposition = new LUDecomposition(matriz);
        return decomposition.getSolver().isNonSingular();
    }

    // Função para calcular a matriz inversa
    public static RealMatrix calcularMatrizInversa(RealMatrix matriz) {
        DecompositionSolver solver = new LUDecomposition(matriz).getSolver();
        return solver.getInverse();
    }

    // Função para exibir uma matriz
    public static void exibirMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
