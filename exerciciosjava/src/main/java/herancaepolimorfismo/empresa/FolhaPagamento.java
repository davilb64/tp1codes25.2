package herancaepolimorfismo.empresa;

public class FolhaPagamento {
    public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario[] funcionarios){
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Endereço: " + cidade);
        System.out.println("Mês: "+ mes);
        System.out.println();
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: "+funcionario.getNome());
            System.out.println("Data de Nascimento: "+funcionario.getDataNascimento());
            System.out.println("Salário: R$"+funcionario.getSalario());
            if (funcionario instanceof Chefe) {
                System.out.println("Departamento: "+((Chefe) funcionario).getDepartamento());
                System.out.println("Cargo: chefe");
            }
            if (funcionario instanceof Vendedor){
                System.out.println("Cargo: vendedor");
                System.out.println("Comissão por Venda: R$"+((Vendedor) funcionario).getComissaoVenda());
                System.out.println("Número de vendas: "+((Vendedor) funcionario).getQuantidadeVendas());
            }
            if (funcionario instanceof Operario){
                System.out.println("Cargo: Operário");
                System.out.println("Valor por Produção: R$"+((Operario) funcionario).getValorProducao());
                System.out.println("Quantidade produzida: "+((Operario) funcionario).getQuantidadeProdizida());
            }
            if (funcionario instanceof Horista){
                System.out.println("Cargo: horista");
                System.out.println("Valor por Hora: R$"+((Horista) funcionario).getValorHora());
                System.out.println("Total de horas: "+((Horista) funcionario).getTotalHoras());
            }
            System.out.println();
        }
    }
}
