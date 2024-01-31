package com.mycompany.nodo;
        
import java.util.ArrayList;

public class ComparacaoVetorLista {
    public static void main(String[] args) {
        
    ListaLigada<Integer> lista = new ListaLigada<Integer>();
    ArrayList<Integer> vetor = new ArrayList<Integer>();
    
    //Adicionar elementos
    int limite = 50000;
    long tempoInicial = System.currentTimeMillis(); //pega a hora atual em milissegundos
    long tempoFinal;
    for(int i = 0; i < limite; i++) {
        vetor.add(i);
    }
    
    //em um vetor, conseguimos acessar o elemento diretamente
    tempoFinal = System.currentTimeMillis();
    System.out.println("Adicionou " + limite + " elementos no vetor");
    System.out.println(tempoFinal - tempoInicial);
    
    tempoInicial = System.currentTimeMillis();
    for(int i = 0; i < limite; i++) {
        lista.adicionar(i);
    }
    
    //em uma lista ligada, é necessário passar por todos os elementos para achar algum
    tempoFinal = System.currentTimeMillis();
    System.out.println("Adicionou " + limite + " elementos na lista");
    System.out.println(tempoFinal - tempoInicial);
    
    //ler valores do vetor
    tempoInicial = System.currentTimeMillis();
    for(int i = 0; i < vetor.size(); i++) {
        vetor.get(i);
    }
    tempoFinal = System.currentTimeMillis();
    System.out.println("Tempo de leitura do vetor");
    System.out.println(tempoFinal - tempoInicial);
    
    //ler valores da lista
    tempoInicial = System.currentTimeMillis();
    for(int i = 0; i < lista.getTamanho(); i++) {
        lista.get(i);
    }
    tempoFinal = System.currentTimeMillis();
    System.out.println("Tempo de leitura da lista");
    System.out.println(tempoFinal - tempoInicial);
    
    
    }
}
