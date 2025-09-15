package orientacaoobjeto.retangulo;


import java.util.Scanner;

public class Formas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();
        retangulo1.setComprimento(entrada.nextInt());
        retangulo1.setLargura(entrada.nextInt());
        retangulo2.setComprimento(entrada.nextInt());
        retangulo2.setLargura(entrada.nextInt());

        System.out.println(retangulo1.getComprimento() + " " +  retangulo1.getLargura() + " " + retangulo1.perimetro() + " " + retangulo1.area());
        System.out.println(retangulo2.getComprimento() + " " +  retangulo2.getLargura() + " " + retangulo2.perimetro() + " " + retangulo2.area());
        entrada.close();
    }
}
