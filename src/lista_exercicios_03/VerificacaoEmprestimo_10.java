import java.util.Scanner;

public class VerificacaoEmprestimo_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor do salário bruto do cliente: ");
            double salarioBruto = scanner.nextDouble();

            System.out.print("Digite o valor dos descontos do salário: ");
            double descontos = scanner.nextDouble();

            double salarioLiquido = salarioBruto - descontos;

            System.out.print("Digite o valor do empréstimo solicitado: ");
            double valorEmprestimo = scanner.nextDouble();

            double limiteEmprestimo = salarioLiquido * 0.3;

            if (valorEmprestimo <= limiteEmprestimo) {
                System.out.println("Empréstimo aprovado! O cliente pode receber o empréstimo.");
            } else {
                System.out.println("Empréstimo negado! O valor solicitado excede o limite de 30% do salário líquido.");
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite valores numéricos válidos.");
        }

        scanner.close();
    }
}
