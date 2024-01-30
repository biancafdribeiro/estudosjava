package com.mycompany.nodo;

public class Nodo<TIPO> { 

    private TIPO valor; 
    private Nodo<TIPO> proximo;
    
    //construtores usam o nome da classe e precisam ser instanciados para serem chamados
    //não é preciso especificar o tipo de acesso de um construtor
    //a inicialização de um membro é feita apenas dentro do construtor com 'this'
    
    public Nodo(TIPO novoValor) {
        this.valor = novoValor;
        this.proximo = null; //inicializa como null porque assume primeiramente que não há um próximo
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Nodo<TIPO> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<TIPO> proximo) {
        this.proximo = proximo;
    }
    

            
}
