package _02;

public class FolhaPagamento {
    public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario[] funcionarios){
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Endereço: " + cidade);
        System.out.println("Mês: " + mes);

        for(int i=0; i<funcionarios.length; i++){
            Funcionario fun = funcionarios[i];

            System.out.println();
            System.out.println("Nome: " + fun.getNome());
            System.out.println("Data de Nascimento: " + fun.getDataNascimento());
            System.out.println("Salário: R$" + String.format("%.1f", fun.getSalario()));

            if(fun instanceof Chefe){
                Chefe fun_casting = (Chefe) fun;
                System.out.println("Departamento: " + fun_casting.getDepartamento());
                System.out.println("Cargo: chefe");
            }
            else if(fun instanceof Vendedor){
                Vendedor fun_casting = (Vendedor) fun;
                System.out.println("Cargo: vendedor");
                System.out.println("Comissão por Venda: " + String.format("R$%.1f", fun_casting.comissaoVenda));
                System.out.println("Número de vendas: " + fun_casting.quatidadeVendas);
            }
            else if(fun instanceof Operario){
                Operario fun_casting = (Operario) fun;
                System.out.println("Cargo: Operário");
                System.out.println("Valor por Produção: " + String.format("R$%.1f", fun_casting.getValorProducao()));
                System.out.println("Quantidade produzida: " + fun_casting.getQuantidadeProduzida());
            }
            else if(fun instanceof Horista){
                Horista fun_casting = (Horista) fun;
                System.out.println("Cargo: horista");
                System.out.println("Valor por Hora: " + String.format("R$%.1f", fun_casting.getValorHora()));
                System.out.println("Total de horas: " + fun_casting.getTotalHoras());
            }
        }
    }
}






//Classe principal
