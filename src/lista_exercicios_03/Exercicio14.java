

import java.util.Scanner;

//Receba do usuário o nome de um mês. Exiba o número equivalente.
public class Exercicio14 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        String meses[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto", "Setembro", "Outubro","Novembro","Dezembro"};

        System.out.println("Digite o numero de 1 a 12");
        int numero = scanner.nextInt();

        System.out.println("O mes "+numero+ " é " + meses[numero-1]);
    }
}
