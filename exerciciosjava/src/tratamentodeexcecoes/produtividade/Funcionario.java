package tratamentodeexcecoes.produtividade;

class Funcionario {
    private String nomeFuncionario;
    private int qtdeProducao;
    private int horasTrabalhadas;

    public Funcionario(String nomeFuncionario, int qtdeProducao, int horasTrabalhadas) {
        this.nomeFuncionario = nomeFuncionario;
        this.qtdeProducao = qtdeProducao;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularProdutividade(){
        return (double)(qtdeProducao / horasTrabalhadas);
    }
}
