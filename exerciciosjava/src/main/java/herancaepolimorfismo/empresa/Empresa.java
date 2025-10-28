package herancaepolimorfismo.empresa;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[4];

        String nome = entrada.next();
        String cidade = entrada.next();
        String mes = entrada.next();

        funcionarios[0] = new Chefe(entrada.next(), entrada.next(), entrada.nextFloat(), entrada.next());
        funcionarios[1] = new Vendedor(entrada.next(), entrada.next(), entrada.nextFloat(), entrada.nextFloat(), entrada.nextInt());
        funcionarios[2] = new Operario(entrada.next(), entrada.next(), entrada.nextFloat(), entrada.nextFloat(), entrada.nextInt());
        funcionarios[3] = new Horista(entrada.next(), entrada.next(), entrada.nextFloat(), entrada.nextFloat(), entrada.nextInt());

        FolhaPagamento folha = new FolhaPagamento();
        folha.mostrarPagamentos(nome, cidade, mes, funcionarios);
    }
}
