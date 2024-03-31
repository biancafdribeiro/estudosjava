/*Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

public class Main {
    public static void main(String[] args) {
        String[][] matrizNomes = new String[2][3];

        // Preencher a matriz com nomes
        matrizNomes[0][0] = "Alice";
        matrizNomes[0][1] = "Bob";
        matrizNomes[0][2] = "Carol";
        matrizNomes[1][0] = "David";
        matrizNomes[1][1] = "Eve";
        matrizNomes[1][2] = "Frank";

        // Exibir os nomes na tela
        System.out.println("Nomes na matriz 2x3:");
        for (int i = 0; i < matrizNomes.length; i++) {
            for (int j = 0; j < matrizNomes[i].length; j++) {
                System.out.print(matrizNomes[i][j] + " ");
            }
            System.out.println(); // Adiciona uma nova linha após cada linha da matriz
        }
    }
}


