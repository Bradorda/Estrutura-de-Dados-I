import java.util.Scanner;
import java.util.Stack;
public class Atividade01 {
	public static void main (String [] args){
		String fraseEntrada,fraseSaida = "";	
		Stack <String> fraseEmpilhada = new Stack <String>();
		Scanner leitor = new Scanner (System.in);
		
		System.out.println ("Digite a frase a ser Invertida: ");
		fraseEntrada = leitor.nextLine();
		
		//Empilhar a frase pegando a primeira letra como referencia.
		for (int letrasFrase = 0 ; letrasFrase < fraseEntrada.length() ; letrasFrase++){
			fraseEmpilhada.push (Character.toString(fraseEntrada.charAt(letrasFrase)));
		}
		
		//Desempilhar a ultima letra da pilha e adiciona na frase de saida.
		String letrasFrase="";
		while ( fraseEmpilhada.size() > 0 ){
			letrasFrase = fraseEmpilhada.pop();
			fraseSaida = fraseSaida + letrasFrase;
		}
		//imprime a frase inversa.
		System.out.println(fraseSaida);
		
		//compara e imprime o resultado.
		if (fraseEntrada.equals(fraseSaida)){
			System.out.println("Palindromo!");
		}
		else {
			System.out.println("Nao Palindromo!");
		}
		
	}
}