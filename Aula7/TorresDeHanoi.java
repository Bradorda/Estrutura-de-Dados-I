import java.util.Scanner;
import java.util.Stack;

public class TorresDeHanoi {

    Pilha pilha = new Pilha();
    static Timer timer = new Timer();//em teste.

    public static void main(String[] args) {

        int disco;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de discos: ");
        disco = leitor.nextInt();

        for ( int contador = 1; Pilha.origem.size() < disco ; contador ++){
            Pilha.origem.push(contador);
        }

		Pilha.hanoi(Pilha.origem.size()-1 ,Pilha.origem,Pilha.destino , Pilha.trabalho);

        System.out.println ("Movimentos: "+Pilha.movimentos);
        System.out.println("Tempo de Execucao: "+timer );//em teste.
    }
}
