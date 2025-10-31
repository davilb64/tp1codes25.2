package herancaepolimorfismo.empresa2;

public class Cliente implements Classificavel{
    private String cpf;
    private String nome;
    private String endereco;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public boolean menorElemento(Classificavel classificavel) {
        Cliente compara = (Cliente) classificavel;

        return this.nome.compareToIgnoreCase(compara.nome) < 0;
    }

    @Override
    public String toString() {
        return cpf + " " + nome + " " + endereco;
    }
}
