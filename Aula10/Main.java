import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        ListaDupla listaCrescente = new ListaDupla();
        ListaDupla listaDecrescente = new ListaDupla();
        Random gerador = new Random();
        int [] vetor = new int[1000];


        //Criar uma aplicação para gerar 1000 números aleatórios de -9999 a 9999 e armazená-los  num vetor de posições.
        for (int i =0 ; i < 1000 ; i++) {
            int numerosAleatorio = gerador.nextInt(-9999, 9999);
            vetor[i]=numerosAleatorio;
            lista.Adicionar(vetor[i]);
            // Faça a impressão desses números na sua ordem de geração.
            System.out.println(numerosAleatorio);
        }
        System.out.println("------------------");

        //Crescente
        for (int i = -9999; i <= 9999; i++){
            if(lista.Contem(i)){
                listaCrescente.Adicionar(i);
            }
        }
        System.out.println("Crescente!");
        listaCrescente.imprimir();

        //Decrescente
        for (int i = 9999; i >= -9999 ; i--){
            if(lista.Contem(i)){
                listaDecrescente.Adicionar(i);
            }
        }
        System.out.println("Decrescente!");
        listaDecrescente.imprimir();

        //Percorrer a Lista e Remover os Primos.
        int verificar;
        for (int i = 0; i <= lista.totaldeElementos-1 ; i++){
            verificar = (int) lista.pegar(i);
            if(verificar > 3 && verificar % 2 != 0){
                lista.remover(i);
            }
        }
        System.out.println("Sem N Primos!");
        lista.imprimir();
        
    }
}