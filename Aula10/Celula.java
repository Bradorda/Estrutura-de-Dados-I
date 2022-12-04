public class Celula {
    Celula Proxima, Anterior;
    Object Elemento;

    Celula(Celula prox, Object ele) {
        this.Proxima = prox;
        this.Anterior = null;
        this.Elemento = ele;
    }

    Celula(Object ele) {
        this.Proxima = null;
        this.Anterior = null;
        this.Elemento = ele;
    }

    void setProxima(Celula prox) {
        this.Proxima = prox;
    }

    void setAnterior(Celula ant) {
        this.Anterior = ant;
    }

    Celula getProxima() {
        return this.Proxima;
    }

    Celula getAnterior() {
        return this.Anterior;
    }

    int getElementoInt() {
        return (int) this.Elemento;
    }
    Object getElement(){
        return (this.Elemento);
    }

}