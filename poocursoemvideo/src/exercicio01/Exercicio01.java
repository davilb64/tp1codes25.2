package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        ContaBanco ze =  new ContaBanco();
        ze.abrirConta("CC", "Ze Doido");
        ze.depositar(500);
        ze.exibirConta();
        ze.sacar(500);
        ze.exibirConta();
        ze.pagarMensal();
        ze.exibirConta();
        ze.sacar(500);
        ze.sacar(38);
        ze.fecharConta();
        ze.exibirConta();

        ContaBanco esquisita =  new ContaBanco();
        esquisita.abrirConta("CP", "Esquisita");
    }

}
