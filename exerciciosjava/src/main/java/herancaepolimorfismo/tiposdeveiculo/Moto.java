package herancaepolimorfismo.tiposdeveiculo;

public class Moto extends Veiculo {
    private int qtdCilindradas;

    public Moto() {
    }

    public Moto(String placa, int numeroPortas, float preco, int qtdCilindradas) {
        super(placa, numeroPortas, preco);
        this.qtdCilindradas = qtdCilindradas;
    }

    public int getQtdCilindradas() {
        return qtdCilindradas;
    }

    public void setQtdCilindradas(int qtdCilindradas) {
        this.qtdCilindradas = qtdCilindradas;
    }

    @Override
    public String toString() {
        return "Placa: " + this.placa + " Número de portas: " +  this.numeroPortas + " Preço: R$" + this.preco + " Quantidade de cilindradas: " + this.qtdCilindradas;
    }
}
