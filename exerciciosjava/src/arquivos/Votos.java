package arquivos;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Votos {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int[] votos = new int[4];
        for(int i = 0; i < 4; i++){
            votos[i] = entrada.nextInt();
        }
        FileWriter escrita = new FileWriter("exerciciosjava/src/arquivos/caminho.txt", false);
        for (int i = 0; i < 4; i++) {
            escrita.write("Time: " + i + ": " + votos[i] + " votos\n");
        }

        System.out.println("Votos Registrados!");
        escrita.close();
        entrada.close();
    }
}
