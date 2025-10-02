package main.java.orientacaoobjeto.banco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        entrada.next();
        int senha = Integer.parseInt(entrada.next());
        String nome = entrada.next();
        double valor = Double.parseDouble(entrada.next());
        Conta conta1 = new Conta(senha, nome, valor);

        entrada.next();
        senha = Integer.parseInt(entrada.next());
        nome = entrada.next();
        valor = Double.parseDouble(entrada.next());
        Conta conta2 = new Conta(senha, nome, valor);

        while(true){
            int opcao = Integer.parseInt(entrada.next());
            if(opcao == 1){
                double valor1 = Double.parseDouble(entrada.next());
                if (conta1.getSaldo((int)valor1) < 0){
                    System.out.println("senha incorreta");
                }
                else{
                    System.out.printf("%.2f\n",conta1.getSaldo((int)valor1));
                }
            }

            else if(opcao == 2){
                if (conta1.sacar(entrada.nextDouble(),entrada.nextInt())){
                    System.out.println("saque realizado");
                }
                else {
                    System.out.println("saque não realizado");
                }
            }

            else if(opcao == 3){
                if (conta1.depositar(entrada.nextDouble(), entrada.nextInt())){
                    System.out.println("depósito realizado");
                }
                else {
                    System.out.println("depósito não realizado");
                }
            }

            else if(opcao == 4){
                if (entrada.next().equals(conta2.getNome())){
                    if (conta1.transferencia(conta2, entrada.nextDouble(), entrada.nextInt())){
                        System.out.println("transferência realizada");
                    }
                    else {
                        System.out.println("transferência não realizada");
                    }

                }
                else {
                    System.out.println("nenhum usuário encontrado");
                }
            } else if (opcao == 5) {
                break;
            }
        }

        entrada.close();
    }
}
