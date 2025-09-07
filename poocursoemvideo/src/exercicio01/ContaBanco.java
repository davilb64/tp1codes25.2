package exercicio01;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    private static int numContaAtual = 0;

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirConta() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Aberta? " + this.isStatus());
        System.out.println();
    }

    public void abrirConta(String tipo, String dono) {
        if (tipo.equals("CC")) {
            this.setTipo("CC");
            this.setStatus(true);
            this.setDono(dono);
            this.setSaldo(50);
            this.setNumConta(numContaAtual++);
            this.exibirConta();
        }
        else if (tipo.equals("CP")) {
            this.setTipo("CP");
            this.setStatus(true);
            this.setDono(dono);
            this.setSaldo(150);
            this.setNumConta(numContaAtual++);
            this.exibirConta();
        }
    }

    public void fecharConta() {
        if (this.getSaldo() != 0) {
            System.out.println("Conta com saldo acima de R$0,00!");
            System.out.println();
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada!");
            System.out.println();
        }
    }

    public void depositar(double deposito) {
        this.setSaldo(this.getSaldo() + deposito);
        System.out.println("Depósito realizado!");
        System.out.println("Saldo atual: " + this.getSaldo());
        System.out.println();
    }

    public void sacar(double saque) {
        if (saque > this.getSaldo()) {
            System.out.println("Saldo insuficiente!");
            System.out.println();
        }
        else {
            this.setSaldo(this.getSaldo() - saque);
        }
        System.out.println("Saque realizado!");
        System.out.println("Saldo atual: " + this.getSaldo());
        System.out.println();
    }

    public void pagarMensal() {
        if (this.getTipo().equals("CC")) {
            this.setSaldo(this.getSaldo() - 12);
        }
        else if (this.getTipo().equals("CP")) {
            this.setSaldo(this.getSaldo() - 20);
        }
    }




}
