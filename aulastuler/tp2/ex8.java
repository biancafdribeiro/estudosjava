/*Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar matriz 3x4
        int[][] matrizOriginal = new int[3][4];

        // Solicitar ao usuário que insira doze valores e armazená-los na matriz
        System.out.println("Digite doze valores para preencher a matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
            }
        }

        // Criar matriz para armazenar o resultado da multiplicação
        int[][] matrizResultado = new int[3][4];

        // Solicitar ao usuário que insira a constante multiplicativa
        System.out.print("Digite a constante multiplicativa: ");
        int constante = scanner.nextInt();

        // Multiplicar cada valor na matriz pela constante multiplicativa e armazenar na matriz de resultado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = matrizOriginal[i][j] * constante;
            }
        }

        // Exibir a matriz original na tela
        System.out.println("Matriz original:");
        exibirMatriz(matrizOriginal);

        // Exibir a matriz resultado na tela
        System.out.println("Matriz resultado após multiplicação:");
        exibirMatriz(matrizResultado);

        scanner.close();
    }

    // Função para exibir uma matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); 
        }
    }
}
