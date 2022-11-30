import java.util.Random;

public class ProblemaJosephus {
    public static void main(String[] args) {

        //Criacao da Lista e Gerador para sortear.
        ListaLigada lista = new ListaLigada();
        Random gerador = new Random();

        //Criacao das Pessoas da roda e Coletor de informacoes.
        Pessoas p1 = new Pessoas("Alysson", "Morrinhos - GO", "001.001.001-01", "64 99816-1415");
        Pessoas p2 = new Pessoas("Fagner", "Caldas Novas - GO", "041.401.140-01", "64 992158-1614");
        Pessoas p3 = new Pessoas("Gabriel", "Sinop - MT", "063.125.963.12", "66 99901-0012");
        Pessoas p4 = new Pessoas("Victor", "Rondonopolis - MT", "789.456.123-12", "66 98431-8896");
        Pessoas p5 = new Pessoas("Sandra", "Cuiaba - MT", "741.852.963-13", "66 92139-8810");
        Pessoas p6 = new Pessoas("Maria", "Palmas - TO", "852.963.741-79", "65 93152-1121");
        Pessoas p7 = new Pessoas("Pedro", "Morrinhos - GO", "123.851.645-55", "64 992457484");
        Pessoas p8 = new Pessoas("Luiza", "Caldas Novas - GO", "741.852.321-56", "64 99821-0279");
        Pessoas p9 = new Pessoas("Guilherme", "Goiania - GO", "753.741.951-19", "62 98416-4412");
        Pessoas p10 = new Pessoas("Camila", "Sorriso - MT", "456.148.996-33", "66 996127416");
        Pessoas p11 = new Pessoas("Ricardo", "Cladia - MT", "789.223.747-88", "66 99622-3300");
        Pessoas p12 = new Pessoas("Geovanne", "Morrinhos - GO", "147.258.987-63", "64 99231-9615");
        Pessoas p13 = new Pessoas("Renato", "Rio de Janeiro - RJ", "841.559.632-44", "21 98145-2234");
        Pessoas p14 = new Pessoas("Rodrigo", "Sao Paulo - SP", "798.552.025-08", "11 98102-5234");
        Pessoas p15 = new Pessoas("Vitoria", "Sao Paulo - SP", "002.598.741-99", "11 98100-5999");
        Pessoas p16 = new Pessoas("Manuel", "Caxias - SC", "741.332.610-98", "47 99631-5621");
        Pessoas p17 = new Pessoas("Leandro", "Santos - SP", "119.963.151-00", "11 96315-5100");
        Pessoas p18 = new Pessoas("Jessica", "Ribeirao Preto - SP", "789.663.149-16", "11 96461-2155");
        Pessoas p19 = new Pessoas("Leonardo", "Morrinhos - GO", "051.660.998-10", "64 99275-7551");
        Pessoas p20 = new Pessoas("Tabata", "Santos - SP", "789.166.312-16", "11 98715-9981");
        Pessoas p21 = new Pessoas(null,null,null,null);
        Pessoas pInfo = new Pessoas("", "", "", "");

        //Adicionar na lista.
        lista.adicionaNoComeco(p1);
        lista.adiciona(p2);
        lista.adiciona(p3);
        lista.adiciona(p4);
        lista.adiciona(p5);
        lista.adiciona(p6);
        lista.adiciona(p7);
        lista.adiciona(p8);
        lista.adiciona(p9);
        lista.adiciona(p10);
        lista.adiciona(p11);
        lista.adiciona(p12);
        lista.adiciona(p13);
        lista.adiciona(p14);
        lista.adiciona(p15);
        lista.adiciona(p16);
        lista.adiciona(p17);
        lista.adiciona(p18);
        lista.adiciona(p19);
        lista.adiciona(p20);
        lista.adiciona(p21);//Null

        //Enquanto a lista tiver mais de 1.
        while (lista.totalDeElementos > 1) {

           //Sortear e buscar posicao.
           int posicaoNaRoda = gerador.nextInt(1, lista.totalDeElementos);
           for (int i = 0; i < posicaoNaRoda; i++) {
                pInfo = (Pessoas) lista.pega(i);
            }

           //Sobrevivente.
           if(lista.tamanho() == 2){
               System.out.println("---------------------------------");
               System.out.println("Sobrevivente: "+pInfo.nome);
               System.out.println("CPF: "+pInfo.cpf);
               System.out.println("Telefone: "+pInfo.telefone);
               System.out.println("Endereco: "+pInfo.endereco);
               lista.remover(posicaoNaRoda);
           }

           //Eliminados.
           else{
                System.out.println("Parou e Removeu: " + pInfo.nome);
                lista.remover(posicaoNaRoda);
            }
        }
    }
}
