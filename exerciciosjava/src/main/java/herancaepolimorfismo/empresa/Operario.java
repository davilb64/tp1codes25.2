package herancaepolimorfismo.empresa;

public class Operario extends Funcionario {
    private float valorProducao;
    private int quantidadeProdizida;

    public Operario() {
    }

    public Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProdizida) {
        super(nome, dataNascimento, valorProducao * quantidadeProdizida);
        this.valorProducao = valorProducao;
        this.quantidadeProdizida = quantidadeProdizida;
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQuantidadeProdizida() {
        return quantidadeProdizida;
    }

    public void setQuantidadeProdizida(int quantidadeProdizida) {
        this.quantidadeProdizida = quantidadeProdizida;
    }
}
