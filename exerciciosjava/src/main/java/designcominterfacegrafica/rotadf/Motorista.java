package designcominterfacegrafica.rotadf;

public class Motorista {
    private final String nome;
    private final String cnh;

    public Motorista(String nome, String cnh) {
        this.cnh = cnh;
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public String getNome() {
        return nome;
    }

}
