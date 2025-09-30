package aprendendojava;

import java.util.Scanner;

public class CalculoIptu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valorFinal;
        String tipoLoteamentoStr = entrada.next();
        int tipoLoteamento = Integer.parseInt(tipoLoteamentoStr);
        entrada.nextLine();
        String metragemStr = entrada.next();
        float metragem = Float.parseFloat(metragemStr);
        if (tipoLoteamento != 1 && tipoLoteamento != 2) {
            System.out.println("Entrada inválida!");
        }
        else if (metragem <= 0) {
            System.out.println("Entrada inválida!");
        }
        else {
            if (tipoLoteamento == 1){
                if (metragem <= 200) {
                    valorFinal = metragem * 1;
                }
                else {
                    valorFinal = (float) (metragem * 1.2);
                }
            }
            else{
                if (metragem <= 200) {
                    valorFinal = (float) (metragem * 1.1);
                }
                else{
                    valorFinal = (float) (metragem * 1.3);
                }
            }
            System.out.printf("%.2f\n",valorFinal);
        }

        entrada.close();
    }
}
