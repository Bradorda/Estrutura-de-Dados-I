public class StackDinamica {
    CelulaPilha top = null;//topo da pilha que e uma celula.

    void push (String nome) {
        CelulaPilha novaCelula = new CelulaPilha();//Cria a nova celula
        novaCelula.setDado(nome);//Atribui o nome a ela
        novaCelula.setAnterior(this.top);//pega o topo como referencia
        this.top = novaCelula;//e subistitui pela nova celula.
    }

    void pop (){
        if (!isEmpty()){//verifica se a pilha NAO esta vazia.
//Imprime o nome dentro da Celula.
            System.out.println ("Retirando elemento da pilha...: "+this.top.getDado());
            this.top = this.top.getAnterior(); //faz o topo da pilha ir para a celula anterior
        }else{//caso esteja vazia
            System.out.println ("Pilha Vazia!!!");//imprime a mensagem de pilha vazia.
        }
    }

    boolean isEmpty (){//Verifica se o topo esta null,
        if (this.top == null){
            return true; //caso esteja em null, retorna verdadeiro.
        }else {
            return false;//caso nao esteja vazia, retorna false.
        }
    }

    int sizePilha(){
        CelulaPilha p;// referencia para uma celula.
        int cont = 0;// contador iniciado em 0.
        p= this.top;// referencia aponta para a celula no topo.
        while (p != null){ // verifica se a referencia esta apontando para null,
            p = p.getAnterior();// pega a referencia anterior.
            cont++;// encrementa o valor do contador.
        }
        return cont;//retorna a quantidade de celulas na pilha.
    }

    void imprimir (){
        CelulaPilha p;//Cria a referencia
        p = this.top;//faz a referencia apontar para o topo

        if (isEmpty() ){ //verifica se a pilha esta vazia
            System.out.println ("Pilha Vazia!!");//imprime pilha vazia.

        }else {//caso a pilha nao esteja vazia ,
            while(p != null){//verifica se a referencia esta em null
                System.out.println ("Nome na pilha...: "+p.getDado());//imprime o dado da celula
                p = p.getAnterior();// faz a referencia aponta par a anterior
            }
        }
    }

    void top(){
        if(isEmpty()){//verifica se apilha esta vazia
            System.out.println("Pilha Vazia!!!");
        }else {
            System.out.println("nome no topo da pilha" +top.getDado());
//imprime oque estiver no topo da pilha.
        }
    }



}