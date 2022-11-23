import java.util.Random;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.random.*;

public class Atividade05 {
    public static void main(String[] args) {

        Random gerador = new Random();
        List<Integer> F = new ArrayList();
        Stack<Integer> P = new Stack<Integer>();
        int numeroSorteado;

        //sortear 1000 numeros e verificar aonde adicionar.
        for (int repeticoes = 0; repeticoes < 1000; repeticoes++) {
            //Quanto menor a distancia dos numeros sorteador maior probabilidade de adicionar na pilha P.
            numeroSorteado = gerador.nextInt(0, 100000);

            if (F.contains(numeroSorteado)) {
                P.push(numeroSorteado);
            } else {
                F.add(numeroSorteado);
            }

        }

        //mostrar elementos.
        for (int i = 0; i < F.size(); i++) {
            System.out.println("Pertence a fila F: "+F.get(i));
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < P.size(); i++) {
            System.out.println("Pertence a Pilha P: "+P.get(i));
        }

        System.out.println("-----------------------------------");

        //mostrar tamanho da fila e pilha.
        System.out.println("Tamanho da Fila: " + F.size());
        System.out.println("Tamanho da Pilha: " + P.size());

    }
}