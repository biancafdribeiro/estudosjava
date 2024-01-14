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
       
       System.out.println(lista.get(0).getValor());
       System.out.println(lista.get(1).getValor());
       System.out.println(lista.get(2).getValor());
       System.out.println(lista.get(3).getValor());

   }
}
