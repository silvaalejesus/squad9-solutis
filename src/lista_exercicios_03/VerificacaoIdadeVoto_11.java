import java.util.Scanner;

public class VerificacaoIdadeVoto_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a idade do cidadão: ");
            int idade = scanner.nextInt();

            if (idade < 16) {
                System.out.println("Voto não permitido. Idade inferior a 16 anos.");
            } else if (idade <= 17 || idade >= 65) {
                System.out.println("Voto facultativo. Idade entre 16 e 17 anos, ou igual ou superior a 65 anos.");
            } else {
                System.out.println("Voto obrigatório. Idade entre 18 e 64 anos.");
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite uma idade válida.");
        }

        scanner.close();
    }
}
