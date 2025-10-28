package herancaepolimorfismo.tiposdeveiculo;

import java.util.Scanner;

public class UsaVeiculo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(entrada.next());
        veiculo.setNumeroPortas(entrada.nextInt());
        veiculo.setPreco(entrada.nextFloat());
        Carro carro = new Carro(entrada.next(), entrada.nextInt(), entrada.nextFloat(), entrada.next());
        Moto moto = new Moto(entrada.next(), entrada.nextInt(), entrada.nextFloat(), entrada.nextInt());

        System.out.println(veiculo);
        System.out.println(carro);
        System.out.println(moto);

    }

}
