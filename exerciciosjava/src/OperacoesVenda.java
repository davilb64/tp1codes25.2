import java.util.Scanner;
import java.util.LinkedHashMap;

public class OperacoesVenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cadastrosQnt = entrada.nextInt();
        LinkedHashMap<String, Integer> produtos = new LinkedHashMap<>();
        for (int i = 0; i < cadastrosQnt; i++) {
            String nome = entrada.next();
            int qnt = entrada.nextInt();
            produtos.put(nome, qnt);
        }
        String produtoSolicitado = entrada.next();
        while (!produtoSolicitado.equals("fim")) {
            if (!produtos.containsKey(produtoSolicitado)) {
                System.out.println(produtoSolicitado + " produto não encontrado");
            } else {
                int quantidadeSolicitada = entrada.nextInt();
                int quantidadeAtual = produtos.get(produtoSolicitado) - quantidadeSolicitada;
                produtos.put(produtoSolicitado, quantidadeAtual);
                System.out.println(produtoSolicitado + " " + quantidadeSolicitada);
            }
            produtoSolicitado = entrada.next();
        }
        for (String produto : produtos.keySet()) {
            System.out.println(produto + " " + produtos.get(produto));
        }
    }
}