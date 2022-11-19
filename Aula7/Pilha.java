import java.util.Stack;
public class Pilha{
    static Stack <Integer> origem = new Stack<>();
    static Stack <Integer> destino = new Stack<>();
    static Stack <Integer> trabalho = new Stack<>();

    public static long movimentos;

    public static void mover(Stack <Integer> destino, Stack <Integer> origem ) {
        movimentos++;
    }
    static void hanoi(int disco, Stack <Integer> origem, Stack <Integer> destino, Stack <Integer> trabalho) {

        if (disco >= 0) {
            hanoi(disco - 1, origem, trabalho, destino);
            mover(origem, destino);
            hanoi(disco - 1, trabalho, destino, origem);
        }

    }
}