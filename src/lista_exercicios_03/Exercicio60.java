package Lista_3;

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da divida:");
        double valorDivida = scanner.nextDouble();

        System.out.println("Digite a taxa de correção :");
        double taxaCorrecao = scanner.nextDouble() / 100.0;

        System.out.println("Digite a quantidade de anos:");
        int quantidadeAnos = scanner.nextInt();

        scanner.close();

        System.out.println("Ano\tMês\tValor da Dívida");

        int mesesPorAno = 12;

        for (int ano = 2007; ano <= 2007 + quantidadeAnos; ano++) {
            for (int mes = 1; mes <= mesesPorAno; mes++) {
                double valorCorrigido = valorDivida * Math.pow(1 + taxaCorrecao, ano * mesesPorAno + mes);
                System.out.printf("%d\t%d\t%.2f%n", ano, mes, valorCorrigido);
            }
        }
    }
}
