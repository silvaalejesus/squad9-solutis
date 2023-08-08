import java.util.Random;
import java.util.Scanner;

public class Adivinha_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numSort = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 a 100.");

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numSort) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numSort) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (palpite != numSort);

        scanner.close();
    }
}

