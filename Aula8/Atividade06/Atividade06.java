import java.util.Random;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
public class Atividade06{
    public static void main (String []args){

        Random gerador = new Random();

        List <Integer> Fila = new ArrayList<>();
        List <Integer> FilaNegativos = new ArrayList<>();
        List <Integer> FilaPositivos = new ArrayList<>();
        Stack <Integer> Pilha = new Stack<Integer>();
        int numeroSorteado;
        int numero;

        while(Fila.size() != 2000){
            numeroSorteado=gerador.nextInt(-2000,2000);

            //Os primerios 1000 numeros negativos entraram na lista.
            if (numeroSorteado < 0 && FilaNegativos.size() < 1000){
                FilaNegativos.add(numeroSorteado);//controla a quatidade de  numeros negativos.
                Fila.add(numeroSorteado);
            }

            //Os primeiros 1000 numeros positivos entraram na lista.
            else if (numeroSorteado > 0 && FilaPositivos.size() < 1000){
                FilaPositivos.add(numeroSorteado); // controla a quantidade de numeros positivos.
                Fila.add(numeroSorteado);

            }
        }
        /*Explicacao do algoritmo abaixo, quando o primeiro numero da fila for negativo, a pilha estara vazia
        entao nao sera possivel dar continuidade ao programa pois oque sustenta o programa sao os numeros positivos
        pois apenas com a chegada deles conseguimos empilhar e desempilhar.*/

        int fimDoPrograma = 0;
        while(fimDoPrograma != 1) {
            if (Fila.get(0) > 0) {
                numero = Fila.remove(0);
                Pilha.push(numero);
            }
            else if (Fila.get(0) < 0) {
                if (Pilha.size() > 0) {
                    numero = Pilha.pop();
                    System.out.println(numero+" Retirado da Pilha!");
                } else {
                    System.out.println("Pilha Vazia impossivel retirar, Fim do Programa.");
                    fimDoPrograma = 1;
                }

            } else {
                System.out.println("Fim do programa.");
                fimDoPrograma = 1;
            }
        }

        System.out.println("Tamanho da Fila: "+Fila.size());

    }
}