package lista_exercicios_06.Empresa;

public class Empresa_2 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 10; i++) {
            if (i < 1) {
                funcionarios[i] = new FuncionarioGraduacao("Pedro", 30, "Escola 1", "Escola", new Gerente());
            } else if (i < 2) {
                funcionarios[i] = new FuncionarioEnsinoMedio("Maria", 20, "Escola Pedro", new Supervisor());
            } else {
                funcionarios[i] = new FuncionarioEnsinoBasico("Carlos", 10, "Escola Pedro", new Vendedor());
            }
        }

        double totalSalarios = 0;
        double totalSalariosGerente = 0;
        double totalSalariosSupervisor = 0;
        double totalSalariosVendedor = 0;

        System.out.println("-".repeat(100));

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
            double salario = funcionario.calcularSalario();
            totalSalarios += salario;

            if (funcionario.getComissao() instanceof Vendedor) {
                totalSalariosVendedor += salario;
            } else if (funcionario.getComissao() instanceof Supervisor) {
                totalSalariosSupervisor += salario;
            } else if (funcionario.getComissao() instanceof Gerente) {
                totalSalariosGerente += salario;
            }
        }

        System.out.println("-".repeat(100));

        System.out.println("Custo total com salários: " + totalSalarios);
        System.out.println("Custo total com salários dos Gerentes: " + totalSalariosGerente);
        System.out.println("Custo total com salários dos Supervisores: " + totalSalariosSupervisor);
        System.out.println("Custo total com salários dos Vendendores: " + totalSalariosVendedor);

        System.out.println("-".repeat(100));
    }
}
