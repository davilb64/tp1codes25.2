package herancaepolimorfismo.sitesderelacionamento;

public class Amigo extends Contato{
    protected int grau;

    //construtor

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public void imprimirContato(){
        System.out.println(imprimirBasico());
        if (this.grau == 1){
            System.out.println("Grau: Melhor Amigo");
        }
        if (this.grau == 2){
            System.out.println("Grau: Amigo");
        }
        if (this.grau == 3){
            System.out.println("Grau: Conhecido");
        }

    }
}
