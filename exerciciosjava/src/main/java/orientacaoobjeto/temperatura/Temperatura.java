package main.java.orientacaoobjeto.temperatura;

public class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public void CelsiusToFahrenheit() {
        this.temperatura = (this.temperatura * 9.0 / 5.0 + 32);
    }
    public void FahrenheitToCelsius() {
        this.temperatura = ((this.temperatura - 32) * 5.0 / 9.0);
    }
    public String toString() {
        return String.format("%.1f", temperatura);
    }
}
