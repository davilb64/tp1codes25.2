package main.java.orientacaoobjeto.banco;

class Conta {
    private int senha;
    private String nome;
    private double saldo;

    //Métodos especiais

    public String getNome() {
        return nome;
    }


    public double getSaldo(int senha) {
        if (senha == this.senha) {
            return saldo;
        }
        else {
            return -1;
        }
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setNumConta() {
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }

    //Contrutor

    public Conta(int senha, String nome, double saldo) {
        this.setNumConta();
        this.setSenha(senha);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    //metodos

    public boolean sacar(double valor, int senha) {
        if (senha == this.senha) {
            if (valor > this.saldo) {
                return false;
            }
            else {
                this.setSaldo(saldo - valor);
                return true;
            }

        }
        else {
            return false;
        }
    }

    public boolean depositar(double valor, int senha) {
        if (senha == this.senha) {
            if (valor <= 0) {
                return false;
            }
            else {
                this.setSaldo(saldo + valor);
                return true;
            }

        }
        else {
            return false;
        }
    }

    public boolean transferencia(Conta conta2, double valor, int senha) {

        if (senha == this.senha) {
            if (valor > this.saldo) {
                return false;
            }
            else {
                if(this.sacar(valor, senha)){
                    conta2.setSaldo(saldo + valor);
                    return true;
                }
                else {
                    return false;
                }

            }
        }
        return false;
    }

}
