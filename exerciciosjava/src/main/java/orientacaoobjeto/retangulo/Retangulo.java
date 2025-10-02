package main.java.orientacaoobjeto.retangulo;

class Retangulo {
    private int comprimento;
    private int largura;

    //Construtor
    public Retangulo() {
        comprimento = 1;
        largura = 1;
    }

    // getters e setters
    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if(comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        }

    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if(largura > 0 && largura < 20) {
            this.largura = largura;
        }

    }

    //metodos
    public int perimetro() {
        return (2 * (comprimento + largura));
    }

    public int area() {
        return (comprimento * largura);
    }
}
