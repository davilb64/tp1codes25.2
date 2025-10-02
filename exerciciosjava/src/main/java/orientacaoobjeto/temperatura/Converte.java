package main.java.orientacaoobjeto.temperatura;
import java.util.Scanner;
class Converte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Temperatura temp = new Temperatura(entrada.nextDouble());
        temp.CelsiusToFahrenheit();
        System.out.println("temperatura: " + temp + " graus fahrenheit" );
        temp.FahrenheitToCelsius();
        System.out.println("temperatura: " + temp + " graus celsius" );

        entrada.close();
    }
}
