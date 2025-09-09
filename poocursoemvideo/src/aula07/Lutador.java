package aula07;

public class Lutador implements InterfaceLutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    //métodos especiais

    public Lutador (String nome, String nacionalidade, int idade, double altura, double peso, int  vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (peso < 52.2){
            this.categoria = "Inválido";
        }
        else if (peso <= 70.3){
            this.categoria = "Leve";
        }
        else if (peso <= 83.9){
            this.categoria = "Médio";
        }
        else if (peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodos abstratos

    @Override
    public void apresentar() {
        System.out.println("-------------------");
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("País: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.printf("Altura: %.2f\n",this.getAltura());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("--------------------");
    }

    @Override
    public void status() {
        System.out.println(getNome() + " é um peso " + getPeso() + " com altura " + getAltura());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getEmpates() + " Empates");
        System.out.println(getDerrotas() + " Derrotas");
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }



}
