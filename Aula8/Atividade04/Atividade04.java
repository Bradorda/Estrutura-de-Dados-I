import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;
public class Atividade04 {
    public static void main (String []args){

        Random gerador = new Random();

        List<Integer> F1 = new ArrayList();
        List<Integer> F2 = new ArrayList();

        Stack <Integer> PilhaInversora = new Stack <Integer> ();
        int dados;
        int numeroAleatorio;

		//Fila F1 " Primeiro a entrar Primeiro a sair ".
		for ( int i = 0 ; i < 100 ; i++){
			numeroAleatorio = gerador.nextInt(10000);
			F1.add(numeroAleatorio);
			System.out.println (numeroAleatorio + " Adicionado a F1!");
		}

        System.out.println(F1.size());

		//Pilha para inverter as posicoes " ultimo a entrar primeiro a sair ".
        for ( int i = 0; i < 100 ; i++){
            dados = F1.remove(0);
            PilhaInversora.push(dados);
            System.out.println(PilhaInversora.size());
        }

        //Fila F2 " Pega o topo da Pilha ou seja Ultimo da F1 ".
		while(PilhaInversora.size() > 0){
			dados = PilhaInversora.pop();
			F2.add(dados);
			System.out.println (dados + " Adicionado a F2!");
		}
        System.out.println("Pilha Tamamnho "+PilhaInversora.size());
        System.out.println("Fila1 Tamanho "+F1.size());
        System.out.println("Fila2 Tamanho "+F2.size());

    }
}