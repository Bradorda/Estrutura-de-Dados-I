import java.util.ArrayList;
import java.util.List;
public class Filas {
    List<Aviao> avioes = new ArrayList<>();

    void adicionar (Aviao A) {
        this.avioes.add(A);
    }

    Aviao remover() {
        return this.avioes.remove(0);
    }

    boolean filaVazia(){
        return (this.avioes.isEmpty());
    }

    int tamanhoFila(){
        return avioes.size();
    }
}

