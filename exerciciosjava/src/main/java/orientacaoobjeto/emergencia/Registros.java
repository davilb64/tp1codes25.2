package main.java.orientacaoobjeto.emergencia;

import java.util.Scanner;

public class Registros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int chamados = entrada.nextInt();
        String analiseCelular;
        Emergencia [] vetorChamados = new Emergencia[chamados];
        entrada.nextLine();
        for (int i = 0; i < chamados; i++) {
            vetorChamados[i] = new Emergencia();
            vetorChamados[i].nomeChamador = entrada.nextLine();
            vetorChamados[i].telefoneChamador = entrada.nextLine();
            vetorChamados[i].localEmergencia = entrada.nextLine();
            vetorChamados[i].dataHoraRelato = entrada.nextLine();
            vetorChamados[i].naturezaEmergencia = entrada.nextLine();
            vetorChamados[i].tipoResposta = entrada.nextLine();
            vetorChamados[i].statusResposta = entrada.nextLine();
            analiseCelular = entrada.nextLine();
            vetorChamados[i].chamadaMovel = analiseCelular.equalsIgnoreCase("sim");
            if (analiseCelular.equalsIgnoreCase("sim")){
                vetorChamados[i].coordenadasGPS = entrada.nextLine();
            }
        }
        for (int i = 0; i < chamados; i++) {
            System.out.println("Emergência #"+(i+1));
            System.out.println();
            vetorChamados[i].mostrarEmergencias();
        }
        entrada.close();
    }

}
