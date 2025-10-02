package designcominterfacegrafica.rotadf;

public class Chamado {
    private static int contadorChamados = 100;
    private final int codigoChamado;
    private final TipoChamado tipo;
    private final String data;
    private final String origem;
    private final String destino;
    private final String horaPartida;
    private String horaChegada;
    private final double kmInicial;
    private double kmFinal;

    //relacionamentos
    private final Cliente cliente;
    private Motorista motorista;
    private final Veiculo veiculo;

    //construtor finalizado
    public Chamado(TipoChamado tipo, String data, String origem, String destino, String horaPartida, String horaChegada, double kmInicial, double kmFinal, Veiculo veiculo, Motorista motorista, Cliente cliente) {
        this.codigoChamado = contadorChamados++;
        this.tipo = tipo;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.cliente = cliente;
        this.motorista = motorista;
        this.veiculo = veiculo;
    }
    //construtor em andamento
    public Chamado(TipoChamado tipo, String data, String origem, String destino, String horaPartida, double kmInicial, Veiculo veiculo, Motorista motorista, Cliente cliente) {
        this.codigoChamado = contadorChamados++;
        this.tipo = tipo;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.kmInicial = kmInicial;
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.cliente = cliente;
    }

    //métodos
    public void finalizarChamado(String horaChegada, double kmFinal){
        this.horaChegada = horaChegada;
        this.kmFinal = kmFinal;
    }

    private boolean isFinalizado(){
        return this.horaChegada != null || this.kmFinal != 0;
    }

    private double calcularDistancia(){
        return this.kmFinal - this.kmInicial;
    }

    private double calcularValorTotal(){
        double valorTotal;
        if (this.tipo == TipoChamado.VIAGEM){
            valorTotal = this.calcularDistancia() * 6.51;
        }
        else {
            valorTotal = this.calcularDistancia() * 3.59;
        }
        return valorTotal;
    }

    public void mostrarChamado(){
        System.out.println("Chamado: "+this.codigoChamado);
        System.out.println("Data: "+this.data);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Cliente: "+this.cliente.getNome()+" (CPF: "+this.cliente.getCpf()+")");
        System.out.println("Motorista: "+this.motorista.getNome()+" (CNH: "+this.motorista.getCnh()+")");
        System.out.println("Veículo: "+this.veiculo.getModelo()+" (Placa: "+this.veiculo.getPlaca()+")");
        System.out.println("Origem: "+this.origem);
        System.out.println("Destino: "+this.destino);
        System.out.println("Partida: "+this.horaPartida);
        if(this.isFinalizado()){
            System.out.println("Chegada: "+this.horaChegada);
            System.out.printf("Distância: %.1f km\n",this.calcularDistancia());
            System.out.printf("Valor total: R$ %.2f\n",this.calcularValorTotal());
        }
        else {
            System.out.println("Chegada: Aguardando finalização...");
        }
    }

    //set e get

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

}
