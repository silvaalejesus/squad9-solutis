import java.util.Scanner;

public class ContagemMaioresIdade_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int totalPessoas = 200;
        int homensMaioresIdade = 0;
        int mulheresMaioresIdade = 0;

        // For-loop no total de pessoas
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite o gênero (M/F): ");
            char genero = scanner.next().charAt(0);

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                if (genero == 'M' || genero == 'm') {
                    homensMaioresIdade++;
                } else if (genero == 'F' || genero == 'f') {
                    mulheresMaioresIdade++;
                }
            }
        }

        System.out.println("Quantidade de homens maiores de idade: " + homensMaioresIdade);
        System.out.println("Quantidade de mulheres maiores de idade: " + mulheresMaioresIdade);

        scanner.close();
    }
}
