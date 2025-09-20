package tratamentodeexcecoes.validacaodeposito;

class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private double LIMITE_DEPOSITO = 10000;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }

    //getters

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void depositoPersonalizado(double valor) {
        if (valor <= 0){
            throw new DepositoInvalidoException("Valor inválido para depósito.");
        } else if (valor > LIMITE_DEPOSITO) {
            throw new DepositoInvalidoException("Valor acima do limite permitido de 100000.00");
        }
        else{
            saldo += valor;
        }

    }
}
