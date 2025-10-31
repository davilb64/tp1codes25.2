package herancaepolimorfismo.empresa2;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Classificador classifica = new Classificador();

        int numProduto = entrada.nextInt();
        int numCliente = entrada.nextInt();
        int numServico = entrada.nextInt();

        Produto[] produtos = new Produto[numProduto];

        for(int i = 0; i < numProduto; i++){
            produtos[i] = new Produto(entrada.nextInt(), entrada.next(), entrada.nextDouble());
        }

        Cliente[] clientes = new Cliente[numCliente];

        for(int i = 0; i < numCliente; i++){
            clientes[i] = new Cliente(entrada.next(), entrada.next(), entrada.next());
        }

        Servico[] servicos = new Servico[numServico];

        for(int i = 0; i < numServico; i++){
            servicos[i] = new Servico(entrada.next(), entrada.nextDouble(), entrada.next());
        }

        classifica.ordena(produtos);
        classifica.ordena(clientes);
        classifica.ordena(servicos);

        for(int i = 0; i < numProduto; i++) {
            System.out.println(produtos[i].toString());
        }

        for(int i = 0; i < numCliente; i++) {
            System.out.println(clientes[i].toString());
        }

        for(int i = 0; i < numServico; i++) {
            System.out.println(servicos[i].toString());
        }

    }
}
