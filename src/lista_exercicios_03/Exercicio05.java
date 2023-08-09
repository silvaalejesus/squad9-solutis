package Lista_3;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor da divida?");
        double valor = scanner.nextDouble();

        System.out.println("Quantas parcelas ?");
        double parcelas = scanner.nextDouble();

        System.out.println("Qual o persentual dos juros? (em decimal)");
        double juros = scanner.nextDouble();

        double jurosSimples = valor * parcelas * juros;
        double valorFinal = valor + jurosSimples;

        System.out.println("Juros simples: " + jurosSimples);
        System.out.println("Valor total: " + valorFinal);

        scanner.close();
    }
}
