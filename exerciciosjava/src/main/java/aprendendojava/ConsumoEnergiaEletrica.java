package main.java.aprendendojava;

import java.util.Scanner;

public class ConsumoEnergiaEletrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float taxaBase = 5, valorCalculo, valorTotal;
        String consumoStr = entrada.next();
        float consumo = Float.parseFloat(consumoStr);
        if (consumo <= 500){
            valorCalculo = (float) (consumo * 0.02);
        }
        else if (consumo <= 1000){
            valorCalculo = (float) (50 + (consumo - 500) * 0.05);
        }
        else{
            valorCalculo = (float) (350 + (consumo - 1000) * 0.10);
        }
        valorTotal = valorCalculo + taxaBase;
        System.out.printf("%.2f %.2f %.2f\n", valorCalculo,  taxaBase, valorTotal);

        entrada.close();
    }

}
