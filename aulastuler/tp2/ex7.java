/*7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar matriz 3x4
        int[][] matriz = new int[3][4];

        // Solicitar ao usuário que insira doze valores e armazená-los na matriz
        System.out.println("Digite doze valores para preencher a matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Solicitar ao usuário que insira a constante multiplicativa
        System.out.print("Digite a constante multiplicativa: ");
        int constante = scanner.nextInt();

        // Multiplicar cada valor na matriz pela constante multiplicativa
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }

        // Exibir a matriz resultante na tela
        System.out.println("Matriz resultante após multiplicação:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha para a próxima linha da matriz
        }

        scanner.close();
    }
}


