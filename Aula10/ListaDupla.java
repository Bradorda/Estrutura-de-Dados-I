public class ListaDupla {
    Celula Primeira, Ultima;
    int totaldeElementos = 0;

    boolean posicaoOcupada(int pos) {
        return  ((pos >= 0) && (pos < this.totaldeElementos));
    }

    Celula pegarCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posiçao nao existe!");
        } else {
            Celula atual = this.Primeira;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();
            }
            return (atual);

        }
    }

    Object pegar(int pos){
        return (this.pegarCelula(pos).getElement());
    }


    void AdicionarNoComeco (Object elemento) {

        if (this.totaldeElementos == 0) {
            Celula nova = new Celula (elemento);
            this.Primeira = nova;
            this.Ultima = nova;
        } else {
            Celula nova = new Celula(this.Primeira, elemento);
            this.Primeira.setAnterior(nova);
            this.Primeira = nova;
        }
        this.totaldeElementos++;
    }

    void Adicionar (Object elemento){
        if (this.totaldeElementos == 0){
            this.AdicionarNoComeco(elemento);
        }else {}
        Celula nova = new Celula(elemento);
        this.Ultima.setProxima(nova);
        nova.setAnterior(this.Ultima);
        this.Ultima = nova;
        this.totaldeElementos++;
    }

    void Adicionar (int pos, Object elemento){
        if (pos == 0){
            this.AdicionarNoComeco(elemento);
        }else if (pos == this.totaldeElementos){
            this.Adicionar(elemento);
        }else {
            Celula anterior = this.pegarCelula(pos -1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(),elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totaldeElementos++;
        }
    }

    void removerDoComeco() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Essa posição não existe!");
        } else {
            this.Primeira = this.Primeira.getProxima();
            totaldeElementos--;
        }
        if (totaldeElementos == 0) {
            this.Ultima = null;
        }
    }

    void removerDoFim() {
        if (!this.posicaoOcupada(totaldeElementos-1)) {
            throw new IllegalArgumentException("Essa posição não existe!");
        } else {
            if (this.totaldeElementos == 1) {
                this.removerDoComeco();
            } else {
                Celula penultima = this.Ultima.getAnterior();
                penultima.setProxima(null);
                this.Ultima = penultima;
                totaldeElementos--;
            }
        }
    }

    void remover(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Essa posição não existe!");
        } else {
            if (pos == 0) {
                this.removerDoComeco();
            } else if (pos == this.totaldeElementos - 1) {
                    this.removerDoFim();
                } else {
                    Celula anterior = this.pegarCelula(pos - 1);
                    Celula atual = anterior.getProxima();
                    Celula proxima = atual.getProxima();

                    anterior.setProxima(proxima);
                    proxima.setAnterior(anterior);
                    this.totaldeElementos--;
                }
            }
        }

    Boolean Contem (Object elemento) {
        Celula atual = this.Primeira;

        while (atual != null) {
            if (atual.getElement().equals(elemento)) {
                return true;
            }

            atual = atual.getProxima();
        }
        return false;
    }

    void EsvaziarLista() {
        this.Primeira = null;
        this.Ultima = null;
        totaldeElementos = 0;
    }

    String imprimir() {
        if (this.totaldeElementos == 0) {
            return ("[]");
        } else {
            StringBuilder builder = new StringBuilder("[");
            Celula atual = this.Primeira;

            for (int i = 0; i < this.totaldeElementos - 1; i++) {
                builder.append(atual.getElement());
                builder.append(", ");
                atual = atual.getProxima();
            }
            builder.append(atual.getElement());
            builder.append("]");
            System.out.println(builder.toString());
            return (builder.toString());
        }
    }
}