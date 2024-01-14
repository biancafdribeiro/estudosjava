package com.mycompany.nodo;

public class ListaLigada {
    
    private Nodo primeiro;
    private Nodo ultimo;
    private int tamanho;
    
    //construtor
    public ListaLigada() {
        this.tamanho = 0; //uma lista ligada sempre inicia com tamanho zero
    }
    
    public Nodo getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Nodo primeiro) {
        this.primeiro = primeiro;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(String novoValor) {
        Nodo novoNodo = new Nodo(novoValor); //o valor passa para dentro do elemento
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoNodo;
            this.ultimo = novoNodo;
            this.tamanho++;
        }
        else {
            this.ultimo.setProximo(novoNodo);
            this.ultimo = novoNodo;
        }
        this.tamanho++;
    }
    
    public void remover(String novoValor) {
        
    }
    
    public Nodo get(int posicao) {
        Nodo atual = this.primeiro;
        for(int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
