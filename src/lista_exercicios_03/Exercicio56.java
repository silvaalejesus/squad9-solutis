

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] candidatos = new String[3];
        int[] votos = new int[3];
        int totalVotos = 0;
        int votosEmBranco = 0;

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Digite o nome do candidato " + (i + 1) + ":");
            candidatos[i] = scanner.nextLine();
        }

        System.out.println("Digite o número do candidato (1, 2, 3) ou 0 para voto em branco:");
        int voto = scanner.nextInt();

        while (voto >= 0 && voto <= candidatos.length) {
            if (voto == 0) {
                votosEmBranco++;
            } else {
                votos[voto - 1]++;
                totalVotos++;
            }

            System.out.println("Digite o próximo voto (ou um número invalido para encerrar):");
            voto = scanner.nextInt();
        }

        scanner.close();

        System.out.println("Resultado da eleição:");

        for (int i = 0; i < candidatos.length; i++) {
            double percentual = (double) votos[i] / totalVotos * 100;
            System.out.println("Candidato " + candidatos[i] + ": " + votos[i] + " votos (" + percentual + "%)");
        }

        double percentualBranco = (double) votosEmBranco / totalVotos * 100;
        System.out.println("Votos em branco: " + votosEmBranco + " votos (" + percentualBranco + "%)");

        int maiorVotos = votos[0];
        int indiceGanhador = 0;

        for (int i = 1; i < candidatos.length; i++) {
            if (votos[i] > maiorVotos) {
                maiorVotos = votos[i];
                indiceGanhador = i;
            }
        }

        System.out.println("Ganhador: " + candidatos[indiceGanhador]);
    }
}
