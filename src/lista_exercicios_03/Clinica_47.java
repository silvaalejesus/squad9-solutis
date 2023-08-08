import java.util.Scanner;

public class Clinica_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePacientes = 0;
        int somaIdadeHomens = 0;
        int mulheresAlturaPeso = 0;
        int pessoasIdade1825 = 0;
        int idadeMaisVelho = 0;
        String nomeMaisVelho = "";
        double alturaMulherMaisBaixa = Double.MAX_VALUE;
        String nomeMulherMaisBaixa = "";

        System.out.println("Informe os dados dos pacientes. Digite 'fim' para encerrar.");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            quantidadePacientes++;

            if (sexo == 'M') {
                somaIdadeHomens += idade;
            }

            if (sexo == 'F' && altura >= 1.60 && altura <= 1.70 && peso > 70) {
                mulheresAlturaPeso++;
            }

            if (idade >= 18 && idade <= 25) {
                pessoasIdade1825++;
            }

            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }

            if (sexo == 'F' && altura < alturaMulherMaisBaixa) {
                alturaMulherMaisBaixa = altura;
                nomeMulherMaisBaixa = nome;
            }
        }

        double mediaIdadeHomens = (double) somaIdadeHomens / quantidadePacientes;

        System.out.println("\nRelatório:");
        System.out.println("Quantidade de pacientes: " + quantidadePacientes);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + mulheresAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + pessoasIdade1825);
        System.out.println("Nome do paciente mais velho: " + nomeMaisVelho);
        System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);

        scanner.close();
    }
}
