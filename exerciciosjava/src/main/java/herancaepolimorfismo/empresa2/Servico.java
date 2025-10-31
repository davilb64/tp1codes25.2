package herancaepolimorfismo.empresa2;

public class Servico implements Classificavel {
    private double preco;
    private String data;
    private String tipoServico;

    public Servico(String tipoServico ,double preco, String data) {
        this.preco = preco;
        this.data = data;
        this.tipoServico = tipoServico;
    }

    @Override
    public boolean menorElemento(Classificavel classificavel) {
        Servico compara = (Servico) classificavel;
        return this.preco < compara.preco;
    }

    @Override
    public String toString() {
        return tipoServico + " " + preco + " " + data;
    }
}
