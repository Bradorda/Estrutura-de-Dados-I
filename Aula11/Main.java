import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackDinamica pilhaOutros = new StackDinamica();
        StackDinamica pilhaAbertas = new StackDinamica();
        StackDinamica pilhaFechadas = new StackDinamica();
        int fimPrograma = 0;


        Scanner leitor = new Scanner(System.in);
        String matEntrada;

        System.out.println("Digite a expressao matematica: ");
        matEntrada = leitor.nextLine();

        //percorre pela expressao informada pelo usuario.
        for (int numerosConta = 0; numerosConta < matEntrada.length(); numerosConta++) {
            String verificar = Character.toString(matEntrada.charAt(numerosConta));

            //verificar se e um abre
            if (verificar.equals("(") || verificar.equals("{") || verificar.equals("[")){
                pilhaAbertas.push(verificar);
            }

            //Verificar se e um fecha, e se existe um abre exclusivo para esse fecha.
            else if (verificar.equals(")") || verificar.equals("}") || verificar.equals("]")){
                pilhaFechadas.push(verificar);

                if(pilhaAbertas.isEmpty()){
                    numerosConta = matEntrada.length();//Fim do Programa.
                    fimPrograma = 1;
                }

                else if (pilhaAbertas.top.getDado().equals("(") && pilhaFechadas.top.getDado().equals(")")) {
                    pilhaAbertas.pop();
                    pilhaFechadas.pop();
                }
                else if (pilhaAbertas.top.getDado().equals("{") && pilhaFechadas.top.getDado().equals("}")) {
                    pilhaAbertas.pop();
                    pilhaFechadas.pop();
                }
                else if (pilhaAbertas.top.getDado().equals("[") && pilhaFechadas.top.getDado().equals("]")) {
                    pilhaAbertas.pop();
                    pilhaFechadas.pop();
                }

                else{
                    numerosConta = matEntrada.length();//Fim do Programa.
                    fimPrograma = 1;
                }
            }
            //Adicionar numeros e operadores em uma pilha diferente.
            else {
                pilhaOutros.push(verificar);
            }
        }

        if (pilhaAbertas.sizePilha() > 0 || fimPrograma == 1){
            System.out.println("Parametrizacao Incorreta! ");
        }else {
            System.out.println("Parametrizacao Correta! ");
        }

    }
}
