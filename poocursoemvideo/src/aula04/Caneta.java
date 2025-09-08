package aula04;

public class Caneta {
    public String modelo;
    private final float ponta;
    private final boolean tampada;
    private final String cor;

    public Caneta(String cor, boolean tampada, float ponta, String modelo) {
        this.cor = cor;
        this.tampada = tampada;
        this.ponta = ponta;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }


    public String getModelo() {
        return modelo;
    }


    public float getPonta() {
        return ponta;
    }


    public boolean isTampada() {
        return tampada;
    }




    public void status(){
        System.out.println("Sobre a Caneta...");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Tampada: "+this.isTampada());
    }


}
