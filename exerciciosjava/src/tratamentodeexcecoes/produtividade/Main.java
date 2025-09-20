package tratamentodeexcecoes.produtividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            String nome = entrada.nextLine();
            int producao = entrada.nextInt();
            int horas = entrada.nextInt();
            Funcionario funcionario = new Funcionario(nome, producao, horas);
            double produtividade = funcionario.calcularProdutividade();
            System.out.printf("Produtividade: %.0f peças por hora%n", produtividade);
        } catch (ArithmeticException e){
            System.out.println("Erro: horas trabalhadas não podem ser zero.");
        } catch (RuntimeException e){
            System.out.println("Erro inesperado");
        }

        entrada.close();
    }
}
