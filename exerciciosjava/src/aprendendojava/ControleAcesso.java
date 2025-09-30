package aprendendojava;

import java.util.Scanner;

public class ControleAcesso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int homens = 0, mulheres = 0;
        double ingressosHomens = 0, ingressosMulheres = 0, total = 0;
        char entradaAtual = '0';
        while (entradaAtual != 'q') {
            String entradaAtualStr = entrada.next();
            entradaAtual = entradaAtualStr.charAt(0);
            if (entradaAtual == 'h'){
                homens++;
            }
            if (entradaAtual == 'm'){
                mulheres++;
            }
        }
        ingressosHomens = homens * 12.50;
        ingressosMulheres = mulheres * 7.40;
        total = ingressosHomens + ingressosMulheres;
        System.out.printf("%d %d\n%.2f %.2f %.2f\n", homens, mulheres, ingressosHomens, ingressosMulheres, total);


        entrada.close();
    }
}
