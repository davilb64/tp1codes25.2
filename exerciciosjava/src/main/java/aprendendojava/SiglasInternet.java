package main.java.aprendendojava;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SiglasInternet {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LinkedHashMap<String, String> siglas = new LinkedHashMap<>();
        int sentencas = entrada.nextInt();
        for (int i = 0; i < sentencas; i++) {
            String siglaAtual = entrada.next();
            String palavraAtual = entrada.next();
            siglas.put(siglaAtual, palavraAtual);
        }
        entrada.nextLine();
        String sentencaAnalisada = entrada.nextLine();

        String[] palavras = sentencaAnalisada.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            String original = palavras[i];
            String chave = original.toLowerCase();
            if (siglas.containsKey(chave)) {
                palavras[i] = siglas.get(chave);
            } else if (Character.isUpperCase(original.charAt(0))) {
                palavras[i] = original.substring(0, 1).toUpperCase() + original.substring(1);
            }
        }
        String resultado = String.join(" ", palavras);
        System.out.println(resultado);
    }
}