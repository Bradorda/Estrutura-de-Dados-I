import javax.swing.*;

public class Main_Lavajato {

    public static void main(String[] args) {

        Carros I = new Carros();
        Carros II = new Carros();
        Carros III = new Carros();
        Carros IV = new Carros();
        Carros V = new Carros();
        Carros VI = new Carros();
        Carros VII = new Carros();
        Carros VIII = new Carros();
        Carros IX = new Carros();
        Carros X = new Carros();
        Carros XI = new Carros();
        Carros XII = new Carros();
        Carros XIII = new Carros();
        Carros XIV = new Carros();
        Carros XV = new Carros();
        Carros InfoCarro = new Carros();

        Filas ListaCliente = new Filas();
        Filas Lavador = new Filas();
        Filas FilaEspera = new Filas();
        Filas FilaLavados = new Filas();

        I.idCarro = 1081022;
        I.nomeProprietario = "Leonardo";
        I.placaVeiculo = "LEO-0001";
        ListaCliente.adicionar(I);

        II.idCarro = 2081022;
        II.nomeProprietario = "Joao";
        II.placaVeiculo = "JOA-1001";
        ListaCliente.adicionar(II);

        III.idCarro = 3081022;
        III.nomeProprietario = "Maria";
        III.placaVeiculo = "NKJ-8161";
        ListaCliente.adicionar(III);

        IV.idCarro = 4081022;
        IV.nomeProprietario = "Laiza";
        IV.placaVeiculo = "PAZ-1310";
        ListaCliente.adicionar(IV);

        V.idCarro = 5081022;
        V.nomeProprietario = "Bruno";
        V.placaVeiculo = "OOF-3444";
        ListaCliente.adicionar(V);

        VI.idCarro = 6081022;
        VI.nomeProprietario = "Lanna";
        VI.placaVeiculo = "OGN-1017";
        ListaCliente.adicionar(VI);

        VII.idCarro = 7081022;
        VII.nomeProprietario = "Nelma";
        VII.placaVeiculo = "TIA-0001";
        ListaCliente.adicionar(VII);

        VIII.idCarro = 8081022;
        VIII.nomeProprietario = "Joviano";
        VIII.placaVeiculo = "AVO-1934";
        ListaCliente.adicionar(VIII);

        IX.idCarro = 9081022;
        IX.nomeProprietario = "Geovanne";
        IX.placaVeiculo = "CHE-0001";
        ListaCliente.adicionar(IX);

        X.idCarro = 10081022;
        X.nomeProprietario = "Renato";
        X.placaVeiculo = "BOB-4000";
        ListaCliente.adicionar(X);

        XI.idCarro = 11081022;
        XI.nomeProprietario = "Isabella";
        XI.placaVeiculo = "IRM-0001";
        ListaCliente.adicionar(XI);

        XII.idCarro = 12081022;
        XII.nomeProprietario = "Eduarda";
        XII.placaVeiculo = "ANJ-0001";
        ListaCliente.adicionar(XII);

        XIII.idCarro = 13081022;
        XIII.nomeProprietario = "Joarez";
        XIII.placaVeiculo = "PAI-0001";
        ListaCliente.adicionar(XIII);

        XIV.idCarro = 14081022;
        XIV.nomeProprietario = "Carla";
        XIV.placaVeiculo = "PAT-1011";
        ListaCliente.adicionar(XIV);

        XV.idCarro = 15081022;
        XV.nomeProprietario = "Lourdes";
        XV.placaVeiculo = "TIA-0002";
        ListaCliente.adicionar(XV);

        //Enquanto houver clientes.
        while (ListaCliente.tamanhoFila() > 0) {

            //Enquanto lavador estiver vazio.
            while (Lavador.tamanhoFila() == 0) {
                InfoCarro = ListaCliente.remover();
                Lavador.adicionar(InfoCarro);
            }

            //Enquanto houver clientes e Lavador estiver ocupado e Fila de Espera for menor que 3.
            while (ListaCliente.tamanhoFila() > 0 && Lavador.tamanhoFila() == 1 && FilaEspera.tamanhoFila() < 3) {
                InfoCarro = ListaCliente.remover();
                FilaEspera.adicionar(InfoCarro);
            }

            //Enquanto houver clientes e Lavador estiver ocupado e Fila de Espera for igual a 3.
            while (ListaCliente.tamanhoFila() > 0 && Lavador.tamanhoFila() == 1 && FilaEspera.tamanhoFila() == 3) {
                InfoCarro = Lavador.remover();
                FilaLavados.adicionar(InfoCarro);
                JOptionPane.showMessageDialog(null,InfoCarro.nomeProprietario+" Terminou de ser atendido...");
                System.out.println("Cliente: " + InfoCarro.nomeProprietario + " Placa: " + InfoCarro.placaVeiculo + " ID: " + InfoCarro.idCarro);

                InfoCarro = FilaEspera.remover();
                Lavador.adicionar(InfoCarro);
            }

            //Enquanto não houver mais clientes e tiver alguem na Fila de Espera.
            while (ListaCliente.tamanhoFila() == 0 && FilaEspera.tamanhoFila() > 0) {
                InfoCarro = Lavador.remover();
                FilaLavados.adicionar(InfoCarro);
                JOptionPane.showMessageDialog(null,InfoCarro.nomeProprietario+" Terminou de ser atendido...");
                System.out.println("Cliente: " + InfoCarro.nomeProprietario + " Placa: " + InfoCarro.placaVeiculo + " ID: " + InfoCarro.idCarro);

                InfoCarro = FilaEspera.remover();
                Lavador.adicionar(InfoCarro);
            }
        }

        // Se for o ultimo cliente do dia.
        if (ListaCliente.tamanhoFila() == 0 && FilaEspera.tamanhoFila() == 0 && Lavador.tamanhoFila() == 1) {
            InfoCarro = Lavador.remover();
            FilaLavados.adicionar(InfoCarro);
            JOptionPane.showMessageDialog(null,InfoCarro.nomeProprietario+" Terminou de ser atendido...");
            System.out.println("Cliente: " + InfoCarro.nomeProprietario + " Placa: " + InfoCarro.placaVeiculo + " ID: " + InfoCarro.idCarro);
        } else {
            System.out.println("Possiveis motivos ERRO!");
            System.out.println(Lavador.tamanhoFila() + " Clientes no Lavador.");
            System.out.println(FilaEspera.tamanhoFila() + " Clientes na Fila de Espera.");
            System.out.println(ListaCliente.tamanhoFila() + " Lista de Clientes.");
            System.out.println(FilaLavados.tamanhoFila() + " Fila Lavados.");
        }

        int ordernarId = JOptionPane.showConfirmDialog(null, "Imprimir ID dos carros lavados?");
        if (ordernarId == JOptionPane.YES_NO_OPTION) {

            while (FilaLavados.tamanhoFila() > 0) {
                InfoCarro = FilaLavados.remover();
                System.out.println("ID: " + InfoCarro.idCarro);
            }

        } else if (ordernarId == JOptionPane.NO_OPTION) {
            System.out.println("");
        } else {
            System.out.println("");
        }


    }
}
