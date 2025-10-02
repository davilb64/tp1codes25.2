package main.java.aprendendojava;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoIdeal;
        String alturaStr = entrada.next();
        double altura = Double.parseDouble(alturaStr);
        entrada.nextLine();
        String sexoStr = entrada.nextLine();
        char sexo = sexoStr.charAt(0);
        if (altura <= 0){
            System.out.println("Entrada inválida!");
        }
        else if(sexo != 'm' &&  sexo != 'f'){
            System.out.println("Entrada inválida!");
        }
        else{
            if(sexo == 'm'){
                pesoIdeal = (72.7 * altura)-58;
            }
            else {
                pesoIdeal = (62.1 * altura)-44.7;
            }
            System.out.printf("%.1f kg\n", pesoIdeal);
        }
        entrada.close();
    }
}