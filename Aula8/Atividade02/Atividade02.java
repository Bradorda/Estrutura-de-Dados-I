import java.util.Stack;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Atividade02 {
    public static void main(String[] args) {
        Stack<String> pilhaItens = new Stack<String>();
        Stack<String> pilhaOriginal = new Stack<String>();
        Stack<String> pilhaExecucao = new Stack<String>();
        String c;
        String nomeItem;
        int itensPilha;

        //Registrando a chave c.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Registre a chave: ");
        c = leitor.next();

        //quantidade de itens na pilha.
        System.out.println("Quantidade de itens na pilha: ");
        itensPilha = leitor.nextInt();

        //identificando itens de acordo com a quantidade fornecida pelo usuario para facilitar o entendimento do programa.
        for (int contador = 1; pilhaItens.size() < itensPilha; contador++) {
            System.out.println("identifique o item " + contador + "/" + itensPilha);
            nomeItem = leitor.next();
            pilhaItens.push(nomeItem);
        }

        pilhaOriginal = pilhaItens;


        int confirmacao = 0;
        while (confirmacao != 2) {
            confirmacao = JOptionPane.showConfirmDialog(null, "[Yes] Empilhar , [ No ] Desempilhar , [Cancel] Cancelar ");

            //Processo de empilhamento.
            if (confirmacao == 0) {
                String verificarChave = JOptionPane.showInputDialog("Insira a chave c");
                if (verificarChave.equals(c) && pilhaItens.size() > 0) {
                    nomeItem = pilhaItens.pop();
                    pilhaExecucao.push(nomeItem);
                    System.out.println("Acesso Liberado");
                    System.out.println(nomeItem + " Adicionado na Pilha de Execucao!");
                } else {
                    System.out.println("Chave Invalida ou Pilha Execucao Cheia.");
                }
            }

            //Processo de Desempilhamento.
             else if (confirmacao == 1) {
                String verificarChave = JOptionPane.showInputDialog("Insira a chave c");
                if (verificarChave.equals(c) && pilhaExecucao.size() > 0) {
                    nomeItem = pilhaExecucao.pop();
                    pilhaItens.push(nomeItem);
                    System.out.println("Acesso Liberado");
                    System.out.println(nomeItem + " Removido da Pilha de Execucao!");
                } else {
                    System.out.println("Chave Invalida ou Pilha de Execucao Vazia.");
                }
            }

             //Cancelar.
            else{
                System.out.println("Operacao Cancelada!");
            }
        }

    }
}
