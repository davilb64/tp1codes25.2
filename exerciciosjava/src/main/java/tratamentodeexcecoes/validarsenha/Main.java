package main.java.tratamentodeexcecoes.validarsenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){
            try{
                String senha = entrada.next();
                ValidarSenha valida = new ValidarSenha();
                valida.verificarMaiusculas(senha);
                System.out.println("Senha válida");
                break;
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        entrada.close();
    }


}
