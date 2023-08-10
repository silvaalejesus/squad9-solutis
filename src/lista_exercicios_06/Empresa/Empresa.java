package lista_exercicios_06.Empresa;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                funcionarios[i] = new FuncionarioGraduacao("Pedro", 30, "Escola Pedro", "Universidade Thiago");
            } else if (i < 8) {
                funcionarios[i] = new FuncionarioEnsinoMedio("Maria", 20, "Escola Pedro");
            } else {
                funcionarios[i] = new FuncionarioEnsinoBasico("Carlos", 10, "Escola Pedro");
            }
        }

        System.out.println("12");

        double totalSalarios = 0;
        double totalSalariosBasico = 0;
        double totalSalariosMedio = 0;
        double totalSalariosSuperior = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            totalSalarios += salario;

            if (funcionario instanceof FuncionarioGraduacao) {
                totalSalariosSuperior += salario;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                totalSalariosMedio += salario;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                totalSalariosBasico += salario;
            }
        }

        System.out.println("Custo total com salários: " + totalSalarios);
        System.out.println("Custo total com salários de funcionários de ensino básico: " + totalSalariosBasico);
        System.out.println("Custo total com salários de funcionários de ensino médio: " + totalSalariosMedio);
        System.out.println("Custo total com salários de funcionários de nível superior: " + totalSalariosSuperior);
    }
}
