import java.util.ArrayList;
import java.util.List;

public class Filas {

    List<Carros> carros = new ArrayList<>();
    List<Carros> ordenarId = new ArrayList<>();

    void adicionar (Carros A) {
        this.carros.add(A);
    }

    Carros remover() {
        return this.carros.remove(0);
    }

    boolean filaVazia(){
        return (this.carros.isEmpty());
    }

    int tamanhoFila(){
        return carros.size();
    }
}
