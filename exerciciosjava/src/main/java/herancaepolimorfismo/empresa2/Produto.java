package herancaepolimorfismo.empresa2;

public class Produto implements Classificavel {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean menorElemento(Classificavel classificavel) {
        Produto compara = (Produto) classificavel;
        return this.codigo < compara.codigo;
    }

    @Override
    public String toString() {
        return codigo + " " + nome + " " + preco;
    }
}
