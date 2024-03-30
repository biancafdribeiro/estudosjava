/*Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];

        // Preencher a matriz com valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;

        // Exibir os valores na tela
        System.out.println("Valores na matriz 3x2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

