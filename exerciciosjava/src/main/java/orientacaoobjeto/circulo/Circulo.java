package main.java.orientacaoobjeto.circulo;

class Circulo {
    private final int x;
    private final int y;
    private int raio;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }

}
