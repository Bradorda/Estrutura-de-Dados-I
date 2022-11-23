import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Filas FilaDecolagem = new Filas();
        Filas FilaEspera = new Filas();
        int resposta;

        Aviao I = new Aviao();
        Aviao II = new Aviao();
        Aviao III = new Aviao();
        Aviao IV = new Aviao();
        Aviao V = new Aviao();
        Aviao VI = new Aviao();
        Aviao VII = new Aviao();
        Aviao VIII = new Aviao();
        Aviao InfoAviao = new Aviao();

        I.idAviao = 1;I.nome="Cessna 172"; FilaDecolagem.adicionar(I);

        II.idAviao = 2;II.nome="Boeing 737";FilaDecolagem.adicionar(II);

        III.idAviao = 3;III.nome="Airbus A320";FilaDecolagem.adicionar(III);

        IV.idAviao = 4;IV.nome="Bombardier CRJ";FilaDecolagem.adicionar(IV);

        V.idAviao = 5;V.nome="Boeing 727";FilaDecolagem.adicionar(V);

        VI.idAviao = 6;VI.nome="Boeing 777";FilaDecolagem.adicionar(VI);

        VII.idAviao = 7;VII.nome="Boeing 747";FilaDecolagem.adicionar(VII);

        VIII.idAviao = 8;VIII.nome="Airbus A330";FilaDecolagem.adicionar(VIII);

        System.out.println("Menu Escolha: ");
        System.out.println("[ 1 ] Listar o numero de avioes aguardando na fila de decolagem;");
        System.out.println("[ 2 ] Autorizar a decolagem do primeiro aviao da fila;");
        System.out.println("[ 3 ] Adicionar um aviao a fila de espera;");
        System.out.println("[ 4 ] Listar todos os avioes na fila de espera;");
        System.out.println("[ 5 ] Listar as caracteristicas do primeiro aviao da fila");
        System.out.println("[ 6 ] Exibir Menu Escolha novamente.");
        System.out.println("[ 7 ] Cancelar!");
        resposta = leitor.nextInt();


        while (resposta >= 1 && resposta <= 6) {
            switch (resposta) {
                case 1:
                    System.out.println(FilaDecolagem.tamanhoFila() + " Avioes aguardando na fila de decolagem");
                    System.out.println("Escolha outra funcao [ 6 ] Exibir Menu Escolha");
                    resposta = leitor.nextInt();
                    break;

                case 2:
                    if (FilaDecolagem.tamanhoFila() > 0) {
                        InfoAviao = FilaDecolagem.remover();
                        System.out.println(InfoAviao.nome + " ID " + InfoAviao.idAviao + " Iniciou a Decolagem!");
                        System.out.println("Escolha outra funcao [ 6 ] Exibir Menu Escolha");
                        resposta = leitor.nextInt();
                    }
                    else if  (FilaDecolagem.tamanhoFila() == 0){
                        System.out.println("Fila de Decolagem vazia, Escolha outra funcao [ 6 ] Exibir Menu Escolha");
                        resposta = leitor.nextInt();
                    }
                    break;

                case 3:
                    if (FilaDecolagem.tamanhoFila() > 0) {
                        InfoAviao = FilaDecolagem.remover();
                        FilaEspera.adicionar(InfoAviao);
                        System.out.println(InfoAviao.nome + " ID " + InfoAviao.idAviao + " Entrou na fila de Espera!");
                        System.out.println("Escolha outra funcao [ 6 ] Exibir Menu Escolha");
                        resposta = leitor.nextInt();
                    }
                    else if  (FilaDecolagem.tamanhoFila() == 0){
                        System.out.println("Nenhum Aviao para Adicionar a fila de Espera, Escolha outra funcao [ 6 ] Exibir Menu Escolha");
                        resposta = leitor.nextInt();
                    }

                    break;
                case 4:
                    System.out.println(FilaEspera.tamanhoFila() + " Avioes na fila de Espera");
                    System.out.println("Escolha outra funcao [ 6 ] Exibir Menu Escolha");
                    resposta = leitor.nextInt();

                    break;
                case 5:
                    InfoAviao.getIdAviao();
                    System.out.println("ID Aviao da Fila: "+InfoAviao.idAviao);
                    InfoAviao.getnome();
                    System.out.println("Nome Aviao da Fila: "+InfoAviao.nome);
                    System.out.println("Escolha outra funcao [ 6 ] Exibir Menu Escolha");
                    resposta = leitor.nextInt();
                    break;

                case 6:
                    System.out.println("Menu Escolha: ");
                    System.out.println("[ 1 ] Listar o numero de avioes aguardando na fila de decolagem;");
                    System.out.println("[ 2 ] Autorizar a decolagem do primeiro aviao da fila;");
                    System.out.println("[ 3 ] Adicionar um aviao a fila de espera;");
                    System.out.println("[ 4 ] Listar todos os avioes na fila de espera;");
                    System.out.println("[ 5 ] Listar as caracteristicas do primeiro aviao da fila");
                    System.out.println("[ 6 ] Exibir Menu Escolha novamente.");
                    System.out.println("[ 7 ] Cancelar!");
                    resposta = leitor.nextInt();
                    break;
            }
        }

        System.out.println("Operacao Cancelada pelo usuario!");



    }

}
