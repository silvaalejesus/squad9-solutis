import java.util.Scanner;

public class Faesa_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de notas para cálculo da média semestral: ");
        int quantidadeNotas = scanner.nextInt();

        System.out.print("Quantidade de faltas: ");
        int faltas = scanner.nextInt();

        double somaNotas = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeNotas;

        System.out.println("Média semestral: " + media);
        System.out.println("Faltas: " + faltas);

        if (media >= 7.0 && faltas <= 15) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 3.0 && faltas <= 15) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
