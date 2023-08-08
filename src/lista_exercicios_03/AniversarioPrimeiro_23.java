import java.util.Scanner;

public class AniversarioPrimeiro_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validando o input do usuário.
        try {
            System.out.print("Digite o nome da primeira pessoa: ");
            String nome1 = scanner.nextLine();

            System.out.print("Digite o dia de nascimento de " + nome1 + ": ");
            int dia1 = scanner.nextInt();

            System.out.print("Digite o mês de nascimento de " + nome1 + ": ");
            int mes1 = scanner.nextInt();

            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Digite o nome da segunda pessoa: ");
            String nome2 = scanner.nextLine();

            System.out.print("Digite o dia de nascimento de " + nome2 + ": ");
            int dia2 = scanner.nextInt();

            System.out.print("Digite o mês de nascimento de " + nome2 + ": ");
            int mes2 = scanner.nextInt();

            if (mes1 < mes2 || (mes1 == mes2 && dia1 <= dia2)) {
                System.out.println("O primeiro aniversariante é: " + nome1);
            } else {
                System.out.println("O primeiro aniversariante é: " + nome2);
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite valores válidos.");
        }

        scanner.close();
    }
}
