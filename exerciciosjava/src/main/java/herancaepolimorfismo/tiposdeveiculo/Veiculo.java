package herancaepolimorfismo.tiposdeveiculo;

public class Veiculo {
    protected String placa;
    protected int numeroPortas;
    protected float preco;

    public Veiculo(){}

    public Veiculo(String placa, int numeroPortas, float preco) {
        this.placa = placa;
        this.numeroPortas = numeroPortas;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Placa: " + this.placa + " Número de portas: " +  this.numeroPortas + " Preço: R$" + this.preco;
    }
}
