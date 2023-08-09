package Lista_3;

import java.util.Scanner;

//Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.

public class Exercicio04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira a nota 1");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira a nota 2");
        double nota2 = scanner.nextDouble();

        System.out.println("insira a nota 3");
        double nota3 = scanner.nextDouble();

        System.out.println("Insira a nota 4");
        double nota4 = scanner.nextDouble();

        System.out.println("Sua media é " + (nota1+nota2+nota3+nota4)/4);

        scanner.close();
    }
}
