package herancaepolimorfismo.sitesderelacionamento;

public class ColegasDeTrabalho extends Contato{
    protected String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }


    @Override
    public void imprimirContato() {
        System.out.println(imprimirBasico());
        System.out.println("Relacionamento de trabalho: "+this.tipo);
    }
}
