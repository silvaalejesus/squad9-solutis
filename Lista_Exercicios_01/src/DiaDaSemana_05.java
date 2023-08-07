/*5. Faça um programa que solicite ao usuário um número de 1 a 7,
e imprima na tela o dia da semana correspondente.
Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante.
Utilizando Array.*/

import java.util.Scanner;

public class DiaDaSemana_05 {
    public static void main(String[] args) {
        String[] diasDaSemana = {
                "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 7");
        int dia = scanner.nextInt();

        for (int i = 0; i < diasDaSemana.length; i++) {
            if (dia == i + 1) {
                System.out.println(diasDaSemana[i]);
            }
        }
        scanner.close();

    }
}
