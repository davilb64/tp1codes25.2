package main.java.orientacaoobjeto.emergencia;

public class Emergencia {
    public String nomeChamador, telefoneChamador, localEmergencia, dataHoraRelato, naturezaEmergencia, tipoResposta, statusResposta, coordenadasGPS;
    public boolean chamadaMovel;

    public void mostrarEmergencias(){
        System.out.println("--- Informações da Emergência ---");
        System.out.println();
        System.out.println("Nome do Chamador: " + this.nomeChamador);
        System.out.println("Telefone: "+this.telefoneChamador);
        System.out.println("Local da Emergência: "+this.localEmergencia);
        System.out.println("Data/Hora do Relato: "+this.dataHoraRelato);
        System.out.println("Natureza da Emergência: "+this.naturezaEmergencia);
        System.out.println("Tipo de Resposta: "+this.tipoResposta);
        System.out.println("Status da Resposta: "+this.statusResposta);
        if(this.chamadaMovel){
            System.out.println("Chamada via celular: Sim");
        }
        else {
            System.out.println("Chamada via celular: Não");
        }
        if (this.chamadaMovel){
            System.out.println("Coordenadas GPS: "+this.coordenadasGPS);
        }
        System.out.println();
    }


}
