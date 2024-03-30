/*Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
Bianca Fonseca Dantas Ribeiro - CB3025683 e Milena Costa de Andrade - CB3027171
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int primeiroValor, segundoValor;
        
        System.out.println("Digite o primeiro valor:");
        primeiroValor = scanner.nextInt();
        
        do {
            System.out.println("Digite o segundo valor (maior que o primeiro):");
            segundoValor = scanner.nextInt();
            
            if (segundoValor <= primeiroValor) {
                System.out.println("O segundo valor deve ser maior que o primeiro. Tente novamente.");
            }
        } while (segundoValor <= primeiroValor);
        
        System.out.println("Valores válidos: primeiro = " + primeiroValor + ", segundo = " + segundoValor);
    }
}
