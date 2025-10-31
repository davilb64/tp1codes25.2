package herancaepolimorfismo.sitesderelacionamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsoContatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>();

        boolean executando = true;

        while(executando){
            int seletor = Integer.parseInt(entrada.next());
            switch (seletor){
                case 1:
                    int tipo = Integer.parseInt(entrada.next());
                    String nome = entrada.next();
                    String apelido = entrada.next();
                    String email = entrada.next();
                    String dataNascimento = entrada.next();

                    switch (tipo){
                        case 1:
                            int grau = Integer.parseInt(entrada.next());
                            Amigo amigo = new Amigo(nome, apelido, email, dataNascimento, grau);
                            contatos.add(amigo);
                            break;
                        case 2:
                            String parentesco =  entrada.next();
                            Familia familia = new Familia(nome, apelido, email, dataNascimento, parentesco);
                            contatos.add(familia);
                            break;
                        case 3:
                            String relacionamento =  entrada.next();
                            ColegasDeTrabalho colega = new ColegasDeTrabalho(nome, apelido, email, dataNascimento, relacionamento);
                            contatos.add(colega);
                            break;
                    }
                    break;

                case 2:
                    for (Contato contato : contatos) {
                        contato.imprimirContato();
                    }
                    break;

                case 3:
                    for (Contato contato : contatos) {
                        if(contato instanceof Familia){
                            contato.imprimirContato();
                        }
                    }
                    break;

                case 4:
                    for (Contato contato : contatos) {
                        if(contato instanceof Amigo){
                            contato.imprimirContato();
                        }
                    }
                    break;

                case 5:
                    for (Contato contato : contatos) {
                        if(contato instanceof ColegasDeTrabalho){
                            contato.imprimirContato();
                        }
                    }
                    break;

                case 6:
                    for (Contato contato : contatos) {
                        if(contato instanceof Amigo){
                            if (((Amigo) contato).grau == 1){
                                contato.imprimirContato();
                            }
                        }

                        if (contato instanceof Familia){
                            if (((Familia) contato).parentesco.equals("irmão")){
                                contato.imprimirContato();
                            }
                        }

                        if (contato instanceof ColegasDeTrabalho){
                            if (((ColegasDeTrabalho) contato).tipo.equals("colega")){
                                contato.imprimirContato();
                            }
                        }
                    }
                    break;

                case 7:
                    int indice = Integer.parseInt(entrada.next());
                    contatos.get(indice - 1).imprimirContato();
                    break;

                case 8:
                    executando = false;
                    break;
            }
        }

        entrada.close();
    }
}