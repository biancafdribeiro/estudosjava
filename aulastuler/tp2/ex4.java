/*Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];

        // Preencher a matriz com valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        // Exibir os valores na tela
        System.out.println("Valores na matriz 2x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
