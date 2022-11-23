import java.util.Stack;
import java.util.Random;

public class TestarPilha {

    static void Operacoes() {
        Random gerador = new Random();
        int numeroSorteado;
        int dados;
        Stack<Integer> N = new Stack<Integer>();
        Stack<Integer> P = new Stack<Integer>();

        for (int i = 0; i < 1000; i++) {
            numeroSorteado = gerador.nextInt(-100, 100);

            if (numeroSorteado > 0) {
                P.push(numeroSorteado);
            } else if (numeroSorteado < 0) {
                N.push(numeroSorteado);
            } else{

                //Antes de realizar a retirada e necessario verificar se existe itens nas Pilhas.
                if (P.size() > 0 && N.size() > 0) {
                    System.out.println("\nNumero Sorteado: " + numeroSorteado);
                    dados = P.pop();
                    System.out.println(dados + " Retirado da Pilha P!");

                    dados = N.pop();
                    System.out.println(dados + " Retirado da Pilha N!");
                } else {
                    System.out.println("Impossivel dar continuidade ao programa!");
                    System.out.println("Tamanho da Pilha P: " + P.size());
                    System.out.println("Tamanho da Pilha N: " + N.size());
                }				
            }

        }
    }
	//Executar o programa.
    public static void main(String[] args) {
        TestarPilha.Operacoes();
    }
}
