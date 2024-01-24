package com.mycompany.nodo;

public class Program {
   public static void main(String[] args) {
       
       ListaLigada lista = new ListaLigada();
       System.out.println(lista.getTamanho());
       
       lista.adicionar("Nathália");
       lista.adicionar("Bianca");
       lista.adicionar("Beatriz");
       lista.adicionar("Luana");
       
       System.out.println("Tamanho: " + lista.getTamanho());
       System.out.println("Primeiro: " + lista.getPrimeiro().getValor()); //pegando o valor e não o nodo
       System.out.println("Último: " + lista.getUltimo().getValor());
       
       for(int i = 0; i < lista.getTamanho(); i++) {
           System.out.println(lista.get(i).getValor());
       }
       
       lista.remover("Bianca");
       System.out.println("Removeu o elemento Bianca");
       lista.remover("Luana");
       System.out.println("Removeu o elemento Luana");
       System.out.println("Tamanho: " + lista.getTamanho());
    
       
       for(int i = 0; i < lista.getTamanho(); i++) {
           System.out.println(lista.get(i).getValor());
       }
       
   }
}
