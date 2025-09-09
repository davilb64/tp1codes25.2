package aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];

        l[0] = new Lutador("Davi","Brasil",19, 1.70f, 60.0f, 1, 19, 99);
        l[1] = new Lutador("Lucas", "Portugal", 25, 1.82f, 75.5f, 10, 2, 3);
        l[2] = new Lutador("Maria", "Espanha", 22, 1.65f, 55.0f, 7, 1, 1);
        l[3] = new Lutador("João", "Brasil", 28, 1.90f, 85.0f, 15, 3, 2);
        l[4] = new Lutador("Ana", "Canadá", 24, 1.72f, 62.3f, 8, 2, 4);
        l[5] = new Lutador("Pedro", "Japão", 30, 1.75f, 68.0f, 20, 0, 5);

        for (Lutador lutador : l) {
            lutador.apresentar();
        }
    }
}
