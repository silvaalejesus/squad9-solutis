

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas:");
        int quantidadePessoas = scanner.nextInt();

        ArrayList<Integer> idades = new ArrayList<>();

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = scanner.nextInt();
            idades.add(idade);
        }

        scanner.close();

        int somaIdades = 0;
        int maiorIdade = idades.get(0);
        int menorIdade = idades.get(0);
        int qtdMaiorIdade = 0;

        for (int idade : idades) {
            somaIdades += idade;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (idade >= 18) {
                qtdMaiorIdade++;
            }
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maior de idade: " + qtdMaiorIdade);
    }
}
