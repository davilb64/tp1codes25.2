package herancaepolimorfismo.empresa2;

public class Classificador {
    public void ordena(Classificavel[] classificavel) {
        Classificavel elem, menor;
        int pos;
        for (int i = 0; i < classificavel.length - 1; i++) {
            elem = classificavel[i];
            menor = classificavel[i + 1];
            pos = i + 1;
            for (int j = pos; j < classificavel.length; j++) {
                if (classificavel[j].menorElemento(menor)) {
                    menor = classificavel[j];
                    pos = j;
                }
            }

            if (menor.menorElemento(elem)) {
                classificavel[i] = classificavel[pos];
                classificavel[pos] = elem;
            }
        }
    }

}
