package orientacaoobjeto.circulo;

import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Circulo[] vetor1, vetor2, vetor3;
        vetor3 =  new Circulo[3];
        for(int i = 0; i < 3; i++){
            vetor3[i] = new Circulo(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        }

        vetor1 = new Circulo[3];
        vetor2 = new Circulo[3];
        for (int i = 0; i < 3; i++) {
            vetor1[i] = new Circulo(vetor3[i].getX(), vetor3[i].getY(), vetor3[i].getRaio());
            vetor2[i] = new Circulo(vetor3[i].getX(), vetor3[i].getY(), vetor3[i].getRaio());
        }

        int[] vetorAltera = new int[3];
        for(int i = 0; i < 3; i++){
            vetorAltera[i] = entrada.nextInt();
        }

        for(int i = 0; i < 3; i++){
            vetor1[i].setRaio(vetorAltera[i]);
            vetor2[i].setRaio(vetorAltera[i]);
        }

        System.out.println("vetor1:");
        for(int j = 0; j < 3; j++){
            System.out.println(vetor1[j].getX() + " " + vetor1[j].getY() + " " + vetor1[j].getRaio());
        }
        System.out.println("vetor2:");
        for(int j = 0; j < 3; j++){
            System.out.println(vetor2[j].getX() + " " + vetor2[j].getY() + " " + vetor2[j].getRaio());
        }
        System.out.println("vetor3:");
        for(int j = 0; j < 3; j++){
            System.out.println(vetor3[j].getX() + " " + vetor3[j].getY() + " " + vetor3[j].getRaio());
        }



        entrada.close();
    }
}
