package herancaepolimorfismo.empresa;

public class Vendedor extends Funcionario {
    private float comissaoVenda;
    private int quantidadeVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int quantidadeVendas) {
        super(nome, dataNascimento, salario + comissaoVenda * quantidadeVendas);
        this.comissaoVenda = comissaoVenda;
        this.quantidadeVendas = quantidadeVendas;
    }

    public float getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(float comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
}
