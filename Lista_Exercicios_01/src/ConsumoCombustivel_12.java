import java.util.Scanner;

public class ConsumoCombustivel_12 {
    public static void main(String[] args) {
        // Exercicio 12
        System.out.println(
                "12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto Todos os cálculos de média devem produzir resultados de ponto flutuante.");
        Scanner sc = new Scanner(System.in);

        int totalQuilometros = 0;
        int totalLitros = 0;

        while (true) {
            // Variáveis para armazenar os valores informados pelo usuário.
            int litros = 0;
            int quilometros = 0;

            // Try-catch para validar a entrada, caso o usuário digite uma string.
            try {
                System.out.print("Digite o número de litros para encher o tanque (ou -1 para sair): ");
                // Lê a entrada do usuário e converte para um valor inteiro.
                litros = Integer.parseInt(sc.nextLine());
                // Sair do loop
                if (litros == -1)
                    break;
                if (litros < 1) {
                    System.out.println(litros + " é uma entrada inválida");
                    System.exit(0);
                }

                System.out.print("Digite a distância percorrida (ou -1 para sair): ");
                quilometros = Integer.parseInt(sc.nextLine());
                if (quilometros == -1)
                    break;
                if (quilometros < 1) {
                    System.out.println(quilometros + " é uma entrada inválida");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                continue;
            }

            // Calculos de media com resultado de ponto flutuante.
            double consumo = (double) quilometros / litros;
            System.out.printf("Consumo em KM/L: %.2f\n", consumo);

            totalQuilometros += quilometros;
            totalLitros += litros;

            System.out.println("Quilometragem total: " + totalQuilometros);
            System.out.println("Total de litros de combustível consumidos: " + totalLitros);
        }

        sc.close();
    }
}
