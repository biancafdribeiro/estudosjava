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
        }
        else {
            this.ultimo.setProximo(novoNodo);
            this.ultimo = novoNodo; //o novo elemento vira o último 
        }
        this.tamanho++;
    }
    
    //elemento atual vai andando na lista enquanto ele tiver um próximo elemento
    public void remover(String valorProcurado) {
        //precisa do anterior porque o código precisa saber quem vai ser o próximo do anterior
        Nodo anterior = null; //porque antes do primeiro não possui anterior; a variável anterior também anda com a atual e o i
                              //não é possível usar esse código para eliminar o primeiro elemento por conta dessa linha
        Nodo atual = this.primeiro; 
        
        //variável i vai andando junto com o atual
        for(int i = 0; i < this.getTamanho(); i++) { //como ele não sabe onde está o elemento, usa o getTamanho
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) { //quer saber se o atual tem o valor procurado
                if (atual == primeiro && atual == ultimo) { //this.tamanho == 1
                    this.primeiro = null;
                    this.ultimo = null;
                }
                else if (atual == primeiro) { //removendo o primeiro da lista
                    this.primeiro = atual.getProximo(); //o próximo vai ser o primeiro da lista
                    atual.setProximo(null);  
                } 
                
                else if (atual == ultimo) { //removendo o último da lista
                    this.ultimo = anterior;
                    anterior.setProximo(null); //como ele é o último, não tem próximo
                }
                
                else {
                    anterior.setProximo(atual.getProximo()); //anterior vai ter como próximo o atual.getProximo(). é como se nós eliminássemos o elemento do meio entre dois elementos
                    atual = null;
                }
                
                    this.tamanho--; //diminuir o tamanho da lista
                    break; //para de procurar
            } 
            anterior = atual; //antes do atual avançar o anterior avança, ficando na mesma posição do atual;
            atual = atual.getProximo(); //pega o próximo elemento
        }
    }
    
    //obtém o elemento em uma posição específica da lista, exemplo: lista.get(2)
    public Nodo get(int posicao) {
        Nodo atual = this.primeiro; //percorre a lista do início
        for(int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) { //verifica se o próximo nó não é nulo
                atual = atual.getProximo();
            }
        }
        return atual; //retorna o nó na posição desejada
    }
}
