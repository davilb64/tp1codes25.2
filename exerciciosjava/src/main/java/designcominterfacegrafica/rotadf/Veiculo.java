package designcominterfacegrafica.rotadf;

public class Veiculo {
    private final String modelo;
    private final String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Placa: " + placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

}
