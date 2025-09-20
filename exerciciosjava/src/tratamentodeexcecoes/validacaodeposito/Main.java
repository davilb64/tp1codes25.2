package tratamentodeexcecoes.validacaodeposito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            double deposito = 0.0;
            Conta c1 = null;

            try {
                int agencia = entrada.nextInt();
                int numero = entrada.nextInt();
                deposito = entrada.nextDouble();

                c1 = new Conta(agencia, numero);
                c1.depositoPersonalizado(deposito);

                System.out.println("Depósito realizado com sucesso.");
                System.out.printf("Valor %.2f depositado na conta. Novo saldo: %.2f\n",
                        deposito, c1.getSaldo());

            } catch (DepositoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
                if (c1 != null) {
                    System.out.printf("Valor %.2f incorreto. Saldo atual: %.2f\n", deposito, c1.getSaldo());
                }
            } finally {
                entrada.close();
            }
    }
}
