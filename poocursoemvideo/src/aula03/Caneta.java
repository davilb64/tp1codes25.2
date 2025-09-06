package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
        System.out.print("\n");
    }

    private void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar");
        }
        else{
            System.out.println("Rabiscando!");
        }
    }

    protected void tampar(){

        this.tampada = true;
    }

    protected void destampar(){

        this.tampada = false;
    }
}
