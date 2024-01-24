package com.mycompany.nodo;

public class Nodo { 

    private String valor; 
    private Nodo proximo;
    
    //construtores usam o nome da classe e precisam ser instanciados para serem chamados
    //não é preciso especificar o tipo de acesso de um construtor
    //a inicialização de um membro é feita apenas dentro do construtor com 'this'
    
    public Nodo(String novoValor) {
        this.valor = novoValor;
        this.proximo = null; //inicializa como null porque assume primeiramente que não há um próximo
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    

            
}

