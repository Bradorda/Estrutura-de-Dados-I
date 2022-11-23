import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Atividade07 {

    //Metodo de inversao!
    static void inverter () {
        Stack <Integer> Pilha = new Stack<Integer>();
        List <Integer> FilaInversa = new ArrayList ();
        List <Integer> Fila = new ArrayList ();
        for(int i = 0; i < 20 ; i++) {
            Fila.add(i);
			System.out.println(i+" Adicionado a Fila.");
        }
        int dados;

        while(FilaInversa.size() != 20) {

            if(Fila.size() >0) {
                dados = Fila.remove(0);
                Pilha.push(dados);
            } else if (Fila.size()== 0 && Pilha.size() >0) {
                dados = Pilha.pop();
                FilaInversa.add(dados);
				System.out.println (dados+" Adicionado a Fila Inversa");
            }
        }


    }

    //Executa o metodo de inversao!
    public static void main(String[] args) {

        Atividade07.inverter();
        
    }
}