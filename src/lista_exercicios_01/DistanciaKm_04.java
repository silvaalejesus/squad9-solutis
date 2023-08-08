/*
 * 4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
 * converte-a para quilômetros e apresenta o resultado no console.
 * (fórmula de conversão: 1 milha = 1.609 km).
 * */

import java.util.Scanner;

public class DistanciaKm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distancia em milhas para converter para km");

        double distanciaMilhas = scanner.nextDouble();
        final double KM = distanciaMilhas * 1.609;

        System.out.printf("%.0f km%n", KM);

        scanner.close();
    }
}
