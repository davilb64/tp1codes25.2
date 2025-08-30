import java.util.Scanner;

public class CorretorOrtografico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean correta = false;
        int qnt = entrada.nextInt();
        String[] banco = new String[qnt];
        for (int i = 0; i < qnt; i++) {
            String palavraAtual = entrada.next();
            banco[i] = palavraAtual;
            entrada.nextLine();
        }
        String palavraAnalisada = entrada.next();
        for (int i = 0; i < qnt; i++) {
            if (palavraAnalisada.equals(banco[i])) {
                System.out.println("palavra correta");
                correta = true;
                break;
            }
        }

        if (!correta) {
            System.out.println("palavra incorreta");
            boolean sugestaoEncontrada = false;
            for (int i = 0; i < palavraAnalisada.length() - 1; i++) {
                char[] letras = palavraAnalisada.toCharArray();
                char temp = letras[i];
                letras[i] = letras[i + 1];
                letras[i + 1] = temp;
                String transposta = new String(letras);
                for (int j = 0; j < qnt; j++) {
                    if (transposta.equals(banco[j])) {
                        System.out.println(banco[j] + "?");
                        sugestaoEncontrada = true;
                        break;
                    }
                }
                if (sugestaoEncontrada) break;
            }

            if (!sugestaoEncontrada) {
                System.out.println("nenhuma sugestão");
            }
        }

    }
}

