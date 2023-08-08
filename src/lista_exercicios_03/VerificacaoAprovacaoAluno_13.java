import java.util.Scanner;

public class VerificacaoAprovacaoAluno_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a primeira nota do aluno: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota do aluno: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota do aluno: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 7.0) {
                System.out.printf("Aluno aprovado! Média: %.2f%n", media);
            } else if (media >= 5.0) {
                System.out.printf("Aluno em recuperação. Média: %.2f%n", media);

                System.out.print("Deseja fazer a prova final? (sim/não): ");
                String decisao = scanner.next().toLowerCase();

                if (decisao.equals("sim")) {
                    System.out.print("Digite a nota da prova final: ");
                    double provaR = scanner.nextDouble();

                    double mediaFinal = (nota1 + nota2 + nota3 + provaR) / 4;

                    if (mediaFinal >= 5.0) {
                        System.out.printf("Aluno aprovado na prova final! Média final: %.2f%n", mediaFinal);
                    } else {
                        System.out.printf("Aluno reprovado na prova final. Média final: %.2f%n", mediaFinal);
                    }
                }
            } else {
                System.out.printf("Aluno reprovado. Média: %.2f%n", media);
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
}
