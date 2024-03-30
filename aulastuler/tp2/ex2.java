/*Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar o maior valor, a soma e a contagem
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int count = 0;
        
        // Loop para entrar com os valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor positivo: ");
            int valor = scanner.nextInt();
            
            // Consistir a digitação
            while (valor <= 0) {
                System.out.println("Valor inválido! Por favor, digite um valor positivo.");
                System.out.print("Digite um valor positivo: ");
                valor = scanner.nextInt();
            }
            
            // Atualizar o maior valor, a soma e a contagem
            if (valor > maior) {
                maior = valor;
            }
            soma += valor;
            count++;
        }
        
        // Calcular a média
        double media = (double) soma / count;
        
        // Exibir os resultados
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média aritmética dos valores é: " + media);
        
        scanner.close();
    }
}
